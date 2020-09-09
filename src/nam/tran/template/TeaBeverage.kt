package nam.tran.template

import java.io.BufferedReader
import java.io.InputStreamReader

class TeaBeverage : CaffeinBeverage() {

    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiment() {
        println("Adding lemon")
    }

    override fun customerWantsCondiment(): Boolean {
        val answer = getUserInput()
        if (answer.contains("y"))
            return true
        return false
    }

    private fun getUserInput(): String {
        var answer: String? = null
        println("Would you like lemon with your tea (y/n)?")
        val input = BufferedReader(InputStreamReader(System.`in`))
        answer = input.readLine()
        if (answer == null)
            return "n"
        return answer
    }
}