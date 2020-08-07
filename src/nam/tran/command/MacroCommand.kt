package nam.tran.command

class MacroCommand constructor(private val commands: Array<Command>) : Command {
    override fun excute() {
        commands.forEach {
            it.excute()
        }
    }

    override fun undo() {
        commands.forEach {
            it.undo()
        }
    }
}