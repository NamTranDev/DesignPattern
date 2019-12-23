package nam.tran

import nam.tran.strategy.*
import nam.tran.strategy1.King
import nam.tran.strategy1.Knight
import nam.tran.strategy1.Queen
import nam.tran.strategy1.Troll

object Main {

    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        strategyExample()
        strategyExample1()
    }

    private fun strategyExample() {
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
        sortExample.mSortType = HeapSort(false)
        sortExample.sort()
    }

    private fun strategyExample1() {
        val queen = Queen()
        queen.display()
        queen.fight()

        val king = King()
        king.display()
        king.fight()

        val knight = Knight()
        knight.display()
        knight.fight()

        val troll = Troll()
        troll.display()
        troll.fight()
    }
}