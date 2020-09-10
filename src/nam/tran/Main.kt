package nam.tran

import nam.tran.adapter.Duck
import nam.tran.adapter.MallardDuck
import nam.tran.adapter.TurkeyAdapter
import nam.tran.adapter.WildTurkey
import nam.tran.adapter1.TranslatorAdapter
import nam.tran.adapter1.VietnameseAdaptee
import nam.tran.command.*
import nam.tran.command1.Account
import nam.tran.command1.BankControl
import nam.tran.command1.CloseAccountCommand
import nam.tran.command1.OpenAccountCommand
import nam.tran.command2.DocumentControl
import nam.tran.decorator.DarkRoast
import nam.tran.decorator.Mocha
import nam.tran.decorator.Whip
import nam.tran.facade.*
import nam.tran.facade1.ShopFacade
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
import nam.tran.template.CoffeeBeverage
import nam.tran.template.TeaBeverage
import nam.tran.template1.DetailPage
import nam.tran.template1.HomePage
import nam.tran.template1.WelcomePage


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
//        commandPatternExample()
//        commandPatternExample1()
//        commandPatternExample2()
//        adapterPatternExample()
//        adapterPatternExample1()
//        facadePatternExample()
//        facadePatternExample1()
//        templateMethodPatternExample()
        templateMethodPatternExample2()
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
        println("Ethen ordered a ${pizza?.name}")
        pizza = chicagoStore.orderPizza("cheese")
        println("Joel ordered a ${pizza?.name}")
    }

    private fun abstractFactoryExample() {
        val nyStore = nam.tran.factory._abstract.NYPizzaStore()
        val chicagoStore = nam.tran.factory._abstract.ChicagoPizzaStore()
        var pizza = nyStore.orderPizza("cheese")
        println("Ethen ordered a ${pizza?.name}")
        pizza = chicagoStore.orderPizza("cheese")
        println("Joel ordered a ${pizza?.name}")
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
    private fun singletonPatternExample() {
        EagerInitialization.getInstance()
        StaticBlockInitialization.getInstance()
        LazyInitialization.getInstance()
        ThreadSafeInitialization.getInstance()
        DoubleCheckLockingInitialization.getInstance()
        BillPughSingleton.getInstance()
    }

    private fun commandPatternExample() {
        val remoteControl = RemoteControl()
        val lightKitchen = Light("Kitchen")
        val lightLivingRoom = Light("Living Room")
        val ceilingFan = CeilingFan()
        val garageDoor = GarageDoor()
        val stereo = Stereo("Living Room")

//        val lightOnLivingRoom = LightOnCommand(lightLivingRoom)
//        val lightOffLivingRoom = LightOffCommand(lightLivingRoom)
//
//        remoteControl.setCommand(0,lightOnLivingRoom,lightOffLivingRoom)
//
//        println(remoteControl)
//
//        remoteControl.onPress(0)
//        remoteControl.offPress(0)
//        println(remoteControl)
//        remoteControl.undoPress()
//
//        remoteControl.offPress(0)
//        remoteControl.onPress(0)
//        println(remoteControl)
//        remoteControl.undoPress()


//        val ceilingFanHighCommand = CeilingFanHighCommand(ceilingFan)
//        val ceilingFanMediumCommand = CeilingFanMediumCommand(ceilingFan)
//        val ceilingFanLowCommand = CeilingFanLowCommand(ceilingFan)
//        val ceilingFanOffCommand = CeilingFanOffCommand(ceilingFan)
//
//        remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand)
//        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand)
//
//        remoteControl.onPress(0)
//        remoteControl.offPress(0)
//        println(remoteControl)
//        remoteControl.undoPress()
//        remoteControl.onPress(1)
//        println(remoteControl)
//        remoteControl.undoPress()


        val lightOn = LightOnCommand(lightKitchen)
        val lightOff = LightOffCommand(lightKitchen)
        val stereoOn = StereoOnCommand(stereo)
        val stereoOff = StereoOffCommand(stereo)

        val macroOn = MacroCommand(arrayOf(lightOn, stereoOn))
        val macroOff = MacroCommand(arrayOf(lightOff, stereoOff))

        remoteControl.setCommand(0, macroOn, macroOff)
        println("------ Pushing Macro On ------")
        remoteControl.onPress(0)
        println("------ Pushing Macro Off ------")
        remoteControl.offPress(0)
        println("------ Pushing Macro Undo ------")
        remoteControl.undoPress()
    }

    /*
        Một hệ thống ngân hàng cung cấp ứng dụng cho khách hàng (client) có thể mở (open) hoặc đóng (close) tài khoản trực tuyến. Hệ thống này được thiết kế theo
        dạng module, mỗi module sẽ thực hiện một nhiệm vụ riêng của nó, chẳng hạn mở tài khoản (OpenAccount), đóng tài khoản (CloseAccount). Do hệ thống không biết
        mỗi module sẽ làm gì, nên khi có yêu cầu client (chẳng hạn clickOpenAccount, clickCloseAccount), nó sẽ đóng gói yêu cầu này và gọi module xử lý.
    */
    fun commandPatternExample1() {
        val control = BankControl()
        val account = Account()
        val openCommand = OpenAccountCommand(account)
        val closeCommand = CloseAccountCommand(account)

        control.setAction(openCommand, closeCommand)

        control.clickOpenAccount()
        control.clickCloseAccount()
    }

    /*
        Ứng dụng văn bản cần một chức năng để thêm hoặc lưu trữ những hành động undo hay redo. ( Lớp Document chỉ cung cấp phương thức ghi thêm một
         dòng văn bản mới hoặc xóa một dòng văn bản đã ghi trước đó. )
    */
    fun commandPatternExample2() {
        val instance = DocumentControl()
        instance.write("The 1st text. ")
        instance.undo()
        instance.read() // EMPTY

        instance.redo()
        instance.read() // The 1st text.

        instance.write("The 2nd text. ")
        instance.write("The 3rd text. ")
        instance.read() // The 1st text. The 2nd text. The 3rd text.

        instance.undo() // The 1st text. The 2nd text.

        instance.undo() // The 1st text.

        instance.undo() // EMPTY

        instance.undo() // Nothing to undo
    }

    fun adapterPatternExample() {
        val duck = MallardDuck()
        val turkey = WildTurkey()

        val adapter = TurkeyAdapter(turkey)

        println("The Turkey say : ")
        turkey.gobble()
        turkey.fly()

        println("The Duck say : ")
        testDuck(duck)

        println("The Adapter say : ")
        testDuck(adapter)
    }

    /*
        Một người nước ngoài muốn trao đổi với một người Việt. Tuy nhiên, 2 người này không biết ngôn ngữ của nhau nên cần phải có một
        người để chuyển đổi từ ngôn ngữ nước ngoài sang ngôn ngữ tiếng Việt
    */

    fun adapterPatternExample1() {
        val client = TranslatorAdapter(VietnameseAdaptee())
        client.send("Hello")
    }

    fun facadePatternExample() {
        val amplifier = Amplifier()
        val tuner = Tuner(amplifier)
        val dvdPlayer = DvdPlayer(amplifier)
        val cdPlayer = CdPlayer(amplifier)
        val projector = Projector(dvdPlayer)
        val popper = PopcornPopper()
        val lights = TheaterLights()
        val screen = Screen()

        val homeTheater = HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, screen, lights, popper)
        homeTheater.watchMovie()
        homeTheater.endMovie()
    }

    fun facadePatternExample1(){
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("namtran09061992@gmail.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("namtran09061992@gmail.com", "0963160906")
    }

    fun templateMethodPatternExample(){
        val tea = TeaBeverage()
        val coffee = CoffeeBeverage()
        println("Making tea ...")
        tea.prepareRecipe()
        println("Making coffee ...")
        coffee.prepareRecipe()
    }

    /*
        Thiết kế website . Cấu trúc của một website thông thường gồm các phần header, footer, navigation (menu), body.
         Riêng phần body thường xuyên thay đổi, sẽ hiển thị riêng theo từng trang. Những phần khác ít khi thay đổi, trừ khi có yêu cầu đặt .
    */
    fun templateMethodPatternExample2(){
        val welcome = WelcomePage()
        val home = HomePage()
        val detail = DetailPage()
        println("Build Welcome Page ...")
        welcome.build()
        println("Build Home Page ...")
        home.build()
        println("Build Detail Page ...")
        detail.build()
    }

    private fun testDuck(duck: Duck) {
        duck.quack()
        duck.fly()
    }
}