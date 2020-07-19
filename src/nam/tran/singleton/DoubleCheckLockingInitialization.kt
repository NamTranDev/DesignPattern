package nam.tran.singleton

/*
    chúng ta sẽ kiểm tra sự tồn tại thể hiện của lớp, với sự hổ trợ của đồng bộ hóa, hai lần trước khi khởi tạo. Phải khai báo volatile cho instance để tránh
    lớp làm việc không chính xác do quá trình tối ưu hóa của trình biên dịch
*/
class DoubleCheckLockingInitialization private constructor() {

    init {
        print("This is DoubleCheckLockingInitialization \n")
    }

    companion object{
        @Volatile
        private var instance: DoubleCheckLockingInitialization? = null

        fun getInstance(): DoubleCheckLockingInitialization? {
            // Do something before get instance ...
            if (instance == null) {
                // Do the task too long before create instance ...
                // Block so other threads cannot come into while initialize
                synchronized(DoubleCheckLockingInitialization::class.java) {
                    // Re-check again. Maybe another thread has initialized before
                    if (instance == null) {
                        instance = DoubleCheckLockingInitialization()
                    }
                }
            }
            // Do something after get instance ...
            return instance
        }
    }
}