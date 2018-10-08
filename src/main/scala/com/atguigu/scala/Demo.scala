package com.atguigu.scala

/**
  *
  *
  * @author lijun
  * @date 2018/9/28
  */
object Demo {
  def main(args: Array[String]): Unit = {

    println(getTime())

    println(getTime2())
  }

  def getTime(): Int = {
    return 2
  }

  def getTime2(): Nothing = {
    throw  new Exception
  }

}
