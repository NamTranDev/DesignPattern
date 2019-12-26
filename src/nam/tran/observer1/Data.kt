package nam.tran.observer1

data class User(val email : String, val ip : String, var status: LoginStatus = LoginStatus.FAILURE){
    override fun toString(): String {
        return "User(email='$email', ip='$ip', status=$status)"
    }
}

enum class LoginStatus {
    SUCCESS, FAILURE, INVALID, EXPIRED
}