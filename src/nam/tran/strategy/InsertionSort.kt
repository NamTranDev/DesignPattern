package nam.tran.strategy

class InsertionSort : Sort {

    override fun sort(input: IntArray) {

        println("****************************** Insertion Sort *********************************")
        val data = input.copyOf()
        println("Before Sort : ${data.joinToString()}")
        for (i in 1 until data.size) {
            var j = i
            while (j > 0 && data[j] < data[j - 1]) {
                val temp: Int = data[j - 1]
                data[j - 1] = data[j]
                data[j] = temp
                j -= 1
            }
        }
        println("After Sort : ${data.joinToString()}")
    }
}