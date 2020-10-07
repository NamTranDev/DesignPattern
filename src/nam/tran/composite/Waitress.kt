package nam.tran.composite

import java.lang.UnsupportedOperationException

class Waitress constructor(val allMenu : MenuComponent) {

    fun printMenu(){
        allMenu.print()
    }

    fun printVegetarianMenu(){
        val iterator = allMenu.createIterator()
        while (iterator.hasNext()){
            val menu = iterator.next()
            try {
                if (menu?.isVegetarian() == true){
                    menu.print()
                }
            }catch (e : UnsupportedOperationException){
                println(e)
            }
        }
    }
}