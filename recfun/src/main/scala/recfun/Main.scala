package recfun

object Main {
  def main(args: Array[String]) {
    println(countChange(1, List(1, 2)))
    println(countChange(4, List(1, 2)))
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == r) {
      return 1
    }
    else if (c == 0) {
      return 1
    }
    else {
      return pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def count(chars: List[Char], prev: Char): Int = chars match {
      case head :: tail => {
        if (head == '(') {
          1 + count(tail, head)
        }
        else if (head == ')') {
          count(tail, head) - 1
        }
        else {
          count(tail, prev)
        }
      }
      case Nil => 0
    }
    return count(chars, ' ') == 0
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0)
      1
    else if (money > 0 && coins.nonEmpty)
      countChange(money - coins.head, coins) + countChange(money, coins.tail)
    else
      0
  }
}
