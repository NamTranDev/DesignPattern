package nam.tran.command2

import java.util.*

class Document {

    private val stack = Stack<String>()

    fun write(text : String){
        stack.push(text)
    }

    fun eraseLast(){
        if (stack.isNotEmpty()){
            stack.pop()
        }
    }

    fun read(){
        stack.forEach {
            println(it)
        }
    }
}