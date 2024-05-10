package phase2.linkedlist.grind75

fun main() {

    var lruCache = LRUCache(2)

    lruCache.put(2,1)
    lruCache.put(3,2)

    println(lruCache.get(3))
    println(lruCache.get(2))
    lruCache.put(4,3)

    println(lruCache.get(2)) //check if 3 is removed

    println(lruCache.get(3)) //check this

    println(lruCache.get(4))

}