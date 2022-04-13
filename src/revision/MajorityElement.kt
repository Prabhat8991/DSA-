package revision

fun main(args: Array<String>) {
    print(getMajorityElement(intArrayOf(1,2,3,4,5,5,5,5,6,6,6)))
}

fun getMajorityElement(arr: IntArray): Int {
    var count =1
    var res = 0

    for(i in arr.indices) {
        if(arr[i] == res) {
            count++
        } else {
            count--
        }

        if(count == 0) {
            count = 1
            res = arr[i]
        }
    }
    return res
}