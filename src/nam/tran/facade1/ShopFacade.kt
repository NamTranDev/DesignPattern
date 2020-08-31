package nam.tran.facade1

class ShopFacade private constructor(private var account: AccountService,
                                     private var payment: PaymentService,
                                     private var shipping: ShippingService,
                                     private var email: EmailService,
                                     private var sms: SMSService) {
    companion object {
        val INSTANCE = ShopFacade(AccountService(), PaymentService(), ShippingService(), EmailService(), SMSService())

        fun getInstance(): ShopFacade {
            return INSTANCE
        }
    }

    fun buyProductByCashWithFreeShipping(_email: String) {
        account.getAccount(_email)
        payment.paymentByCash()
        shipping.freeShipping()
        email.sendMail(_email)
        println("Done\n")
    }

    fun buyProductByPaypalWithStandardShipping(_email: String, mobilePhone: String) {
        account.getAccount(_email)
        payment.paymentByPaypal()
        shipping.standardShipping()
        email.sendMail(_email)
        sms.sendSMS(mobilePhone)
        println("Done\n")
    }
}