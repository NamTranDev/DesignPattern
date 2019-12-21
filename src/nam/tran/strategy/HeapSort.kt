package nam.tran.strategy

class HeapSort(private val isIncrease: Boolean) : Sort {

    override fun sort(input: IntArray) {
        println("****************************** Heap Sort *********************************")
        val data = input.copyOf()
        println("Before Sort : ${data.joinToString()}")
        if (isIncrease)
            heapSortIncrease(data)
        else
            heapSortDecrease(data)
        println("After Sort : ${data.joinToString()}")
    }

    private fun pushDown(a: IntArray, first: Int, last: Int) {
        var r = first
        while (r <= last / 2) {
            if (last / 2 == r) {
                if (a[r - 1] > a[last - 1]) {
                    val temp = a[last - 1]
                    a[last - 1] = a[r - 1]
                    a[r - 1] = temp
                }
                r = last
            } else if (a[r - 1] > a[2 * r - 1] && a[2 * r - 1] <= a[2 * r]) {
                val temp = a[2 * r - 1]
                a[2 * r - 1] = a[r - 1]
                a[r - 1] = temp
                r *= 2
            } else if (a[r - 1] > a[r * 2] && a[r * 2] < a[2 * r - 1]) {
                val temp = a[r * 2]
                a[r * 2] = a[r - 1]
                a[r - 1] = temp
                r = 2 * r + 1
            } else {
                r = last
            }
        }
    }

    private fun pushUp(a: IntArray, first: Int, last: Int) {
        var r = first
        while (r <= last / 2) {
            if (last == 2 * r) {
                if (a[r - 1] < a[last - 1]) {
                    val temp = a[last - 1]
                    a[last - 1] = a[r - 1]
                    a[r - 1] = temp
                }
                r = last
            } else if (a[r - 1] < a[2 * r - 1] && a[2 * r - 1] >= a[2 * r]) {
                val temp = a[2 * r - 1]
                a[2 * r - 1] = a[r - 1]
                a[r - 1] = temp
                r *= 2
            } else if (a[r - 1] < a[r * 2] && a[r * 2] > a[2 * r - 1]) {
                val temp = a[r * 2]
                a[r * 2] = a[r - 1]
                a[r - 1] = temp
                r = 2 * r + 1
            } else {
                r = last
            }
        }
    }

    private fun heapSortIncrease(a: IntArray) {
        for (i in a.size / 2 downTo 1) {
            pushDown(a, i, a.size)
        }
        for (i in a.size downTo 2) {
            val temp = a[i - 1]
            a[i - 1] = a[0]
            a[0] = temp
            pushDown(a, 1, i - 1)
        }
    }

    private fun heapSortDecrease(a: IntArray) {
        for (i in a.size / 2 downTo 1) {
            pushUp(a, i, a.size)
        }
        for (i in a.size downTo 2) {
            val temp = a[i - 1]
            a[i - 1] = a[0]
            a[0] = temp
            pushUp(a, 1, i - 1)
        }
    }
}