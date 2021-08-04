package OopsAsg.OrderedTrait

class Person(var name: String, var age: Int) extends Ordered[Person] {

  def compare(that: Person): Int = {

    if (that.name == this.name) this.age.compare(that.age)

    else this.name.compare(that.name)
  }

}

object Person {

  def main(args: Array[String]): Unit = {

    val personOne = new Person("Test", 24)
    val personTwo = new Person("Test", 25)
    println(personOne < personTwo)
    println(personOne > personTwo)
    personOne.name ="TestAgain"
    println("\n"+(personOne < personTwo))
    println(personOne > personTwo)

  }
}