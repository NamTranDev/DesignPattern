package nam.tran.template1

abstract class PageTemplate {

    fun build(){
        showHeader()
        showMenu()
        showFooter()
        showBody()
    }

    fun showHeader(){
        println("</header>")
    }

    fun showFooter(){
        println("</footer>")
    }

    // this is call is hook because it is optinal
    open fun showMenu(){
        println("</menu>")
    }

    abstract fun showBody()
}