package Maximum_Subarray

import kotlin.math.max

class MaximumSubarray {
    fun maxSubArray(nums: IntArray): Int {
        var result = nums[0]
        var currentSum = 0
        for (num in nums){
            if (currentSum < 0) currentSum = 0
            currentSum += num
            result = Math.max(result, currentSum)
        }
        return result
    }
}