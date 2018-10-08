package com.atguigu.scala.test

/**
  *
  *
  * @author lijun
  * @date 2018/9/29
  */
object Example {

  def main(args: Array[String]): Unit = {
    val res1 = 6

    for ( i <- 0 to res1){
      println(i+"+"+(res1-i)+"="+res1)
    }
  }
}
