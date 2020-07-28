package nam.tran.command

class RemoteControl constructor() {

    private var onCommand = mutableListOf<Command>()
    private var offCommand = mutableListOf<Command>()

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        this.onCommand.add(slot,onCommand)
        this.offCommand.add(slot,offCommand)
    }

    fun onPress(slot: Int) {
        onCommand[slot].excute()
    }

    fun offPress(slot: Int) {
        offCommand[slot].excute()
    }

    override fun toString(): String {
        val result = StringBuffer()
        result.append("----- Remote Control -----\n")
        for (i in onCommand.indices) {
            result.append("[slot $i] ${onCommand[i].javaClass.name} - ${offCommand[i].javaClass.name}\n")
        }
        return result.toString()
    }
}