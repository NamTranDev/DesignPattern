package nam.tran.iterator

class DinnerMenu {

    companion object{
        const val MAX_ITEMS = 6
    }
    val menus = arrayOf<Menu>()
    var numberOfItems = 0

    init {
        addItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat",true,2.99)
        addItem("BLT","Bacon with lettuce & tomato on whole wheat",false,2.99)
        addItem("Soup of the day","Soup of the day, with a side of potato salad",false,3.29)
        addItem("Hotdog","A hot dog, with saurkraut, relish, onions, topped with cheese",false,3.05)
    }

    fun addItem(name : String,description : String,isVegetarian : Boolean,price : Double){
        val menu = Menu(name, description, isVegetarian, price)
        if (numberOfItems >= MAX_ITEMS){
            println("Sorry, menu is full!! Can't add item to menu")
        }else{
            menus[numberOfItems] = menu
            numberOfItems++
        }
    }

    fun createIterator() : Iterator<Menu>{
        return DinnerIterator(menus)
    }

}