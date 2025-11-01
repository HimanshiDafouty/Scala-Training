package com.himanshidafouty.playground.part1basics

object ValuesAndTypes {
  //main is the entry point for our scala application
  def main(args:Array[String]):Unit={
    val aValue : Int = 42 // a read-only value (immutable) ,
    // val are like const in js , not reassignable and final in java 


    //type-inference : we don't always need to specify the type of variable , scala automatically infers the type of tha variable , by looking at the rhs of variable and associate it to the variable type
    val aNum = 3.15


    //common types in scala
    val aBoolean : Boolean = true
    val aString : String = "Hello"
    val aChar : Char = 'a'
    val aInteger : Int = 43 //4-bytes
    val aShort : Short = 3444//2-bytes
    val aLong : Long = 33463256325L //8-bytes
    val aFloat : Float = 31.67f //4-bytes
    val aDouble:Double = 3.14 //8-bytes



  }

}
