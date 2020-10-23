package nam.tran.composite1

class File constructor(val name : String,val size : Long): FileComponent{

    override fun showProperty() {
        println("This is file $name with size = $size")
    }

    override fun totalSize(): Long {
        return size
    }
}