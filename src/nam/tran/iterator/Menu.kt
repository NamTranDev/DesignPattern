package nam.tran.iterator

data class Menu(val name: String, val description: String, val isVegetarian: Boolean, val price: Double) {

    companion object {
        fun defaultMenu(): Menu {
            return Menu("", "", false, 0.0)
        }
    }
}