package nam.tran.factory._abstract

class ChicagoPizzaStore : PizzaStore(){

    override fun createPizza(type: String): Pizza? {
        val ingredintFactory = ChicagoPizzaIngredientFactory()
        val pizza = when(type){
            "cheese" -> CheesePizza(ingredintFactory).apply {
                name = "Chicago Style Cheese Pizza"
            }
            "veigge" -> VeiggesPizza(ingredintFactory).apply {
                name = "Chicago Style Veigges Pizza"
            }
            "clam" -> ClamPizza(ingredintFactory).apply {
                name = "Chicago Style Clam Pizza"
            }
            "pepperoni" -> PepperoniPizza(ingredintFactory).apply {
                name = "Chicago Style Pepperoni Pizza"
            }
            else -> null
        }
        return pizza
    }
}