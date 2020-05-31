package nam.tran.factory1._abstract

class FunitureFactory {

    companion object {
        fun getFuniture(type: String): FunitureAbstractFactory? {
            return when (type) {
                "plastic" -> PlasticFactory()
                "wood" -> WoodFactory()
                else -> null
            }
        }
    }
}