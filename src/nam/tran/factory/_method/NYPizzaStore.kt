package nam.tran.factory._method

class NYPizzaStore : PizzaStore(){
    override fun createPizza(type: String): Pizza? {
        return when(type){
            "cheese" -> NYStyleCheesePizza()
            "veigge" -> NYStyleVeggiePizza()
            "clam" -> NYStyleClamPizza()
            "pepperoni" -> NYStylePepperoniPizza()
            else -> null
        }
    }

}