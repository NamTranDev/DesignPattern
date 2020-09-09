package nam.tran.template

abstract class CaffeinBeverage {

    fun prepareRecipe(){
        boilWater()
        brew()
        pourInCup()
        if (customerWantsCondiment()){
            addCondiment()
        }
    }

    abstract fun brew()
    abstract fun addCondiment()

    fun boilWater(){
        println("Boiling water")
    }

    fun pourInCup(){
        println("Pouring into cup")
    }

    open fun customerWantsCondiment(): Boolean {
        return true
    }
}