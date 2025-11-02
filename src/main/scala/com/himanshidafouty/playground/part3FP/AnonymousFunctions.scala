package com.himanshidafouty.playground.part3FP

object AnonymousFunctions {

  val doubler: Function1[Int , Int]= new Function1[Int , Int] {
    override def apply(v1: Int): Int = v1*2

  }
  val doubler_v2:Int => Int ={
    (v1) => v1*2 //lamda equivalent to the above
  }


  val function2Trait:Function2[String , Int , String] = new Function2{
    override def apply(str : String , num : Int):String ={
      s"I have watched $str , $num times"

    }
  }

  val function2Trait_V2:(String , Int )=>String = (str , num)=> s"I have watched $str , $num times" //lambda form



  def main(args: Array[String]): Unit = {
    println(doubler(3))
    println(doubler_v2(8))
    println(function2Trait("Harry Potter" , 2))
    println(function2Trait_V2("Stranger Things" , 2))

  }

}
