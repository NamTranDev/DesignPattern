package nam.tran.command

class CeilingFanLowCommand constructor(val cellingFan: CeilingFan) : Command {

    var prevSpeed: CeilingFanLevel? = null

    override fun excute() {
        prevSpeed = cellingFan.speed
        cellingFan.low()
    }

    override fun undo() {
        when (prevSpeed) {
            CeilingFanLevel.HIGH -> {
                cellingFan.high()
            }
            CeilingFanLevel.MEDIUM -> {
                cellingFan.medium()
            }
            CeilingFanLevel.LOW -> {
                cellingFan.low()
            }
            CeilingFanLevel.OFF -> {
                cellingFan.off()
            }
            null -> {
                println("No interact ceiling fan")
            }
        }
    }
}