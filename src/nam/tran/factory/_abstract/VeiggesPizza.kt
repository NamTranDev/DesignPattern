package nam.tran.factory._abstract

class VeiggesPizza constructor(private val factory : PizzaIngredientFactory): Pizza(){

    override fun prepare() {
        System.out.println("Preparing $name")
        dough = factory.createDough()
        sauce = factory.createSauce()
        cheese = factory.createCheese()
        veigges = factory.createVeigges()
    }

}