package com.himanshidafouty.playground.part3FP

object MapTuples {
  //tuple - are group value under the same greater value
  // tuple having 2 elements have some syntactic sugar
  val aTuple = (2, "Hello")
  val aTuple_V2 = 2 -> "Hello"

  //maps - associates key to value , we always have unique keys

  val aMap = Map(
    1 -> "Hello",
    2 -> "Hi",
    3 -> "Hey"
  )
  val newEntry = 4 -> "Namaste"
  val newAMap = aMap + newEntry
  val no1 = aMap - 1
  def main(args: Array[String]): Unit = {
    println(aTuple._1)
    println(aTuple_V2._1)
    println(aTuple_V2._2)
    println(aMap.contains(3))
    println(aMap(1))
    println(newAMap)
    println(newAMap.keySet)
    print(aMap.values.toList.mkString("[", "," , "]"))


  }

}
