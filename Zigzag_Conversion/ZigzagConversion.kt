package Zigzag_Conversion

class ZigzagConversion {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) return s
        var result = ""
        val step = (numRows - 1) * 2
        for (r in 0 until numRows) {
            for (i in r until s.length step step) {
                result += s[i]
                if (r > 0 && r < numRows - 1 && i + step - 2 * r < s.length) {
                    result += s[i + step - 2 * r]
                }
            }
        }
        return result
    }
}