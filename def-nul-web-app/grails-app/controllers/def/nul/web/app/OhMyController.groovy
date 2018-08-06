package def.nul.web.app

class OhMyController {

    def index() {
        redirect(action: "showSymptom", params: [enumVal: "VAL_2"])
    }

    def showSymptom(ChildSymptomCommand childCommand) {
        showCommandErrors(childCommand)
    }

    def noSymptom(ChildCommand childCommand) {
        showCommandErrors(childCommand)
    }

    private def showCommandErrors(ParentCommand command) {
        render(view: 'index', model: [command: command])
    }

}
