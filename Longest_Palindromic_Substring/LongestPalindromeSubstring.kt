package Longest_Palindromic_Substring

class LongestPalindromicSubstring{

    fun longestPalindrome(s: String): String {
        var substring = ""
        var substringLength = 0
        for(i in s.indices){
            // check for odd string length
            var left = i
            var right = i
            while (left >= 0 && right < s.length && s[left] == s[right]){
                if ((right - left + 1) > substringLength) {
                    substring = s.substring(left, right + 1)
                    substringLength = right - left + 1
                }
                left -= 1
                right += 1
            }

            // check for even string length
            left = i
            right = i + 1
            while (left >= 0 && right < s.length && s[left] == s[right]){
                if ((right - left + 1) > substringLength) {
                    substring = s.substring(left, right + 1)
                    substringLength = right - left + 1
                }
                left -= 1
                right += 1
            }
        }
        return substring
    }
}
