package com.himanshidafouty.playground.part3FP


object Collections {
  //ranges -collections of iterable numbers and characters
  val f1to10 = 1 to 10 //just describes the start and end of ranges
  //array - native arrays(JVM - stored natively on the OS)
  val numArray = Array(1, 2, 3, 4, 5, 6)
  numArray.update(0, 100)

  //sets - collections with no duplicates(decided with equals method)
  val aSet = Set(1,2,2,2,2,2,89)
  val a2 = aSet + 90
  val d0 = aSet - 2
  val d7 = aSet - 8



  def main(args: Array[String]): Unit = {
    f1to10.map(n=>println("Scala"))
    f1to10.foreach(n=>println("Hi"))
    println((1 to 8).toList)
    println(numArray.mkString(","))
    println(numArray(0))
    println(aSet)
    println(aSet.contains(89))

    println(a2)
    println(d0)
    println(d7)
  }

}
