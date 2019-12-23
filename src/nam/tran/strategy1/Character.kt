package nam.tran.strategy1

abstract class Character {

    open lateinit var weapon : WeaponBehavior

    fun fight(){
        weapon.useWeapon()
    }

    abstract fun display()
}