package phase2.linkedlist.grind75

import kotlin.math.sign

class LRUCache(capacity: Int) {

    private var cache: MutableMap<Int, LruCacheNode> = mutableMapOf()
    private  var head: LruCacheNode? = null
    private  var tail: LruCacheNode? = null
    private var count = 0
    private var capacity = capacity

    fun get(key: Int): Int {
       if (cache.containsKey(key)) {
           val node = cache[key] as LruCacheNode

           if (head == tail || node == head) {
               return node.keyValue.second
           }

           if (node == tail) {
               tail = tail?.prev
               tail?.next = null
               node.next = head
               head?.prev = node
               head = node
               head?.prev = null

           } else {
               node.prev?.next = node.next
               node.next?.prev = node.prev

               node.next = head
               head?.prev = node
               head = node
               node.prev = null
           }
           return node.keyValue.second
       }
        return -1
    }

    fun put(key: Int, value: Int) {
         //check in cache, if present then move it to the head position
         //if not present then add it to the head position and adjust LinkedList as per capacity
         if (cache.containsKey(key)) {
             val node = cache[key] as LruCacheNode
             node.keyValue = Pair(key, value)
             if (head == tail || node == head) {
                 return
             }
             if (node == tail) {
                 tail = tail?.prev
                 tail?.next = null
                 node.next = head
                 head?.prev = node
                 head = node
                 head?.prev = null
             } else {
                 node.prev?.next = node.next
                 node.next?.prev = node.prev

                 node.next = head
                 head?.prev = node
                 head = node
             }
         } else {
             count+=1
             val node = LruCacheNode(Pair(key, value))
             cache[key] = node
             if (head == null) {
                 head = node
                 tail = node
             } else {
                 head?.prev = node
                 node.next = head
                 head = node
                 if (count > capacity) {
                     cache.remove(tail?.keyValue?.first)
                     tail = tail?.prev
                     tail?.next = null
                 }
             }
         }

    }

    class LruCacheNode(var keyValue: Pair<Int, Int>) {

        var prev: LruCacheNode? = null
        var next: LruCacheNode? = null

        init {
            prev = null
            next = null
        }
    }
}
