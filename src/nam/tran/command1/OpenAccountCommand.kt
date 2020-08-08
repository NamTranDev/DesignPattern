package nam.tran.command1

class OpenAccountCommand constructor(private val account : Account) : CommandBank{

    override fun excute() {
        account.open()
    }
}