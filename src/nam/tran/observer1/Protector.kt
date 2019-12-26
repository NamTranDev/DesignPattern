package nam.tran.observer1

class Protector : ObserverUser {
    override fun update(user: User) {
        if (user.status == LoginStatus.INVALID) {
            println("Protector: User " + user.email + " is invalid. "
                    + "IP " + user.ip + " is blocked");
        }
    }
}