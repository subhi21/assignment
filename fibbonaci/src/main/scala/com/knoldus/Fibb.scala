package com.knoldus
class Fibb{

  def fib( num : BigInt) : BigInt = {
     if(num<0) throw new IllegalArgumentException
    else {
      def fib_tail(curr: BigInt, next: BigInt, n: BigInt): BigInt = {
        if (n < 2) curr
        else {

          fib_tail(next, curr + next, n - 1)
        }
      }

      return fib_tail(0, 1, num)
    }

  }


}