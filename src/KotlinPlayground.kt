

sealed class Machine {
    data class Computer(val name: String = "Mac")
}

fun main() {
    var computer = Machine.Computer()
    //print(computer is Machine)
}