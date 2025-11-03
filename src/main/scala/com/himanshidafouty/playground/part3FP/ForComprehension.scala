package com.himanshidafouty.playground.part3FP

object ForComprehension {

  val numbers = List(1,2,3,4)
  val colors = List("Red" , "Blue" , "Orange")

  val combinator = numbers.flatMap(x=>colors.map(c=>s"$x-$c"))
  //For Comprehension - are expressions not loops
  val combinator_V2 = for{
    n <- numbers
    c <- colors

  }yield s"$n-$c"

  val numberList = List(1, 2, 3, 4, 5, 6, 7, 8)
  val lettersList = List('A' , 'B' , 'C' , 'D' , 'E' , 'F' , 'G' , 'H')

  val combinedList = lettersList.flatMap(l=>numberList.map(n=>s"$l$n"))

  val combinedList_V2 = for {
    l<-lettersList
    n <-numberList
//    l<-lettersList


  }yield s"$l$n"

  def main(args:Array[String]):Unit={
    println(combinator.mkString("[" , "," ,"]"))
    println(combinator_V2)
    println(combinator_V2.mkString("[" , "," , "]"))
    println(combinedList.mkString("[" , "," , "]"))
    println(combinedList_V2.mkString("[" , "," , "]"))


  }

}
