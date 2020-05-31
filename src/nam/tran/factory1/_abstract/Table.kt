package nam.tran.factory1._abstract

abstract class Table{
    var name : String? = null

    fun create(){
        System.out.println("Create $name")
    }
}