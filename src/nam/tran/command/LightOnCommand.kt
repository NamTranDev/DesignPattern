package nam.tran.command

class LightOnCommand constructor(val light : Light) : Command{

    override fun excute() {
        light.on()
    }
}