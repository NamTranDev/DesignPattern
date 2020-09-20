package nam.tran.iterator

class Waitress constructor(val pancakeHouseMenu: Menu, val dinnerMenu: Menu) {

    fun printMenu() {
        val pancakeIterator = pancakeHouseMenu.createIterator()
        val dinnerIterator = dinnerMenu.createIterator()
        println("MENU\n-----\nBREAKFAST")
        printMenu(pancakeIterator)
        println("\nLUNCH")
        printMenu(dinnerIterator)
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