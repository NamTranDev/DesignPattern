package nam.tran.factory._abstract

class NYPizzaIngredientFactory : PizzaIngredientFactory{
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createVeigges(): Array<Veigges> {
        return arrayOf(Garlic(),Onion(),Mushroom(),RedPepper())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClams(): Clams {
        return FreshClams()
    }

}