package nam.tran.observe

class ForecastDisplay constructor(subject: Subject): Observer,DisplayElement {

    private var currentPressure = 29.92f
    private var lastPressure = 0f

    init {
        subject.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.lastPressure = temp
        currentPressure = pressure;
        display()
    }

    override fun display() {
        print("Forecast: ");
        when {
            currentPressure > lastPressure -> {
                println("Improving weather on the way!");
            }
            currentPressure == lastPressure -> {
                println("More of the same");
            }
            currentPressure < lastPressure -> {
                println("Watch out for cooler, rainy weather");
            }
        }
    }
}