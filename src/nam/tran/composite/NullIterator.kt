package nam.tran.composite

class NullIterator : Iterator<MenuComponent?> {

    override fun hasNext(): Boolean {
        return false
    }

    override fun next(): MenuComponent? {
        return null
    }

    fun remove() {
        throw UnsupportedOperationException()
    }
}