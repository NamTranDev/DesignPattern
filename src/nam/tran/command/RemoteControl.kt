package nam.tran.command

class RemoteControl {

    private var onCommand = arrayOf<Command>(NoCommand(),NoCommand(),NoCommand(),NoCommand(),NoCommand(),NoCommand(),NoCommand())
    private var offCommand = arrayOf<Command>(NoCommand(),NoCommand(),NoCommand(),NoCommand(),NoCommand(),NoCommand(),NoCommand())
    private var undoCommand : Command = NoCommand()

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        this.onCommand[slot] = onCommand
        this.offCommand[slot] = offCommand
    }

    fun onPress(slot: Int) {
        onCommand[slot].excute()
        undoCommand = onCommand[slot]
    }

    fun offPress(slot: Int) {
        offCommand[slot].excute()
        undoCommand = offCommand[slot]
    }

    fun undoPress(){
        undoCommand.undo()
    }

    override fun toString(): String {
        val result = StringBuffer()
        result.append("----- Remote Control -----\n")
        for (i in onCommand.indices) {
            result.append("[slot $i] ${onCommand[i].javaClass.name} - ${offCommand[i].javaClass.name}\n")
        }
        result.append("undo Command - ${undoCommand.javaClass.name}")
        return result.toString()
    }
}