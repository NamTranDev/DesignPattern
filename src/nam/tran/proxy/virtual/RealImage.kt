package nam.tran.proxy.virtual

class RealImage constructor(private val url : String): Image{

    init {
        println("Image loaded: " + this.url)
    }

    override fun showImage() {
        println("Image showed: " + this.url)
    }

}