package arrays

fun main() {
    var arr1 = intArrayOf(1,9,9)
    var arr2 = intArrayOf(1,9,9)
    sumOfTwoArrays(arr1, arr2).forEach {
        print(it)
    }
}

fun sumOfTwoArrays(arr1: IntArray, arr2: IntArray): List<Int> {
    var i = arr1.size-1
    var j = arr2.size-1
    var carry = 0
    var sum = 0
    var result = 0
    var resultArray = mutableListOf<Int>()
    while (i >= 0 && j >= 0) {
        sum = (arr1[i] + arr2[j] + carry)
        result = sum%10
        carry = sum/10
        resultArray.add(result)
        i--
        j--
    }

    while (i>=0) {
        sum = arr1[i]+carry
        result = sum%10
        carry = sum/10
        resultArray.add(result)
        i--
    }

    while(j>=0) {
        sum = arr2[j]+carry
        result = sum%10
        carry = sum/10
        resultArray.add(result)
        j--
    }
    return resultArray.asReversed()
}