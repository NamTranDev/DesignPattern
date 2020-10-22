package nam.tran.state

class GumballMachine constructor(count: Int) {

    companion object {
        const val SOLD_OUT = 0
        const val NO_QUARTER = 1
        const val HAS_QUARTER = 2
        const val SOLD = 3
    }

    var state = SOLD_OUT
    var count = 0

    init {
        this.count = count
        if (count > 0)
            state = NO_QUARTER
    }

    fun insertQuarter() {
        when (state) {
            SOLD_OUT -> {
                println("You can't insert another quarter")
            }
            NO_QUARTER -> {
                state = HAS_QUARTER
                println("You inserted a quarter")
            }
            HAS_QUARTER -> {
                println("You can't insert a quarter, the machine is sold out")
            }
            SOLD -> {
                println("Please wait, we're already giving you a gumball")
            }
        }
    }

    fun ejectQuarter() {
        when (state) {
            SOLD_OUT -> {
                println("You can't eject, you haven't inserted a quarter yet")
            }
            NO_QUARTER -> {
                println("You haven't inserted a quarter")
            }
            HAS_QUARTER -> {
                println("Quarter returned")
                state = NO_QUARTER
            }
            SOLD -> {
                println("Sorry, you already turned the crank")
            }
        }
    }

    fun turnCrank() {
        when (state) {
            SOLD_OUT -> {
                println("You turned, but there are no quarter")
            }
            NO_QUARTER -> {
                println("You turned but there's no quarter")
            }
            HAS_QUARTER -> {
                println("You turned...")
                state = SOLD
                dispense()
            }
            SOLD -> {
                println("Turning twice doesn't get you another gumball")
            }
        }
    }

    fun dispense() {
        when (state) {
            SOLD_OUT -> {
                println("No gumball dispensed")
            }
            NO_QUARTER -> {
                println("You need to pay first")
            }
            HAS_QUARTER -> {
                println("No gumball dispensed")
            }
            SOLD -> {
                println("A gumball comes rolling out the slot")
                count -= 1
                state = if (count == 0) {
                    println("Oops, out of gumball")
                    SOLD_OUT
                } else {
                    NO_QUARTER
                }
            }
        }
    }

    override fun toString(): String {
        return "Mighty Gumball, Inc \nJava-enable Standing Gumball Model #2004 \nInventory: $count gumballs \n${if (count == 0) "Machine is sold out" else "Machine is waiting for quarter"}"
    }
}