package nam.tran.factory1._method

class BankFactory {

    companion object {
        fun getBank(type: String): Bank?{
            return when(type){
                "TPBank" -> TPBank()
                "VietcomBank" -> VietcomBank()
                else -> null
            }
        }
    }
}