package nam.tran.singleton

/*
    Singleton Class được khởi tạo ngay khi được gọi đến. Đây là cách dễ nhất nhưng nó có một nhược điểm mặc dù instance đã được khởi tạo
    mà có thể sẽ không dùng tới. Static block cung cấp thêm lựa chọn cho việc handle exception hay các xử lý khác
*/
class StaticBlockInitialization private constructor(){

    init {
        print("This is StaticBlockInitialization \n")
    }

    // Static block initialization for exception handling
    companion object{
        private var INSTANCE = try {
            StaticBlockInitialization()
        } catch (e : Exception ) {
            throw RuntimeException("Exception occured in creating singleton instance")
        }

        fun getInstance(): StaticBlockInitialization? {
            return INSTANCE
        }
    }
}