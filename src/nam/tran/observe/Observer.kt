package nam.tran.observe

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}