package nam.tran.adapter1

class TranslatorAdapter constructor(private val vietnamese: Vietnamese) : Japanese {

    override fun send(word: String) {
        println("Client talk $word")
        vietnamese.receiver(word)
    }
}