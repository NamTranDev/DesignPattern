package nam.tran

import nam.tran.observer.CurrentConditionsDisplay
import nam.tran.observer.ForecastDisplay
import nam.tran.observer.StatisticsDisplay
import nam.tran.observer.WeatherData
import nam.tran.observer1.*
import nam.tran.strategy.*
import nam.tran.strategy1.King
import nam.tran.strategy1.Knight
import nam.tran.strategy1.Queen
import nam.tran.strategy1.Troll


object Main {

    @JvmStatic
    fun main(args: Array<String>) { // write your code here
//        strategyExample()
//        strategyExample1()
//        observerExample()
        observerExample1()
    }

    private fun strategyExample() {
        val sortExample = SortExample(intArrayOf(10, 25, 4, 7, 30, 55, 1, 55, 7, 44, 5, 5, 7, 8, 29))

        sortExample.mSortType = QuickSort()
        sortExample.sort()

        sortExample.mSortType = BubbleSort()
        sortExample.sort()

        sortExample.mSortType = InsertionSort()
        sortExample.sort()

        sortExample.mSortType = SelectionSort()
        sortExample.sort()

        sortExample.mSortType = BinSort()
        sortExample.sort()

        sortExample.mSortType = HeapSort(false)
        sortExample.sort()
    }

    private fun strategyExample1() {
        val queen = Queen()
        queen.display()
        queen.fight()

        val king = King()
        king.display()
        king.fight()

        val knight = Knight()
        knight.display()
        knight.fight()

        val troll = Troll()
        troll.display()
        troll.fight()
    }

    private fun observerExample(){
        val weatherData = WeatherData()

        val currentDisplay = CurrentConditionsDisplay(weatherData)
        val statisticsDisplay = StatisticsDisplay(weatherData)
        val forecastDisplay = ForecastDisplay(weatherData)

        weatherData.setMeasurements(80f, 65f, 30.4f)
        weatherData.setMeasurements(82f, 70f, 29.2f)
        weatherData.setMeasurements(78f, 90f, 29.2f)
    }

    private fun observerExample1(){
        val account1: AccountService = createAccount("namtran09061992@gmail.com", "127.0.0.1")
        account1.login()
        account1.changeStatus(LoginStatus.EXPIRED)

        println("---")
        val account2: AccountService = createAccount("namtran09061992@gmail.com", "116.108.77.231")
        account2.login()
    }

    private fun createAccount(email: String, ip: String): AccountService {
        val account = AccountService(email, ip)
        account.attach(Logger())
        account.attach(Mailer())
        account.attach(Protector())
        return account
    }
}