package nam.tran.facade1

class PaymentService {

    fun paymentByPaypal() {
        println("Payment by Paypal")
    }

    fun paymentByCreditCard() {
        println("Payment by Credit Card")
    }

    fun paymentByEbankingAccount() {
        println("Payment by E-banking account")
    }

    fun paymentByCash() {
        println("Payment by cash")
    }
}