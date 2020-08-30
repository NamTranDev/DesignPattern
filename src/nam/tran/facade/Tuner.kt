package nam.tran.facade

class Tuner constructor(private val amplifier: Amplifier){

    fun on(){
        println("Tuner on")
    }

    fun off(){
        println("Tuner off")
    }

    fun setAm(){
        println("Tune set Am")
    }

    fun setFm(){
        println("Tuner set Fm")
    }

    fun setFrequency(){
        println("Tuner set Frequency")
    }
}