package nam.tran.iterator

class PancakeHouseIterator constructor(val items: ArrayList<Menu>) : Iterator<Menu> {

    override fun next(): Menu {
        return items.iterator().next()
    }

    override fun hasNext(): Boolean {
        return items.iterator().hasNext()
    }
}