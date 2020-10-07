package nam.tran.composite

import java.util.*

class CompositeIterator constructor(private val iterator: Iterator<MenuComponent>) : Iterator<MenuComponent?> {

    val stack = Stack<Iterator<MenuComponent?>>()

    init {
        stack.push(iterator)
    }

    override fun hasNext(): Boolean {
        return if (stack.isEmpty())
            false
        else {
            if (!stack.peek().hasNext()) {
                stack.pop()
                hasNext()
            } else {
                true
            }
        }
    }

    override fun next(): MenuComponent? {
        if (hasNext()){
            val component = stack.peek().next()
            if (component is Menu){
                stack.push(component.createIterator())
            }
            return component
        }else{
            return null
        }
    }

    fun remove() {
        throw UnsupportedOperationException()
    }
}