package nam.tran.factory._method

abstract class Pizza{
    var name : String? = null
    var dough : String? = null
    var sauce : String? = null
    val toppings = mutableListOf<String>()

    fun prepare(){
        System.out.println("Preparing $name")
        System.out.println("Tossing dough : $dough")
        System.out.println("Adding sauce : $sauce")
        System.out.println("Adding topping: ")
        toppings.forEach {
            System.out.println(it)
        }
    }

    fun bake(){
        System.out.println("Bake for 25 minutes at 350")
    }

    open fun cut(){
        System.out.println("Cutting the pizza into diagonal slices")
    }

    fun box(){
        System.out.println("Place pizza in offical PizzaStore box")
    }
}