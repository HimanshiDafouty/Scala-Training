package com.himanshidafouty.playground.part2OOPs
//Exceptions are instances of classes that describes a crash in our application
object Exceptions {
  //programmatic crash throwing
  def sum(n:Int):Int= {
    if (n < 0) throw new IllegalArgumentException("Negative numbers are not supported")
    else if (n == 0) 0
    else {
      n + sum(n - 1)
    }
  }

    //guard from exception -try and catch
    val attempt = try{
      println(sum(-10))
    }catch{
      case e: IllegalArgumentException => -1
      case e: RuntimeException => Int.MaxValue


    }
    /*
    *Hierarchy of exceptions
    Throwable - trait
    error - crashes we cannot control , JVM related crashes , stack overflow
    exception - user facing crash
     */

  def main(args: Array[String]): Unit = {

  }

}
