package nam.tran.facade

class Amplifier constructor(){

    private var tuner: Tuner? = null
    private var cdPlayer: CdPlayer? = null
    private var dvdPlayer : DvdPlayer? = null

    fun on(){
        println("Amplifier on")
    }

    fun off(){
        println("Amplifier off")
    }

    fun setCd(cdPlayer: CdPlayer){
        println("Amplifier set Cd")
        this.cdPlayer = cdPlayer
    }

    fun setDvd(dvdPlayer: DvdPlayer){
        println("Amplifier set Dvd")
        this.dvdPlayer = dvdPlayer
    }

    fun setStereoSound(){
        println("Amplifier set Stereo Soung")
    }

    fun setSurroundSound(){
        println("Amplifier set Surround Sound")
    }

    fun setTuner(tuner: Tuner){
        println("Amplifier set Tuner")
        this.tuner = tuner
    }

    fun setVolumn(){
        println("Amplifier set Volumn")
    }
}