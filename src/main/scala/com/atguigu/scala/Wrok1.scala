package com.atguigu.scala

import scala.reflect.internal.util.StringOps

/**
  *
  *
  * @author lijun
  * @date 2018/9/28
  */
object Wrok1 {

  def main(args: Array[String]): Unit = {
    //    1、在Scala REPL中，计算3的平方根,然后再对该值求平方。现在，这个结果与3相差多少？
    //    val num :Int =3
    //    println(math.hypot(math.sqrt(num),2)-num)

    //    8、Scala允许你用数字去乘一个字符串，去REPL中试一下"crazy"*3。这个操作做什么？在Scaladoc中如何找到这个操作?
    //    "crazy"*3
    //    10、用BigInt计算2的1024次方
    println(BigInt(2).pow(1024))
    //    11、在Scala中如何获取字符串“Hello”的首字符和尾字符？
    val str: String = "hello"
    println(str.take(1))
    println(str(0))
    println(str.reverse(0))
    println(str.takeRight(1))
    println(10 max 2)
    println(math.max(2,10))
    println("crazy"*3)
    println("crazy".*(3))




  }

}
