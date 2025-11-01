package com.himanshidafouty.playground.part1basics

object RecursionExercise {
  def concatenateN(str:String , n:Int):String={
    if(n<=0){
      ""
    }else{
      str+concatenateN(str , n-1)
    }


  }

  def fibN(n:Int):Int={
//    if(n<=1){
//      1
//    }else{
//      fibN(n-1)+fibN(n-2)
//    }
    if(n==0){
      0
    }else if(n==1){
      1

    }else{
      fibN(n-1)+fibN(n-2)
    }

  }



  def main(args:Array[String]):Unit={
    println(concatenateN("Scala", 3))
    println(fibN(6))

  }


}
