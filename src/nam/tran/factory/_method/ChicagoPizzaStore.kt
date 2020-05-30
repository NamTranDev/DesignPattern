package nam.tran.factory._method

class ChicagoPizzaStore : PizzaStore(){
    override fun createPizza(type: String): Pizza? {
        return when(type){
            "cheese" -> ChicagoStyleCheesePizza()
            "veigge" -> ChicagoStyleVeggiePizza()
            "clam" -> ChicagoStyleClamPizza()
            "pepperoni" -> ChicagoStylePepperoniPizza()
            else -> null
        }
    }

}