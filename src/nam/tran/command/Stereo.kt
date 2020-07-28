package nam.tran.command

// Đài
class Stereo constructor(val place : String){

    fun on(){
        System.out.println("$place stereo is on")
    }

    fun off(){
        System.out.println("$place stereo is off")
    }

    fun setCD(){
        System.out.println("$place stereo is set for CD input")
    }

    fun setVolumn(number : Int) {
        System.out.println("$place stereo volumn set to $number")
    }
}