package arrays

fun main() {
    var arr1 = intArrayOf(2,3,1,3,2,4,6,7,9,2,19)
    var arr2 =  intArrayOf(2,1,4,3,9,6)
    relativeSortArray(arr1, arr2).forEach {
        print(it)
    }
}

fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
    var hashmap = linkedMapOf<Int, MutableList<Int>>()
    var leftOverElements = mutableListOf<Int>()
    for (i in arr2) {
        hashmap[i] = mutableListOf()
    }
    for (i in arr1) {
        hashmap[i]?.add(i)
    }
   leftOverElements = arr1.filter {
       !arr2.contains(it)
   }.toMutableList()
    var resultList  = mutableListOf<Int>()
   hashmap.map {
       resultList.addAll(it.value)
   }
    leftOverElements.sort()
    resultList.addAll(leftOverElements)
   return resultList.toIntArray()
}