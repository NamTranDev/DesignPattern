package nam.tran.template

import java.io.BufferedReader
import java.io.InputStreamReader

class CoffeeBeverage : CaffeinBeverage() {

    override fun brew() {
        println("Dripping coffee through filter")
    }

    override fun addCondiment() {
        println("Adding sugar and milk")
    }

    override fun customerWantsCondiment(): Boolean {
        val answer = getUserInput()
        if (answer.contains("y"))
            return true
        return false
    }

    private fun getUserInput(): String {
        var answer: String? = null
        println("Would you like sugar and milk with your coffee (y/n)?")
        val input = BufferedReader(InputStreamReader(System.`in`))
        answer = input.readLine()
        if (answer == null)
            return "n"
        return answer
    }
}