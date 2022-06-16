package Sqrt_X

class SqrtX {
    fun mySqrt(x: Int): Int {
        var start = 0
        var end = Int.MAX_VALUE
        var result = 0
        while (start <= end) {
            val middle = start + (end - start) / 2
            if (middle <= x / middle) {
                result = middle
                start = middle + 1
            } else {
                end = middle - 1
            }
        }
        return result
    }
}