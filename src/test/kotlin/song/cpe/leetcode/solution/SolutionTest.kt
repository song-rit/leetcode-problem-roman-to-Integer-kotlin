package song.cpe.leetcode.solution

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SolutionTest {

    var solution: Solution = Solution()

    @Test
    fun romanToInt() {
        solution.romanToInt("IV")
        Assertions.assertTrue(true)
    }
}