package nam.tran.factory._abstract

interface PizzaIngredientFactory{

    fun createDough() : Dough
    fun createSauce() : Sauce
    fun createCheese() : Cheese
    fun createVeigges() : Array<Veigges>
    fun createPepperoni() : Pepperoni
    fun createClams() : Clams
}