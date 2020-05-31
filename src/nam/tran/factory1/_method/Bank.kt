package nam.tran.factory1._method

abstract class Bank{
    var name : String? = null

    fun recharge(){
        System.out.println("Thực hiện nạp tiền từ ngân hàng $name")
    }

    fun withdrawal(){
        System.out.println("Thực hiện rút tiền từ ngân hàng $name")
    }

    fun payment(){
        recharge()
        withdrawal()
    }
}