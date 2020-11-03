package nam.tran.state

import java.util.*

class HasQuarterState constructor(private val gumballMachine: GumballMachine) : State {

    val randomWinner = Random(System.currentTimeMillis())

    override fun insertQuarter() {
        println("You can't insert a quarter, the machine is sold out")
    }

    override fun ejectQuarter() {
        println("Quarter returned")
        gumballMachine.state = gumballMachine.noQuarterState
    }

    override fun turnCrank() {
        println("You turned ...")
        val winner = randomWinner.nextInt(3)
        if (winner == 0 && gumballMachine.count > 1) {
            gumballMachine.state = gumballMachine.winnerState
        } else {
            gumballMachine.state = gumballMachine.soldQuarterState
        }
    }

    override fun despense() {
        println("No gumball dispense")
    }

}