package nam.tran.command

class CeilingFanOffCommand constructor(val cellingFan: CeilingFan) : Command{

    override fun excute() {
        cellingFan.off()
    }

    override fun undo() {

    }
}