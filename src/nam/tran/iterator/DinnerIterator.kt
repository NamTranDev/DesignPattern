package nam.tran.iterator

class DinnerIterator constructor(val items : Array<Menu>) : Iterator<Menu>{

    private var mPosition = 0

    override fun hasNext(): Boolean {
        if (mPosition >= items.size)
            return false
        return true
    }

    override fun next(): Menu {
        val menu = items[mPosition]
        mPosition++
        return menu
    }

}