package forcomp

import forcomp.Anagrams.Occurrences

/**
  * @author akt.
  */
object Test {
  def main(args: Array[String]): Unit = {
    val wordOccurrences: Occurrences = Anagrams.wordOccurrences("Aabcedd")

    val tuples1: List[(Char, Int)] = List(('1' -> 2))
    val tuples2: List[(Char, Int)] = List(('1' -> 2))

    println(Anagrams.combinations(List(('a', 2), ('b', 2))))
    println(wordOccurrences)

    println(Anagrams.subtract(List(('a', 2), ('b', 2)), List(('a', 2))))
  }

}
