package nam.tran.command1

class CloseAccountCommand constructor(private val account : Account) : CommandBank{

    override fun excute() {
        account.close()
    }
}