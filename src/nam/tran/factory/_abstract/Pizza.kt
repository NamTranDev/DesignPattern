package nam.tran.factory._abstract

abstract class Pizza{
    var name : String? = null
    var dough : Dough? = null
    var sauce : Sauce? = null
    var veigges : Array<Veigges>? = null
    var cheese : Cheese? = null
    var pepperoni : Pepperoni? = null
    var clams : Clams? = null

    abstract fun prepare()

    fun bake(){
        System.out.println("Bake for 25 minutes at 350")
    }

    fun cut(){
        System.out.println("Cutting the pizza into diagonal slices")
    }

    fun box(){
        System.out.println("Place pizza in oficial PizzaStore box")
    }
}