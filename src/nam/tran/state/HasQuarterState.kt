package nam.tran.state

class HasQuarterState constructor(private val gumballMachine: GumballMachine): State{
    override fun insertQuarter() {
        println("You can't insert a quarter, the machine is sold out")
    }

    override fun ejectQuarter() {
        println("Quarter returned")
        gumballMachine.state = gumballMachine.noQuarterState
    }

    override fun turnCrank() {
        println("You turned ...")
        gumballMachine.state = gumballMachine.soldQuarterState
    }

    override fun despense() {
        println("No gumball dispense")
    }

}