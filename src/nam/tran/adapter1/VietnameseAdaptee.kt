package nam.tran.adapter1

class JapaneseAdaptee : Japanese{

    override fun receiver(word: String) {
        println("Convert $word to Japanese")
    }
}