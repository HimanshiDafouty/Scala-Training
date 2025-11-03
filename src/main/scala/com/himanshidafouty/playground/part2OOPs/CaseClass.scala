package com.himanshidafouty.playground.part2OOPs

object CaseClass {
  // case-classes are light-weight data structures ,they have a bunch of extra-properties that are granted by the compiler at the moment we define a case class
  case class Pet(name:String , age:Int) {
    //constructor args of case class are auto promoted to fields
    //they can be built without the new keyword because of the companion object
    // it already has some representation , setup by the compiler  - toString , equals , hash
    //they have companion object already created
    //they are serializable
    //they are eligible for pattern-matching
    //we can also define case object , like case classes but only that we do not create multiple instance of this type , since it is the only instance of it type as declared with object keyword



  }

  class Pet_V2(name:String , age:Int) {

  }
  val dino = Pet("Dino" , 2)
  val dino_V2 = Pet_V2("Dino" , 2)
  val dinoYounger  = dino.copy(age=1 ) //new instance of Pet with the same data , EXCEPT the argument we pass ,( it will be overridden
  def main(args: Array[String]): Unit = {
    println(dino.toString)// toString representation of case class is very human-readable
    println(dino_V2.toString)
    //in case class two instances of same class and same data are equal


  }

}
