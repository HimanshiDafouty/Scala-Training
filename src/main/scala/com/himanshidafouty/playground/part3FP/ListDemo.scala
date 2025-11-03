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




  //high-order function , that takes other function as arguments/return function as result


  //map-transforms a list by applying a function on every element

  val aNewList = List(1,2,3,4,5,6,7,8)

  val tenXList = aNewList.map(x=>x*10)//returns a new List

  val strList = aNewList.map(x=>s"Scala$x")



  //filter - transforms a list by just keeping the items satisfying a boolean function
  val evenList = aNewList.filter(x=>x%2==0)


  //flatMap- transform a list by applying a function to every element , that in case of map we return a value while in case of flatMap we need to return a new List


  val expandedList = aNewList.map(x =>List(x , x+1))
  val expandedList_V2 = aNewList.flatMap(x =>List(x , x+1))

































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
    println(evenList.mkString("[" , "," , "]"))
    println(strList.mkString("[" , "," , "]"))
    println(expandedList.mkString("[" , "," , "]"))
    println(expandedList_V2.mkString("[" , "," , "]"))

    //flatMap - transform every element into miniList , but also combine them in a single list


  }

}
