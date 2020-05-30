package nam.tran.factory._abstract

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory{
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createVeigges(): Array<Veigges> {
        return arrayOf(Spinach(),BlackOlives(),Mozzarella(),EggPlant())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClams(): Clams {
        return FrozenClams()
    }
}