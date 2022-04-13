package binarysearch

fun main() {
 var input = 50
    print(findSquareRoot(input))
}

fun findSquareRoot(n: Int): Int {
    var start = 0
    var end = n
    var mid = start + (end - start)/2
    var ans = 0
    while(start <= end) {
        if(mid*mid <= n) {
            ans = mid
            start = mid +1
        } else {
            end = mid -1
        }
        mid = start + (end - start)/2
    }
    return ans
}