package nam.tran.factory._abstract

class NYPizzaStore : PizzaStore(){

    override fun createPizza(type: String): Pizza? {
        val ingredintFactory = NYPizzaIngredientFactory()
        val pizza = when(type){
            "cheese" -> CheesePizza(ingredintFactory).apply {
                name = "New York Style Cheese Pizza"
            }
            "veigge" -> VeiggesPizza(ingredintFactory).apply {
                name = "New York Style Veigges Pizza"
            }
            "clam" -> ClamPizza(ingredintFactory).apply {
                name = "New York Style Clam Pizza"
            }
            "pepperoni" -> PepperoniPizza(ingredintFactory).apply {
                name = "New York Style Pepperoni Pizza"
            }
            else -> null
        }
        return pizza
    }
}