package nam.tran.adapter1

class VietnameseAdaptee : Vietnamese{

    override fun receiver(word: String) {
        println("Convert $word to Tiếng Việt")
    }
}