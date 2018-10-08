package com.atguigu.scala.day02

/**
  *
  *
  * @author lijun
  * @date 2018/9/29
  */
object HomeWork5 {

  def main(args: Array[String]): Unit = {
    /*
    3、某人有100,000元,每经过一次路口，需要交费,规则如下:
    当现金>50000时,每次交5%
    当现金<=50000时,每次交1000
    编程计算该人可以经过多少次路口,使用 方式完成
    */
    var money = 100000.0
    var count = 0

    do {
      money = deduct(money)
      count += 1
    } while (money > 1000)
    {
    }

    println("你可通过"+count+"次"+"，你的余额为："+money)
  }

  def deduct(money: Double): Double = {
    var result = money
    if (money > 50000) {
      result = money - money * 0.05
    } else if (money <= 50000 && money >= 1000) {
      result = money - 1000
    }

    return result
  }
}
