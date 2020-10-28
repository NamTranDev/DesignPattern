package nam.tran.state

class SoldOutQuarterState constructor(private val gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("You can't insert another a quarter")
    }

    override fun ejectQuarter() {
        println("You can't eject, you haven't inserted a quarter yet")
    }

    override fun turnCrank() {
        println("There are no gumball")
    }

    override fun despense() {
        println("No gumball dispense")
    }

}