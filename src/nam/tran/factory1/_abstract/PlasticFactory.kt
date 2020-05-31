package nam.tran.factory1._abstract

class PlasticFactory : FunitureAbstractFactory() {
    override fun createChair(): Chair {
        return PlasticChair()
    }

    override fun createTable(): Table {
        return PlasticTable()
    }
}