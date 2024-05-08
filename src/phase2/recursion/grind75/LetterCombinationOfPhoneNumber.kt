package phase2.recursion.grind75

fun main() {
    letterCombinations("").forEach {
        println(it)
    }
}

fun letterCombinations(digits: String): List<String> {
   var resultString = StringBuilder()
   var resultList = mutableListOf<String>()
   var keyMapArray = arrayOf("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")
    findPermutations(digits, keyMapArray, resultList, resultString, 0)
    return  resultList
}

fun findPermutations(digits: String, keyMapArray: Array<String>, resultList: MutableList<String>, resultString: StringBuilder, index: Int) {
    if (index >= digits.length) {
        if (resultString.isNotEmpty())
            resultList.add(resultString.toString())
        return
    }

    var keyNum =  Integer.valueOf(digits[index].toString())
    var keyString = keyMapArray[keyNum]

    for (i in 0..keyString.length-1) {
        resultString.append(keyString[i])
        findPermutations(digits, keyMapArray, resultList, resultString, index+1)
        resultString.deleteCharAt(index)
    }
}