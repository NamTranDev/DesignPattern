package nam.tran.command

class LightOffCommand constructor(val light: Light) : Command {

    override fun excute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}