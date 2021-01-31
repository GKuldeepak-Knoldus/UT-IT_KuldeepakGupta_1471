package com.knoldus.Test_Traits

import com.knoldus.Traits.{Trait_Def, Trait_Impl}
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AsyncFlatSpec

import scala.collection.mutable.ListBuffer

class Traits_Test extends AsyncFlatSpec {
  val MockedTraits: Trait_Def = mock[Trait_Def]
  val trait_Impl = new Trait_Impl()


  // Unit Test Cases for Fibonacci Series

  "Fibonacci series " should "return [0,1,1,2] " in {
    when(MockedTraits.fibonacci(4)) thenReturn ListBuffer[Int](0,1,1,2)
    val result = trait_Impl.getFibonacciSeries(4)
    assert(result == ListBuffer[Int](0,1,1,2))
  }

  "Fibonacci series " should "not return [0,1,1,2,2] " in{
    when(MockedTraits.fibonacci(5)) thenReturn ListBuffer[Int](0,1,1,2,3)
    val result  = trait_Impl.getFibonacciSeries(5)
    assert(result != ListBuffer[Int](0,1,1,2,2))
  }


  // Unit Test Cases for Dividing

  "On Dividing 100 by 25 " should "give 4" in{
    when (MockedTraits.divide(100 ,25)) thenReturn 4
    val result = trait_Impl.doDivide(100,25)
    assert(result==4)
  }

  "On Dividing 100 by 25 " should "not give 5" in {
    when(MockedTraits.divide(100,25)) thenReturn 4
    val result = trait_Impl.doDivide(100,25)
    assert(result != 5)
  }
}
