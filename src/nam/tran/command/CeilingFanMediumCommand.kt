package nam.tran.command

class CeilingFanMediumCommand constructor(val cellingFan: CeilingFan) : Command {

    var prevSpeed: CeilingFanLevel? = null

    override fun excute() {
        prevSpeed = cellingFan.speed
        cellingFan.medium()
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