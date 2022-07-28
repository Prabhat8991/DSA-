


fun main() {
   var arrayList = mutableListOf<Int>(3,11)
    print(getPair(arrayList))
}

inline fun test(crossinline lambda: () -> Unit, lambda2: () -> Unit) {
    lambda()
    lambda2()
}

inline fun <reified T>getType(input: T) {
    print(T::class.java)
}

class TestClass {
    companion object {
        const val TEST = "HI"
    }
}
data class Person(val name: String = "prabhat")


class TestGenerics<in T>(private var t: T) {
    fun testing(x: T){
       print(x)
    }
}

fun getPair(arr: List<Int>): Pair<Int, Int> {
    val resultSet = mutableSetOf<Int>()
    var complimentaryList=  mutableListOf<Int>()
// (n)
    arr.forEach { it ->
        val complementaryElement = 4-it
        resultSet.add(it)
        complimentaryList.add(complementaryElement)
    }
    var elementIndex = 0
    complimentaryList.forEachIndexed { index, element ->
        if (resultSet.contains(element)) {
            elementIndex = index
        }
    }

    return Pair(arr[elementIndex],complimentaryList[elementIndex] )
}

