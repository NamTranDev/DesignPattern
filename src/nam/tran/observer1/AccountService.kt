package nam.tran.observer1

class AccountService constructor(private val email: String, private val ip: String) : SubjectUser {

    private val listObserverUser = arrayListOf<ObserverUser>()
    var mUser: User = User(email, ip)

    override fun attach(observer: ObserverUser) {
        listObserverUser.add(observer)
    }

    override fun detact(observer: ObserverUser) {
        listObserverUser.remove(observer)
    }

    override fun notifyAllObserver() {
        for (observerUser in listObserverUser) {
            observerUser.update(mUser)
        }
    }

    fun changeStatus(status: LoginStatus) {
        mUser.status = status
        println("Status is changed")
        notifyAllObserver()
    }

    fun login() {
        if (!isValidIP()) {
            mUser.status = LoginStatus.INVALID
        } else if (isValidEmail()) {
            mUser.status = LoginStatus.SUCCESS
        } else {
            mUser.status = LoginStatus.FAILURE
        }
        println("Login is handled")
        notifyAllObserver()
    }

    private fun isValidIP(): Boolean {
        return "127.0.0.1" == mUser.ip
    }

    private fun isValidEmail(): Boolean {
        return "namtran09061992@gmail.com".equals(mUser.email, ignoreCase = true)
    }
}