package nam.tran.command

class Light constructor(val place : String){

    fun on(){
        println("$place Light is on")
    }

    fun off(){
        println("$place Light is off")
    }
}