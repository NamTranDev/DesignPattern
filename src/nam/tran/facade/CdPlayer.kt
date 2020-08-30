package nam.tran.facade

class CdPlayer constructor(private val amplifier: Amplifier){

    fun on(){
        println("CdPlayer on")
    }

    fun off(){
        println("CdPlayer off")
    }

    fun eject(){
        println("CdPlayer eject")
    }

    fun pause(){
        println("CdPlayer pause")
    }

    fun play(){
        println("CdPlayer play")
    }

    fun stop(){
        println("CdPlayer stop")
    }
}