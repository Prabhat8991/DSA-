package arrays

fun main() {
   val arr = intArrayOf(0,1,0,1,0,1,0)
    sortOneZero(arr).forEach {
        print(it)
    }
}

fun sortOneZero(arr: IntArray): IntArray {
    var i = 0
    var j = arr.size-1

    while(i < j ) {
      if(arr[i] == 0) {
          i++
      }
      if(arr[j] == 1) {
          j--
      }
      if(arr[i] == 1 && arr[j] == 0) {
          arr[i] = arr[i] + arr[j]
          arr[j] = arr[i] - arr[j]
          arr[i] = arr[i] - arr[j]
          i++
          j--
      }
    }
    return arr
}