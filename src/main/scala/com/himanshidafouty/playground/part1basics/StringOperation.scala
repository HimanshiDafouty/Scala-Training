package com.himanshidafouty.playground.part1basics

object StringOperation {
  //functions attached to them (string)
  val aString = "Scala Rocks"
  val length = aString.length
  val checkEmpty = aString.isEmpty
  def main(args:Array[String]):Unit ={
    println(aString+ " Very Much")

    //interpolation - injecting values or expressions inside a string
    val name = "A"
    val age = 10

    val s = s"Hi my name is $name and my age is ${10+9}"
    println(s)

    }
  }
