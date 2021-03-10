package nam.tran.proxy.virtual

class ProxyImage constructor(private val url : String): Image{

    private var realImage : Image? = null

    init {
        println("Image unloaded: " + this.url)
    }

    override fun showImage() {
        if (realImage == null) {
            realImage = RealImage(this.url)
        } else {
            println("Image already existed: " + this.url)
        }
        realImage?.showImage();
    }
}