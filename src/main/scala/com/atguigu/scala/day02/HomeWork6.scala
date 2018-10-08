package com.atguigu.scala.day02

import scala.util.control.Breaks._

/**
  *
  *
  * @author lijun
  * @date 2018/9/29
  */
object HomeWork6 {
  def main(args: Array[String]): Unit = {
    //    1、100以内的数求和，求出 当和 第一次大于20的当前数【for】
    var sum = 0
    var flag = true

    breakable {
      for (i <- 1 to 100) {
        sum += i
        if (sum > 20 && flag) {
          println("第一次大于20的当前数:" + i)
          break()
        }
      }
    }

  }

  def test: Unit ={
    for (i <- Range(1,2)){}
  }
}
