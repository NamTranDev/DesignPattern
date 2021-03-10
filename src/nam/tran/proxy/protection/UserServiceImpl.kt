package nam.tran.proxy.protection

class UserServiceImpl constructor(private val name : String): UserService{
    override fun load() {
        println("$name loaded")
    }

    override fun insert() {
        println("$name inserted")
    }

}