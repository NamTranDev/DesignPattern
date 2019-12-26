package nam.tran.observer1

interface SubjectUser {
    fun attach(observer : ObserverUser)
    fun detact(observer : ObserverUser)
    fun notifyAllObserver()
}