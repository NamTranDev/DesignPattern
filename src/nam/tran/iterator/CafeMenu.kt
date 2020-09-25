package nam.tran.iterator

import java.util.*

class CafeMenu : Menu {
    val menuItems = Hashtable<String, MenuItem>()

    init {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99)
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69)
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29)
    }

    fun addItem(name: String, description: String, isVagetarian: Boolean, price: Double) {
        val menu = MenuItem(name, description, isVagetarian, price)
        menuItems.put(menu.name, menu)
    }

    override fun createIterator(): Iterator<MenuItem> {
        return menuItems.values.iterator()
    }
}