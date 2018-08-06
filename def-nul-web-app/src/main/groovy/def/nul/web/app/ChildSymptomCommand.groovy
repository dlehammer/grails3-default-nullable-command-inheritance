package def.nul.web.app

class ChildSymptomCommand extends ParentCommand {

    // Removing the constraints-block eliminates the symptom...
    // Note: the below approach worked in Grails 2
    static constraints = {
        importFrom ParentCommand
    }

}
