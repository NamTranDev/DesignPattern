package nam.tran.composite

class Menu constructor(val name: String, val description: String) : MenuComponent() {

    private val menuComponents = mutableListOf<MenuComponent>()

    private var iterator: Iterator<MenuComponent?>? = null

    override fun add(menu: MenuComponent) {
        menuComponents.add(menu)
    }

    override fun remove(menu: MenuComponent) {
        menuComponents.remove(menu)
    }

    override fun getChild(position: Int): MenuComponent {
        return menuComponents[position]
    }

    override fun name(): String {
        return name
    }

    override fun description(): String {
        return description
    }

    override fun print() {
        print(name())
        println(", ${description()}")
        println("-----------------")
        val iterator = menuComponents.iterator()
        while (iterator.hasNext()) {
            val menu = iterator.next()
            menu.print()
        }
        println()
    }

    override fun createIterator(): Iterator<MenuComponent?> {
        if (iterator == null)
            iterator = CompositeIterator(menuComponents.iterator())
        return iterator!!
    }
}