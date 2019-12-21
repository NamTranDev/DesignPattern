package nam.tran.strategy

class SelectionSort : Sort {

    override fun sort(input: IntArray) {

        println("****************************** Selection Sort *********************************")
        val data = input.copyOf()
        println("Before Sort : ${data.joinToString()}")
        for (i in data.indices) {
            var begin = i
            for (j in i + 1 until data.size) {
                if (data[begin] > data[j]) {
                    begin = j
                }
            }
            val temp: Int = data[begin]
            data[begin] = data[i]
            data[i] = temp
        }
        println("After Sort : ${data.joinToString()}")
    }
}