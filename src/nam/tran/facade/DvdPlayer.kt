package nam.tran.facade

class DvdPlayer constructor(private val amplifier: Amplifier){

    fun on(){
        println("DvdPlayer on")
    }

    fun off(){
        println("DvdPlayer off")
    }

    fun eject(){
        println("DvdPlayer eject")
    }

    fun pause(){
        println("DvdPlayer pause")
    }

    fun play(){
        println("DvdPlayer play")
    }

    fun setSurroudSound(){
        println("DvdPlayer set Surroud Sound")
    }

    fun setTwoChannelAudio(){
        println("DvdPlayer set Two Channel Audio")
    }

    fun stop(){
        println("DvdPlayer stop")
    }
}