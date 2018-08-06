package def.nul.web.app

import grails.validation.Validateable

class ParentCommand implements Validateable {

    static boolean defaultNullable() { true }

    String parentField1

    String parentField2

    String parentField3

    MyEnum enumVal

    static constraints = {
        // some custom validation
        enumVal(nullable: true, validator: { val, obj, errors ->
            if (!obj.enumVal) {
                obj.parentField3 = 'some custom state'
            }
        })
    }

}
