package nam.tran.singleton

/*
     Singleton Class được khởi tạo ngay khi được gọi đến. Đây là cách dễ nhất nhưng nó có một nhược điểm mặc dù instance đã được khởi
     tạo mà có thể sẽ không dùng tới.
*/
class EagerInitialization
/* Private constructor to avoid client applications to use constructor */
private constructor() {

    init {
        print("This is EagerInitialization \n")
    }

    companion object{
        private val INSTANCE: EagerInitialization = EagerInitialization()
        fun getInstance(): EagerInitialization? {
            return INSTANCE
        }
    }
}