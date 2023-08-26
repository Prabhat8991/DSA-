package phase1.revision

fun main(args: Array<String>) {
 printMaxAndMinInArray(intArrayOf(2,3,1,4,6,5))
}

fun printMaxAndMinInArray(intArray: IntArray) {
    var minimum = Int.MAX_VALUE
    var maximum = Int.MIN_VALUE

    for(i in intArray) {
       if (i > maximum) {
           maximum = i
       }
       if(i < minimum) {
           minimum = i
       }
    }
    print("Maximum $maximum and Minimum $minimum")
}