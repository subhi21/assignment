package edu.knoldus

class Sorting {

  def insertionSort(list: List[Int]): List[Int] = {
    val arr = list.toArray
    for(i <- 0 until arr.length)
    {
      var j=i+1

      while(j>1&&arr(j)<arr(j-1)&&j<arr.length)
      {
        var c=arr(j)
        arr(j)=arr(j-1)
        arr(j-1)=c
        j-=1
      }
    }
    arr.toList



  }

  def selectionSort(list: List[Int]): List[Int] = {
    val arr = list.toArray
    for (i <- 0 until (arr.length -1))
    {
      var min = i

      for(j <- (i+1) until arr.length)
      {
        if (arr(j) < arr(min))
          min = j
      }


      if (i != min)
      {
        val swap = arr(i)
        arr(i) = arr(min)
        arr(min) = swap
      }
    }
    arr.toList



  }

  def bubbleSort(list: List[Int]): List[Int] = {
    val arr = list.toArray
    for (i <- 0 until arr.length - 1; j <- 0 until arr.length - 1 - i)
    {
      if (arr(j) > arr(j + 1)) {
        val temp = arr(j)
        arr(j) = arr(j + 1)
        arr(j + 1) = temp
      }
    }
    arr.toList





  }


}

object MainObject{
  def main(args:Array[String]): Unit ={
    val list = List(23,14,3,56,32)
    val s=new Sorting()
    val result=s.bubbleSort(list)
    println("bubble sort:")
    result.foreach(println)
    val result1=s.selectionSort(list)
    println("selection sort:")
    result1.foreach(println)
    val result2=s.selectionSort(list)
    println("insertion sort:")
    result2.foreach(println)
  }

}