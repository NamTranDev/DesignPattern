package nam.tran.observe

interface Subject {
    fun registerObserver(o : Observer)
    fun removeObserver(o : Observer)
    fun notifyObservers()
}