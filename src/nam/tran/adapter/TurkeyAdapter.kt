package nam.tran.adapter

class TurkeyAdapter constructor(private val turkey: Turkey) : Duck {

    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        for (i in 0..5) {
            turkey.fly()
        }
    }
}