package nam.tran.observe

class StatisticDisplay constructor(val subject: Subject): Observer,DisplayElement {

    private var temperature : Float = 0F
    private var humidity : Float = 0F

    init {
        subject.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }

    override fun display() {
       println("Current conditions: ${temperature}F degrees and ${humidity}% humidity")
    }
}