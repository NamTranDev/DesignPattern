package nam.tran.iterator

class PancakeHouseMenu : Menu{

    val menus = ArrayList<MenuItem>()

    init {
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99)
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, and sausage", false, 2.99)
        addItem("Bkueberry Pancake", "Pancakes made with fresh blueberries", true, 3.49)
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.49)
    }

    fun addItem(name: String, description: String, isVegetarian: Boolean, price: Double) {
        val menu = MenuItem(name, description, isVegetarian, price)
        menus.add(menu)
    }

    override fun createIterator() : Iterator<MenuItem>{
        return menus.iterator()
    }
}