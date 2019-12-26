package nam.tran.observer

class WeatherData : Subject {

    private val listObserver = arrayListOf<Observer>()
    private var temperature : Float = 0F
    private var humidity : Float = 0F
    private var pressure : Float = 0F

    override fun registerObserver(o: Observer) {
        listObserver.add(o)
    }

    override fun removeObserver(o: Observer) {
        listObserver.remove(o)
    }

    override fun notifyObservers() {
        for (obser in listObserver){
            obser.update(temperature,humidity,pressure)
        }
    }

    fun setMeasurements(temp: Float, humidity: Float, pressure: Float){
        this.temperature = temp
        this.humidity = humidity
        this.pressure = pressure
        notifyObservers()
    }
}