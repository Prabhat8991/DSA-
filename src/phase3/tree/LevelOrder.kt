package phase3.tree

import java.util.*
import kotlin.collections.ArrayDeque

fun main() {
    val root = Node(10)
    root.left = Node(20)
    root.left.left = Node(40)

    root.left.right = Node(50)
    root.right = Node(30)
    root.right.left = Node(60)
    root.right.right = Node(70)

    levelOrder(root)
}

fun levelOrder(root: Node) {
    val queue: Queue<Node> = java.util.ArrayDeque()
    val arrayOfNodes = mutableListOf<List<Int>>()
    queue.add(root)
    while (queue.isNotEmpty()) {
      var levelSize = queue.size
      repeat(levelSize) {
          var node = queue.poll()
          arrayOfNodes.add(mutableListOf(node.value))
          node?.left?.let { queue.add(it) }
          node?.right?.let { queue.add(it) }
      }
    }
    println(arrayOfNodes)
}
