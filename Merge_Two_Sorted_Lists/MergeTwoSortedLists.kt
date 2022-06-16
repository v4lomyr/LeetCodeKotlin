package Merge_Two_Sorted_Lists

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val sortedList = ListNode(0)
        var prev = sortedList

        var listA = list1
        var listB = list2
        while (listA != null && listB != null) {
            if (listA.`val` <= listB.`val`) {
                prev.next = listA
                listA = listA.next
            } else {
                prev.next = listB
                listB = listB.next
            }
            prev = prev.next!!
        }
        when (listA) {
            null -> prev.next = listB
            else -> prev.next = listA
        }

        return sortedList.next
    }
}