package com.himanshidafouty.playground.part2OOPs

object OOPSExercise {
  class Driver(firstName:String, lastName:String, val dob:Int ) {
    def fullName:String ={
      firstName+lastName
    }
  }
  class Car(make : String ,model : String , yor :Int , owner:Driver) {
    def ownerAge:Int={
      Math.abs(owner.dob-yor)
    }

    def isOwnedBy(driver: Driver):Boolean={
      owner==driver
    }

    def copy(nyor:Int):Car={
      new Car(make , model , nyor , owner)

    }

  }


  def main(args:Array[String]):Unit={
    val driver = new Driver("Robin", "Bolt", 1999)
//    val owner = new Driver("Robin" , "Doe" , 1989)

    val car = new Car("Ferrari" , "F1" , 2004 , driver)

    println(driver.fullName)
//    println(owner.fullName)
    println(car.ownerAge)
    println(car.isOwnedBy(driver))
    println(car.copy(2008))

  }

}
