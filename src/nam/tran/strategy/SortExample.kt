package nam.tran.strategy

class SortExample(private val data : IntArray) {

    lateinit var mSortType : Sort

    fun sort(){
        mSortType.sort(data)
    }
}