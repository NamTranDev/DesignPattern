package nam.tran.observer1

class Mailer : ObserverUser{

    override fun update(user: User) {
        if (user.status == LoginStatus.EXPIRED) {
            println("Mailer: User " + user.email + " is expired. An email was sent!");
        }
    }
}