package nam.tran.strategy

class BubbleSort : Sort {

    override fun sort(input: IntArray) {

        println("****************************** Bubble Sort *********************************")
        val data = input.copyOf()
        println("Before Sort : ${data.joinToString()}")
        for (i in data.indices) {
            for (j in data.size - 1 downTo i + 1) {
                if (data.get(j) < data[j - 1]) {
                    val temp: Int = data[j - 1]
                    data[j - 1] = data[j]
                    data[j] = temp
                }
            }
        }
        println("After Sort : ${data.joinToString()}")
    }
}