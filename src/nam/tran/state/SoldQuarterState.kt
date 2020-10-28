package nam.tran.state

class SoldQuarterState constructor(private val gumballMachine: GumballMachine): State{
    override fun insertQuarter() {
        println("You can't insert another quarter")
    }

    override fun ejectQuarter() {
        println("You can't eject , you haven't inserted a quarter yet")
    }

    override fun turnCrank() {
        println("Turning twice doesn't yet you another gumball")
    }

    override fun despense() {
        gumballMachine.release()
        if (gumballMachine.count > 0)
            gumballMachine.state = gumballMachine.noQuarterState
        else
            gumballMachine.state = gumballMachine.soldOutQuarterState
    }

}