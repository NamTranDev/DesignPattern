package nam.tran.factory._abstract

class PepperoniPizza constructor(private val factory : PizzaIngredientFactory): Pizza(){

    override fun prepare() {
        System.out.println("Preparing $name")
        dough = factory.createDough()
        sauce = factory.createSauce()
        cheese = factory.createCheese()
        pepperoni = factory.createPepperoni()
    }

}