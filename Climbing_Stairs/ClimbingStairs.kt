package Climbing_Stairs

class ClimbingStairs {
    fun climbStairs(n: Int): Int {
        var pointer1 = 1
        var pointer2 = 1

        for (i in 0 until n - 1) {
            val temp = pointer1
            pointer1 += pointer2
            pointer2 = temp
        }

        return pointer1
    }
}