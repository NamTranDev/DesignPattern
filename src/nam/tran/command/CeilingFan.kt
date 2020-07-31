package nam.tran.command

//Quạt trần
class CeilingFan{

    var speed = CeilingFanLevel.OFF

    fun high(){
        speed = CeilingFanLevel.HIGH
        println("CeilingFan is speed HIGH")
    }

    fun medium(){
        speed = CeilingFanLevel.MEDIUM
        println("CeilingFan is speed MEDIUM")
    }

    fun low(){
        speed = CeilingFanLevel.LOW
        println("CeilingFan is speed LOW")
    }

    fun off(){
        speed = CeilingFanLevel.OFF
        println("CeilingFan is OFF")
    }
}