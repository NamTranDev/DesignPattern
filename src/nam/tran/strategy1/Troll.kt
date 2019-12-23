package nam.tran.strategy1

class Troll : Character() {

    override var weapon: WeaponBehavior = BowAndArrowBehavior()

    override fun display() {
        println("I am a Troll")
    }
}