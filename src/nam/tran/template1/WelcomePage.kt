package nam.tran.template1

class WelcomePage : PageTemplate(){

    override fun showMenu() {
        println("Don't have menu")
    }

    override fun showBody() {
        println("<body> Body for WelcomePage </body>")
    }
}