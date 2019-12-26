package nam.tran.observer1

class Logger : ObserverUser{

    override fun update(user: User) {
        println("Logger : $user")
    }
}