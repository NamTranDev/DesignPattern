package nam.tran.factory._method

abstract class PizzaStore {
    abstract fun createPizza(type: String): Pizza?

    fun orderPizza(type: String): Pizza? {
        val pizza = createPizza(type)
        pizza?.prepare()
        pizza?.bake()
        pizza?.cut()
        pizza?.box()
        return pizza
    }
}