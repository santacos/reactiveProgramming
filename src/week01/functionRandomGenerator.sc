import java.util.Random

val rand = new Random()
rand.nextInt(10)

//systematic way to get random values for other domains
//such as Boolean, String, pairs, tuples, list, set, tree


trait Generator[+T]{
  def generate: T
}

val integers = new Generator[Int]{
  val rand = new Random()
  def generate = rand.nextInt()
}

val booleans = new Generator[Boolean] {
  def generate = integers.generate > 0
}

val pair = new Generator[(Int,Int)] {
  def generate = (integers.generate,integers.generate)
}


//Try to eliminate Boiler plate of new Generator[+T]
val secondeBooleans = for(x <- integers) yield (x > 0)