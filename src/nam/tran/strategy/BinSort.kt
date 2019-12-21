package nam.tran.strategy

class BinSort : Sort {

    override fun sort(input: IntArray) {
        println("****************************** Bin Sort *********************************")
        val data = input.copyOf()
        println("Before Sort : ${data.joinToString()}")
        binSort(data, maxValue(data))
        println("After Sort : ${data.joinToString()}")
    }

    private fun maxValue(a: IntArray): Int {
        var maxValue = 0
        for (i in a.indices) {
            if (a[i] > maxValue) maxValue = a[i]
        }
        return maxValue
    }

    private fun binSort(a: IntArray, maxValue: Int) {
        val temp = IntArray(maxValue + 1)
        for (i in a.indices) {
            temp[a[i]]++
        }
        var outpost = 0
        for (i in temp.indices) {
            for (j in 0 until temp[i]) {
                a[outpost++] = i
            }
        }
    }
}