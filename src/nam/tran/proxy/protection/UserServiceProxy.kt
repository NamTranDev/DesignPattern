package nam.tran.proxy.protection

class UserServiceProxy constructor(name : String, private val role : String): UserService{

    private val userService = UserServiceImpl(name)

    override fun load() {
        userService.load()
    }

    override fun insert() {
        if (isAdmin()) {
            userService.insert();
        } else {
            throw IllegalAccessError("Access denied");
        }
    }

    private fun isAdmin(): Boolean {
        return "admin".equals(role, ignoreCase = true)
    }

}