package song.cpe.leetcode.solution

class Solution {

    enum class RomanNumber(val value: Int) {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000)
    }

    inline fun convertToInteger(romanNumber: String) = RomanNumber.valueOf(romanNumber).value

    fun romanToInt(s: String): Int {
        println()
        return 0
    }
}
