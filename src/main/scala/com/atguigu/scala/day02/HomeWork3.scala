package com.atguigu.scala.day02

/**
  *
  *
  * @author lijun
  * @date 2018/9/29
  */
object HomeWork3 {
  def main(args: Array[String]): Unit = {
    //    3打印出九九乘法表

//    for (i <- 1 to 9) {
//      for (j <- 1 to i) {
//        print(i + " * " + j + " = " + (i * j)+"\t")
//      }
//      println()
//    }
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(j + " * " + i + " = " + (i * j)+"\t")
      }
      println()
    }
  }
}
