package binarysearch

fun main() {
    val inputArray = intArrayOf(4,5,6,7,0,1,2)
    print(searchElement(inputArray, 5))
}

fun searchElement(intArray: IntArray, target: Int): Int {
    var pivot = findPivotIndex(intArray)
   /* if(target == intArray[pivot]) {
        return pivot
    }
    if(target == intArray[0]) {
        return 0
    }
    if(target == intArray[intArray.size -1]) {
        return intArray.size -1
    }*/
    var start:Int
    var end: Int
    var mid: Int
    if(target < intArray[0]) {
        start = pivot
        end = intArray.size-1
    } else {
        start = 0
        end = pivot-1
    }
    mid = start + (end - start)/2

    while(start <= end) {
        if(intArray[mid] == target) {
            return mid
        } else if(intArray[mid] > target) {
            end = mid -1
        } else if(intArray[mid] < target) {
            start = mid +1
        }
        mid = start + (end - start)/2
    }
    return -1
}