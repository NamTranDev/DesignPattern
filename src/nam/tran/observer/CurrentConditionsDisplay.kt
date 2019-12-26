package nam.tran.observer

class CurrentConditionsDisplay constructor(subject: Subject): Observer,DisplayElement {

    private var temperature : Float = 0F
    private var humidity : Float = 0F
    private var pressure : Float = 0F

    init {
        subject.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}