package nam.tran.factory._method

class ChicagoStyleCheesePizza : Pizza(){
    init {
        name = "Chicago Style Deep Dish Cheese Pizza"
        dough = "Extra Thich Crush Dough"
        sauce = "Plum Tomato Sauce"

        toppings.add("Shredded Mozzarella Cheese")
    }

    override fun cut() {
        System.out.println("Cutting the pizza into square slices")
    }
}