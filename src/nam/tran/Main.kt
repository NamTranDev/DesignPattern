package nam.tran

import nam.tran.strategy.*

object Main {

    @JvmStatic
    fun main(args: Array<String>) { // write your code here

//        Strategy Pattern
        val sortExample = SortExample(intArrayOf(10, 25, 4, 7, 30, 55, 1, 55, 7, 44, 5, 5, 7, 8, 29))
        sortExample.mSortType = QuickSort()
        sortExample.sort()
        sortExample.mSortType = BubbleSort()
        sortExample.sort()
        sortExample.mSortType = InsertionSort()
        sortExample.sort()
        sortExample.mSortType = SelectionSort()
        sortExample.sort()
        sortExample.mSortType = BinSort()
        sortExample.sort()
        sortExample.mSortType = HeapSort(true)
        sortExample.sort()
    }
}