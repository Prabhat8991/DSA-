package arrays

fun main() {
   val arr = intArrayOf(1,2,2,3,4,5,5,6)
    findDuplicate(arr).forEach {
        print(it)
    }
}

fun findDuplicate(arr: IntArray): List<Int> {
    val hashmap = mutableMapOf<Int, Int>()
    arr.forEach {
        if(hashmap.containsKey(it)) {
            hashmap[it] = it
        } else {
            hashmap[it] = 0
        }
    }
    val resultArr = arrayListOf<Int>()
    hashmap.forEach { (key, value) ->
        if(value != 0) {
            resultArr.add(value)
        }
    }
    return resultArr
}