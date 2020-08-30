package nam.tran.adapter

class WildTurkey : Turkey{

    override fun gobble() {
        println("Gobble gobble")
    }

    override fun fly() {
        println("Flying a short distance")
    }
}