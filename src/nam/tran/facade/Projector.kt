package nam.tran.facade

class Projector constructor(private val dvdPlayer: DvdPlayer){

    fun on(){
        println("Projector on")
    }

    fun off(){
        println("Projector off")
    }

    fun tvMode(){
        println("Projector tv Mode")
    }

    fun wideScreenMode(){
        println("Projector wide Screen Mode")
    }
}