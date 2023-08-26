package phase1.arrays

fun main() {
    val input = intArrayOf(1,2,0,2,1,0)
    sortZeroOneTwo(input).forEach {
        print(it)
    }
}

fun sortZeroOneTwo(arr: IntArray): IntArray {
    var i = 0
    var j = arr.size -1
    while(i < j) {
        if(arr[i] == 0) {
            i++
        }

        if(arr[j] == 1 || arr[j] == 2) {
            j--
        }

        if(arr[i] != 0 && arr[j] == 0) {
           arr[i] = arr[i] + arr[j]
            arr[j] = arr[i] - arr[j]
            arr[i] = arr[i] - arr[j]
            i++
            j--
        }
    }
    println("$i  $j")
    //reset j
    j = arr.size - 1

    while(i < j) {
        if(arr[i] == 1) {
            i++
        }

        if(arr[j] == 2) {
            j--
        }

        if(arr[i] != 1 && arr[j] == 1) {
            arr[i] = arr[i] + arr[j]
            arr[j] = arr[i] - arr[j]
            arr[i] = arr[i] - arr[j]
            i++
            j--
        }
    }

    return arr
}
