package nam.tran.strategy1

class King : Character() {

    override var weapon: WeaponBehavior = SwordBehavior()

    override fun display() {
        println("I am a King")
    }
}