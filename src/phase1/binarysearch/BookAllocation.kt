package phase1.binarysearch

fun main() {
  var bookArray = intArrayOf(10,20,30,40)
    print(findMinimumOfMaximumPages(bookArray, 2))
}

fun findMinimumOfMaximumPages(bookArray: IntArray, m:Int): Int {
    var start = 0
    var count = 0
    bookArray.forEach {
        count += it
    }
    var end = count

    var mid = start + (end - start)/2
    var ans = -1

    while (start <= end) {
        if(isPossible(mid, bookArray, m)) {
            ans = mid
            end = mid -1
        } else {
            start = mid +1
        }
        mid = start + (end - start)/2
    }
    return ans
}

fun isPossible(mid: Int, bookArray: IntArray, m: Int): Boolean {
    var studentCount = 1
    var pages = 0
    var isPossible = true

        bookArray.forEachIndexed { index, i ->
            if(pages+i <= mid && i <=mid) {
                pages += i
            } else {
                studentCount ++
                pages = 0
                pages+=i
            }
            if(studentCount > m) {
                isPossible = false
                return isPossible
            }
        }
    return isPossible
}