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

    fun romanToInt(input: String): Int {
        var inputArrays = input.toCharArray()
        var sum = 0
        var firstLengthIndex = 0
        if (inputArrays.size == 1) {
            return convertToInteger(inputArrays.get(0).toString())
        }
        for (i in 0..inputArrays.size - 1) {
            val numStr = inputArrays.get(i).toString()
            if (i == inputArrays.size - 1 && i == firstLengthIndex) {
                sum += convertToInteger(inputArrays.get(i).toString())
                continue
            } else if (i < inputArrays.size - 1 && convertToInteger(inputArrays.get(i).toString()) > convertToInteger(
                    inputArrays.get(i + 1).toString()
                ) && i == firstLengthIndex
            ) {
                sum += convertToInteger(inputArrays.get(i).toString())
                firstLengthIndex = i + 1
                continue
            } else if (inputArrays.get(firstLengthIndex).toString() != numStr || i == inputArrays.size - 1) {
                if (convertToInteger(
                        inputArrays.get(firstLengthIndex).toString()
                    ) == convertToInteger(inputArrays.get(i).toString())
                ) {
                    var tempSum = 0
                    for (j in firstLengthIndex..i) {
                        tempSum += convertToInteger(inputArrays.get(j).toString())
                    }
                    sum += tempSum
                } else if (convertToInteger(inputArrays.get(firstLengthIndex).toString()) >= convertToInteger(
                        inputArrays.get(i).toString()
                    )
                ) {
                    if (i < inputArrays.size - 1 && convertToInteger(inputArrays.get(i).toString()) < convertToInteger(
                            inputArrays.get(i + 1).toString()
                        )
                    ) {
                        var tempSum = 0
                        for (j in firstLengthIndex..i - 1) {
                            tempSum += convertToInteger(inputArrays.get(j).toString())
                        }
                        sum += tempSum
                        firstLengthIndex = i
                        continue
                    } else {
                        var tempSum = 0
                        for (j in firstLengthIndex..i) {
                            tempSum += convertToInteger(inputArrays.get(j).toString())
                        }
                        sum += tempSum
                    }
                } else {
                    var tempSum = 0
                    for (j in firstLengthIndex..i - 1) {
                        tempSum += convertToInteger(inputArrays.get(j).toString())
                    }
                    sum += convertToInteger(inputArrays.get(i).toString()) - tempSum
                }
                firstLengthIndex = i + 1
                continue
            }
        }
        return sum
    }
}
