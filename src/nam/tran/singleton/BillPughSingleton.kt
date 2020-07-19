package nam.tran.singleton

/*
    Với cách làm này bạn sẽ tạo ra static nested class với vai trò 1 Helper khi muốn tách biệt chức năng cho
    1 class function rõ ràng hơn. Đây là cách thường hay được sử dụng và có hiệu suất tốt

    Khi Singleton được tải vào bộ nhớ thì SingletonHelper chưa được tải vào. Nó chỉ được tải khi và chỉ khi phương thức getInstance() được gọi.
    Với cách này tránh được lỗi cơ chế khởi tạo instance của Singleton trong Multi-Thread, performance cao do tách biệt được quá trình xử lý.
    Do đó, cách làm này được đánh giá là cách triển khai Singleton nhanh và hiệu quả nhất.
*/
class BillPughSingleton private constructor() {

    init {
        print("This is BillPughSingleton \n")
    }

    companion object {
        private object SingletonHelper {
            val INSTANCE = BillPughSingleton()
        }

        fun getInstance(): BillPughSingleton? {
            return SingletonHelper.INSTANCE
        }
    }
}