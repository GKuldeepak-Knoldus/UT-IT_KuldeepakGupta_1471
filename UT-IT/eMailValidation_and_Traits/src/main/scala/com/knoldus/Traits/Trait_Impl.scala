package com.knoldus.Traits
import scala.collection.mutable.ListBuffer

class Trait_Impl extends Trait_Def {

  override def divide(numerator:Int , denominator:Int): Int = {
    numerator/denominator
  }

  def doDivide (numerator : Int , denominator : Int): Int ={
    val result = divide(numerator:Int , denominator :Int)
    result
  }
  def getFibonacciSeries (total_terms : Int): ListBuffer[Int] ={
    val Fibonacci_Series = fibonacci(total_terms :Int)
    Fibonacci_Series
  }
}
