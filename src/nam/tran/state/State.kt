package nam.tran.state

interface State {
    fun insertQuarter()
    fun ejectQuarter()
    fun turnCrank()
    fun despense()
}