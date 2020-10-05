package nam.tran.composite

class Waitress constructor(val allMenu : MenuComponent) {

    fun printMenu(){
        allMenu.print()
    }
}