package nam.tran.iterator

class Waitress constructor(val pancakeHouseMenu: Menu, val dinnerMenu: Menu,val cafeMenu: CafeMenu) {

    fun printMenu() {
        val pancakeIterator = pancakeHouseMenu.createIterator()
        val dinnerIterator = dinnerMenu.createIterator()
        val cafeIterator = cafeMenu.createIterator()
        println("MENU\n-----\nBREAKFAST")
        printMenu(pancakeIterator)
        println("\nLUNCH")
        printMenu(dinnerIterator)
        println("\nCAFE")
        printMenu(cafeIterator)
    }

    private fun printMenu(iterator: Iterator<MenuItem>) {
        while (iterator.hasNext()) {
            val menu = iterator.next()
            if (menu.name == "")
                return
            println("${menu.name}, ${menu.price} -- ${menu.description}")
        }
    }
}