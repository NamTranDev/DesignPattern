package nam.tran.command1

class BankControl {


    private var openCommand: CommandBank? = null
    private var closeCommand: CommandBank? = null

    fun setAction(open: CommandBank, close: CommandBank) {
        openCommand = open
        closeCommand = close
    }

    fun clickOpenAccount() {
        openCommand?.excute()
    }

    fun clickCloseAccount() {
        closeCommand?.excute()
    }
}