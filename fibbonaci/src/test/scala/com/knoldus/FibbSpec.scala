package com.knoldus
import org.scalatest.FunSuite

class FibbSpec extends FunSuite {
  val testFib=new Fibb()
   /*test("Testing fibbonacci series for a positive value of limit"){
     val actualResult=testFib.fib(7)
     val expexctedResult = 0112358
     assert(actualResult===expexctedResult)
   }*/
  test("Testing fibbonacci series for a 1"){
    val actualResult=testFib.fib(1)
    val expexctedResult = 0
    assert(actualResult===expexctedResult)
  }

  test("Testing fibbonacci series for a 2"){
    val actualResult=testFib.fib(1)
    val expexctedResult = 0 ; 1
    assert(actualResult===expexctedResult)
  }
  test("Testing fibbonacci series for a 7"){
    val actualResult=testFib.fib(7)
    val expexctedResult = 0 ; 1 ; 1 ; 2 ; 3 ; 5 ; 8
    assert(actualResult===expexctedResult)
  }
  test("Testing for negative number"){
    assertThrows[Exception]{
      testFib.fib(-5)
    }
  }

}
