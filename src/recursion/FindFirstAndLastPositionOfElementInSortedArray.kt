package recursion

fun main() {
    print(findLastPositionOfElement(intArrayOf(1,2,3,4,4,4,5,6), 4, 0, 7, 0))
}

fun findFirstPositionOfElement(arr: IntArray, key: Int, start: Int, end: Int, ans: Int): Int {
    var start = start
    var end = end
    var ans = ans
    if (start > end) {
        return ans
    }

    var mid = start + ((end - start)/2)

    if (arr[mid] == key) {
        ans = mid
        end = mid - 1
    }

    if (arr[mid] > key) {
        end = mid -1
    } else {
        start = mid+1
    }
    return findFirstPositionOfElement(arr, key, start, end, ans)
}

fun findLastPositionOfElement(arr: IntArray, key: Int, start: Int, end: Int, ans: Int): Int {
    var start = start
    var end = end
    var ans = ans
    if (start > end) {
        return ans
    }

    var mid = start + ((end - start)/2)

    if (arr[mid] == key) {
        ans = mid
        start = mid + 1
    }

    if (arr[mid] > key) {
        end = mid -1
    } else {
        start = mid+1
    }
    return findFirstPositionOfElement(arr, key, start, end, ans)
}