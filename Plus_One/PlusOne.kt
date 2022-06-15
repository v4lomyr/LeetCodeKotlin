package Plus_One

class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        var result = digits.reversedArray()
        var carry = 1
        var indice = 0
        while (carry > 0) {
            if (indice < result.size) {
                if (result[indice] == 9) {
                    result[indice] = 0
                } else {
                    result[indice] += carry
                    carry = 0
                }
            } else {
                result = append(result, carry)
                carry = 0
            }
            indice++
        }
        return result.reversedArray()
    }

    fun append(arr: IntArray, input: Int) : IntArray {
        val list: MutableList<Int> = arr.toMutableList()
        list.add(input)
        return list.toIntArray()
    }
}