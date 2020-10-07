package nam.tran.composite

abstract class MenuComponent {

    open fun add(menu: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun remove(menu: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun getChild(position: Int): MenuComponent {
        throw UnsupportedOperationException()
    }

    open fun name(): String {
        throw UnsupportedOperationException()
    }

    open fun description(): String {
        throw UnsupportedOperationException()
    }

    open fun price(): Double {
        throw UnsupportedOperationException()
    }

    open fun isVegetarian(): Boolean {
        throw UnsupportedOperationException()
    }

    open fun print() {
        throw UnsupportedOperationException()
    }

    open fun createIterator(): Iterator<MenuComponent?> {
        throw UnsupportedOperationException()
    }
}