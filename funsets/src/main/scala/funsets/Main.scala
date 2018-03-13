package funsets

object Main extends App {

  import FunSets._

  println(contains(union(FunSets.singletonSet(1), FunSets.singletonSet(2)), 2))

  private val intersect1: Set = intersect(union(FunSets.singletonSet(2), FunSets.singletonSet(10)), FunSets.singletonSet(1))
  println(contains(intersect1, 1))
  println(contains(intersect1, 2))


  private val diff1: Set = diff(union(FunSets.singletonSet(1), FunSets.singletonSet(2)), FunSets.singletonSet(1))
  println(FunSets.toString(diff1))
  println(contains(diff1, 2))
  println(contains(diff1, 1))

  private val union1: Set = union(union(FunSets.singletonSet(1), FunSets.singletonSet(2)), FunSets.singletonSet(3))
  private val filteredSet: Set = FunSets.filter(union1, k => k % 2 == 1)
  println(contains(filteredSet, 1) && contains(filteredSet, 3))


  private val forall1: Boolean = forall(union1, k => k % 2 == 1)
  println(forall1)

  println("Exist:" + exists(union1, k => k == 4))

  println("Mapped set:" + FunSets.toString(map(union1, k => k + 1)))

}
