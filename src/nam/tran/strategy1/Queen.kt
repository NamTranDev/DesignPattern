package nam.tran.strategy1

class Queen : Character() {

    override var weapon: WeaponBehavior = KnifeBehavior()

    override fun display() {
        println("I am a Queen")
    }
}