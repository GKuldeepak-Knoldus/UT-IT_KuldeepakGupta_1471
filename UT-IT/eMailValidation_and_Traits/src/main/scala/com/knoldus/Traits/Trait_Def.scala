package com.knoldus.Traits
import scala.collection.mutable.ListBuffer

trait Trait_Def {
  // Abstract Method --> divide
  def divide(numerator : Int, denominator : Int):Int

  // Non-Abstract Method --> Fibonacci
  def fibonacci(total_terms :Int): ListBuffer[Int] = {
    val fibonacci_series = new ListBuffer[Int]()
    var first_term = 0
    var second_term = 1
    fibonacci_series += first_term
    fibonacci_series += second_term
    if (total_terms <= 2)
      fibonacci_series
    else {
      var total_terms_iterator = total_terms - 2
      while (total_terms_iterator > 0) {
        val next_term = first_term + second_term
        fibonacci_series += next_term
        first_term = second_term
        second_term = next_term
        total_terms_iterator = total_terms_iterator - 1
      }
      fibonacci_series
    }
  }
}
