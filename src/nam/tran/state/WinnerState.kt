package nam.tran.state

class WinnerState constructor(private val gumballMachine: GumballMachine) : State {

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
        println("YOU'RE A WINNER! You have got two gumballs for your quarter")
        gumballMachine.release()
        if (gumballMachine.count == 0){
            gumballMachine.state = gumballMachine.soldOutQuarterState
        }else{
            gumballMachine.release(true)
            if (gumballMachine.count > 0){
                gumballMachine.state = gumballMachine.noQuarterState
            }else{
                println("Oops, out of gumballs!")
                gumballMachine.state = gumballMachine.soldOutQuarterState
            }
        }
    }

}