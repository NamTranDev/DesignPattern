package nam.tran.strategy

class QuickSort : Sort {

    override fun sort(input: IntArray) {

        println("****************************** Quick Sort *********************************")
        val data = input.copyOf()
        println("Before Sort : ${data.joinToString()}")
        quickSort(data,0,data.size - 1)
        println("After Sort : ${data.joinToString()}")
    }

    private fun quickSort(a: IntArray, i: Int, j: Int) {
        val k: Int
        val pivotIndex = findPivot(a, i, j)
        if (pivotIndex != -1) {
            k = partition(a, i, j, a[pivotIndex])
            quickSort(a, i, k - 1)
            quickSort(a, k, j)
        }
    }

    private fun findPivot(a: IntArray, i: Int, j: Int): Int {
        var k = i + 1
        val firstKey: Int = a[i]
        while (k <= j && a[k] == firstKey) {
            k += 1
        }
        return when {
            k > j -> {
                -1
            }
            a[k] > firstKey -> {
                k
            }
            else -> {
                i
            }
        }
    }

    private fun partition(a: IntArray, i: Int, j: Int, pivot: Int): Int {
        var left: Int = i
        var right: Int = j
        while (left < right) {
            while (a[left] < pivot) {
                left += 1
            }
            while (a[right] >= pivot) {
                right -= 1
            }
            if (left < right) {
                val temp: Int = a[right]
                a[right] = a[left]
                a[left] = temp
            }
        }
        return left
    }
}