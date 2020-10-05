package nam.tran.composite

class MenuItem constructor(val name: String, val description: String, val isVege: Boolean, val price: Double) : MenuComponent() {

    override fun name(): String {
        return name
    }

    override fun description(): String {
        return description
    }

    override fun isVegetarian(): Boolean {
        return isVege
    }

    override fun price(): Double {
        return price
    }

    override fun print() {
        print(name())
        if (isVegetarian())
            print(" (v)")
        print(", ${price()}")
        print("   -- ${description()}")
        println()
    }
}