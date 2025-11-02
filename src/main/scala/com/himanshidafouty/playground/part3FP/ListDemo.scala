package com.himanshidafouty.playground.part3FP

object ListDemo {
  val aList:List[Int]=List(1,2,3)//List type has a companion object with apply method

  //List in scala is a singly-linked-list

  val listHead = aList.head
  val rest = aList.tail

  val newList = 0 :: aList
  val newList_V2 = aList :+ 4

  //utility methods
  val scalaX5 = List.fill(5)("Scala").mkString("[" , "," , "]")
  val reverseList = aList.reverse
  val conactenateList = aList ++List(4, 5, 6)
  val stringRep = aList.mkString(",")
  val total = aList.reduce((num1, num2)=>num1+num2)
  val a = ()=>println("hello")
  def hello(): Unit = {
    println("hello")
  }
  val b = hello()

  def main(args:Array[String]):Unit={
    println(aList.toString()) //printing an instance of class actually calls it t0 string method
    println(listHead)
    println(rest)
    println(newList)
    println(newList_V2)
    println(scalaX5)
    println(reverseList)
    println(conactenateList)
    println(stringRep)
    println(total)
    a()
    println(b)


  }

}
