package nam.tran.state

class GumballMachine constructor(count: Int) {

    var noQuarterState = NoQuarterState(this)
    var hasQuarterState = HasQuarterState(this)
    var soldQuarterState = SoldQuarterState(this)
    var soldOutQuarterState = SoldOutQuarterState(this)
    var winnerState = WinnerState(this)

    var state : State = soldOutQuarterState
    var count = 0

    init {
        this.count = count
        if (count > 0)
            state = noQuarterState
    }

    fun insertQuarter(){
        state.insertQuarter()
    }

    fun ejectQuarter(){
        state.ejectQuarter()
    }

    fun turnCrank(){
        state.turnCrank()
        state.despense()
    }

    fun release(isWinner : Boolean = false){
        println("A gumball comes rolling out the slot ...")
        if (count != 0 && !isWinner)
            count --
    }

    override fun toString(): String {
        return "Mighty Gumball, Inc \nJava-enable Standing Gumball Model #2004 \nInventory: $count gumballs \n${if (count == 0) "Machine is sold out" else "Machine is waiting for quarter"}"
    }
}