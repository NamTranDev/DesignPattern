package nam.tran.singleton

/*
    Cách đơn giản nhất là chúng ta gọi phương thức synchronized của hàm getInstance() và như vậy hệ thống đảm bảo rằng tại cùng một thời điểm
    chỉ có thể có 1 luồng có thể truy cập vào hàm getInstance() và đảm bảo rằng chỉ có duy nhất 1 thể hiện của class.

    " Biến volatile trong Java có tác dụng thông báo sự thay đổi giá trị của biến tới các thread khác nhau nếu biến này đang được sử dụng trong nhiều thread. "

    Cách này có nhược điểm là một phương thức synchronized sẽ chạy rất chậm và tốn hiệu năng, bất kỳ Thread nào gọi đến đều phải chờ nếu có một Thread khác đang
    sử dụng. Có những tác vụ xử lý trước và sau khi tạo thể hiện không cần thiết phải block.
*/
class ThreadSafeInitialization private constructor(){

    init {
        print("This is ThreadSafeInitialization \n")
    }

    companion object{
        @Volatile
        private var instance: ThreadSafeInitialization? = null

        @Synchronized
        fun getInstance(): ThreadSafeInitialization? {
            if (instance == null) {
                instance = ThreadSafeInitialization()
            }
            return instance
        }
    }
}