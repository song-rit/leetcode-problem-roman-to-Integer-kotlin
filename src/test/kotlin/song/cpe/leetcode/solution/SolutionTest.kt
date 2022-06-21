package song.cpe.leetcode.solution


import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class SolutionTest {

    var solution: Solution = Solution()

    companion object {
        @JvmStatic
        fun inputs(): List<Arguments> {
            return listOf(
                Arguments.of("IV", 4),
                Arguments.of("V", 5),
                Arguments.of("I", 1),
                Arguments.of("IVV", 9),
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("DCXXI", 621),
                Arguments.of("MDCCCLXXXIV", 1884),

            )
        }
    }

    @ParameterizedTest
    @MethodSource("inputs")
    fun romanToInt(input: String, expectedValue: Int) {
        val result = solution.romanToInt(input)
        println("result: $result")
        Assertions.assertEquals(expectedValue, result)
    }
}