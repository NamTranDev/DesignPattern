package nam.tran.iterator

data class MenuItem(val name: String, val description: String, val isVegetarian: Boolean, val price: Double) {

    companion object {
        fun defaultMenu(): MenuItem {
            return MenuItem("", "", false, 0.0)
        }
    }
}