package nam.tran

import nam.tran.command.*
import nam.tran.decorator.DarkRoast
import nam.tran.decorator.Mocha
import nam.tran.decorator.Whip
import nam.tran.factory._method.ChicagoPizzaStore
import nam.tran.factory._method.NYPizzaStore
import nam.tran.factory1._abstract.FunitureFactory
import nam.tran.factory1._method.BankFactory
import nam.tran.observer.CurrentConditionsDisplay
import nam.tran.observer.ForecastDisplay
import nam.tran.observer.StatisticsDisplay
import nam.tran.observer.WeatherData
import nam.tran.observer1.*
import nam.tran.singleton.*
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
//        observerExample1()
//        decoratorExample()
//        factoryMethodExample()
//        abstractFactoryExample()
//        factoryMethodExample1()
//        abstractFactoryExample1()
//        singletonPatternExample()
        commandPatternExample()
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

    private fun observerExample() {
        val weatherData = WeatherData()

        val currentDisplay = CurrentConditionsDisplay(weatherData)
        val statisticsDisplay = StatisticsDisplay(weatherData)
        val forecastDisplay = ForecastDisplay(weatherData)

        weatherData.setMeasurements(80f, 65f, 30.4f)
        weatherData.setMeasurements(82f, 70f, 29.2f)
        weatherData.setMeasurements(78f, 90f, 29.2f)
    }

    private fun observerExample1() {
        val account1: AccountService = createAccount("zz_munsu_zz@yahoo.com", "127.0.0.1")
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

    private fun decoratorExample() {
        val darkRoast = DarkRoast()
        val mocha = Mocha(darkRoast)
        val mocha2 = Mocha(mocha)
        val whip = Whip(mocha2)
        println("${whip.description} $${whip.cost()}")
    }

    private fun factoryMethodExample() {
        val nyStore = NYPizzaStore()
        val chicagoStore = ChicagoPizzaStore()
        var pizza = nyStore.orderPizza("cheese")
        System.out.println("Ethen ordered a ${pizza?.name}")
        pizza = chicagoStore.orderPizza("cheese")
        System.out.println("Joel ordered a ${pizza?.name}")
    }

    private fun abstractFactoryExample() {
        val nyStore = nam.tran.factory._abstract.NYPizzaStore()
        val chicagoStore = nam.tran.factory._abstract.ChicagoPizzaStore()
        var pizza = nyStore.orderPizza("cheese")
        System.out.println("Ethen ordered a ${pizza?.name}")
        pizza = chicagoStore.orderPizza("cheese")
        System.out.println("Joel ordered a ${pizza?.name}")
    }

    /*
        Tất cả hệ thống ngân hàng có cung cấp API để truy cập đến hệ thống của họ. Team được giao nhiệm vụ thiết kế một API để client có thể sử dụng dịch vụ
        của một ngân hàng bất kỳ. Hiện tại, phía client chỉ cần sử dụng dịch vụ của 2 ngân hàng là VietcomBank và TPBank. Tuy nhiên để dễ mở rộng sau này, và phía
        client mong muốn không cần phải thay đổi code của họ khi cần sử dụng thêm dịch vụ của ngân hàng khác.
    */
    private fun factoryMethodExample1() {
        val tpBank = BankFactory.getBank("TPBank")
        tpBank?.payment()
        val vietcomBank = BankFactory.getBank("VietcomBank")
        vietcomBank?.payment()
    }

    /*
        Một công ty đồ nội thất chuyên sản xuất ghế (Chair): ghế nhựa (PlasticChair) và ghế gỗ (WoodChair). Với tình hình kinh doanh ngày càng thuận thợi nên công ty quyết
        định mở rộng thêm sản xuất bàn (Table). Với lợi thế là đã có kinh nghiệm từ sản xuất ghế nên công ty vẫn giữ chất liệu là nhựa (PlasticTable) và gỗ (WoodTable) cho
        sản xuất bàn. Tuy nhiên, quy trình sản xuất ghế/ bàn theo từng chất liệu (MaterialType) là khác nhau. Nên công ty tách ra là nhà máy (Factory): 1 cho sản xuất vật
        liệu bằng nhựa (PlasticFactory), 1 cho sản xuất vật liệu bằng gỗ (WoodFactory), nhưng cả 2 đều có thể sản xuất ghế và bàn (FunitureAbstractFactory). Khi khách hàng
        cần mua một món đồ nào, khách hàng (Client) chỉ cần đến cửa hàng để mua (FunitureFactory). Khi đó ứng với từng hàng hóa và vật liệu sẽ được chuyển về phân xưởng
        tương ứng để sản xuất (createXXX) ra bàn (Table) và ghế (Chair).
    */
    private fun abstractFactoryExample1() {
        val funitureWood = FunitureFactory.getFuniture("wood")
        funitureWood?.createChair()?.create()
        funitureWood?.createTable()?.create()
        val funiturePlastic = FunitureFactory.getFuniture("plastic")
        funiturePlastic?.createChair()?.create()
        funiturePlastic?.createTable()?.create()
    }

    /*
        Dưới đây là một số trường hợp sử dụng của Singleton Pattern thường gặp:
            Vì class dùng Singleton chỉ tồn tại 1 Instance (thể hiện) nên nó thường được dùng cho các trường hợp giải quyết các bài toán cần truy cập vào các
            ứng dụng như: Shared resource, Logger, Configuration, Caching, Thread pool, … Một số design pattern khác cũng sử dụng Singleton để triển khai: Abstract
            Factory, Builder, Prototype, Facade,… Đã được sử dụng trong một số class của core java như: java.lang.Runtime, java.awt.Desktop.
    */
    private fun singletonPatternExample(){
        EagerInitialization.getInstance()
        StaticBlockInitialization.getInstance()
        LazyInitialization.getInstance()
        ThreadSafeInitialization.getInstance()
        DoubleCheckLockingInitialization.getInstance()
        BillPughSingleton.getInstance()
    }

    private fun commandPatternExample(){
        val remoteControl = RemoteControl()
        val lightKitchen = Light("Kitchen")
        val lightLivingRoom = Light("Living Room")
        val ceilingFan = CeilingFan()
        val garageDoor = GarageDoor()
        val stereo = Stereo("Living Room")

        val lightOnLivingRoom = LightOnCommand(lightLivingRoom)
        val lightOffLivingRoom = LightOffCommand(lightLivingRoom)
        val lightOnKitchen = LightOnCommand(lightKitchen)
        val lightOffKitchen = LightOffCommand(lightKitchen)
        val ceilingFanOn = CeilingFanOnCommand(ceilingFan)
        val ceilingFanOff = CeilingFanOffCommand(ceilingFan)
        val garageDoorUp = GarageUpCommand(garageDoor)
        val garageDoorDown = GarageDownCommand(garageDoor)
        val stereoOn = StereoOnCommand(stereo)
        val stereoOff = StereoOffCommand(stereo)

        remoteControl.setCommand(0,lightOnLivingRoom,lightOffLivingRoom)
//        remoteControl.setCommand(1,lightOnKitchen,lightOffKitchen)
//        remoteControl.setCommand(2,ceilingFanOn,ceilingFanOff)
//        remoteControl.setCommand(3,garageDoorUp,garageDoorDown)
//        remoteControl.setCommand(4,stereoOn,stereoOff)

        println(remoteControl)
//
//        remoteControl.onPress(0)
//        remoteControl.onPress(1)
//        remoteControl.onPress(2)
//        remoteControl.onPress(3)
//        remoteControl.onPress(4)
//
//        remoteControl.offPress(0)
//        remoteControl.offPress(1)
//        remoteControl.offPress(2)
//        remoteControl.offPress(3)
//        remoteControl.offPress(4)

        remoteControl.onPress(0)
        remoteControl.offPress(0)
        println(remoteControl)
        remoteControl.undoPress()

        remoteControl.offPress(0)
        remoteControl.onPress(0)
        println(remoteControl)
        remoteControl.undoPress()
    }
}