package com.himanshidafouty.playground.part1basics

object Recursion {
  //recursion - function calling itself

  private def sum(n:Int):Int={
    if(n<=0) 0 else n+sum(n-1)

  }

  private def printN(str : String , n : Int):Unit ={
    if (n<=0){
      ()
    }else {
      println(str)
      printN(str , n-1)
    }
  }

  //using loop
  def sumLoop(n :Int) :Int ={
    var res =0
    var i = 1
    while( i<=n){
      res = res + i
      i=i+1
    }
    return res
  }

  private def testDivisor(n: Int, divisor: Int): Boolean = {
    if (divisor > n / 2) {
      true
    }
    else if (n % divisor == 0) {
      false
    } else {
      testDivisor(n, divisor + 1)
    }
  }


  private def isPrime(n: Int): Boolean = {
    if (n < 2) {
      n==2
    } else {
      testDivisor(n, 2)
    }
  }

  def main(args:Array[String]):Unit={
    println(sum(10))
//    println(sumLoop(10))
    printN("Hello" , 5)
    println(isPrime(1))

  }



}
