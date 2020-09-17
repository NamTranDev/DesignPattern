package nam.tran.iterator

class PancakeHouseMenu {

    val menus = ArrayList<Menu>()

    init {
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99)
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, and sausage", false, 2.99)
        addItem("Bkueberry Pancake", "Pancakes made with fresh blueberries", true, 3.49)
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.49)
    }

    fun addItem(name: String, description: String, isVegetarian: Boolean, price: Double) {
        val menu = Menu(name, description, isVegetarian, price)
        menus.add(menu)
    }

    fun createIterator(): Iterator<Menu> {
        return PancakeHouseIterator(menus)
    }
}