package nam.tran.factory1._abstract

class WoodFactory : FunitureAbstractFactory() {
    override fun createChair(): Chair {
        return WoodChair()
    }

    override fun createTable(): Table {
        return WoodTable()
    }
}