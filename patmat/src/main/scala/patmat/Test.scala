package patmat

import patmat.Huffman.{Bit, CodeTree, Fork, Leaf}

/**
  * @author akt.
  */
object Test {
  def main(args: Array[String]): Unit = {
    val tree: Fork = Huffman.makeCodeTree(Leaf('a', 1), Leaf('b', 2))
    println(tree.weight)
    println(tree.chars)
    val times: List[(Char, Int)] = Huffman.times(List('a', 'b', 'a', 'b', 'a', 'c'))
    println(times)
    val leafList: List[Leaf] = Huffman.makeOrderedLeafList(times)
    println(leafList)

    val codedTree: CodeTree = Huffman.createCodeTree(List('a', 'b', 'a', 'b', 'a', 'c'))
    println(codedTree)
    println(List(1) ::: List(2))

    println(Huffman.decodedSecret)

    val ints: List[Int] = List(1, 2, 3)
    println(ints.find(k => k == 2).get)

    val encode: List[Bit] = Huffman.quickEncode(codedTree)(List('a', 'b', 'c'))
    val encode1: List[Bit] = Huffman.encode(codedTree)(List('a', 'b', 'c'))
    println("---------")
    println(encode)
    println(encode1)

    def init[T](xs: List[T]): List[T] = xs match {
      case List() => throw new Error("init of empty list")
      case List(x) => List()
      case y :: ys => y :: init(ys)
    }

    def reverse[T](xs: List[T]): List[T] = xs match {
      case List() => List()
      case head :: tail => reverse(tail) ++ List(head)
    }

    println(init(List(1, 2, 3)))
    println(init(List(1)))

    def removeAt[T](n: Int, xs: List[T]) = xs match {
      case List() => xs
      case head :: tail => {
        if(n == 0){

        }
      }
    }

  }

}
