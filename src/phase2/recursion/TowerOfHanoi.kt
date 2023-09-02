package phase2.recursion

fun towerOfHanoi(n: Int, start: String, intermediate: String, destination: String) {
   if (n == 1) {
       println("Move 1 to $destination")
       return
    }
       towerOfHanoi(n-1, start, destination, intermediate)
       println("Move $n to $destination")
       towerOfHanoi(n-1, intermediate, start, destination)
}


fun main() {
    towerOfHanoi(3, "a", "b", "c")
}
