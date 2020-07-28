package nam.tran.command

class CeilingFanOnCommand constructor(val cellingFan: CeilingFan) : Command{

    override fun excute() {
        cellingFan.on()
    }
}