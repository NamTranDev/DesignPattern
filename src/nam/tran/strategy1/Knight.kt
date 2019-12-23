package nam.tran.strategy1

class Knight : Character(){

    override var weapon: WeaponBehavior = AxeBehavior()

    override fun display() {
        println("I am a Knight")
    }
}