package com.atguigu.scala.test


import scala.io.StdIn

/**
  *
  *
  * @author lijun
  * @date 2018/9/29
  */
object Work2 {

  //根据淡旺季的月份和年龄打印票价
  //4-10旺季 成人18-60:60  儿童<18 ：半价 老人>60 1/3
  //淡季 成人40 其他20
  def main(args: Array[String]): Unit = {
    while (true) {
      print("请输入月份：")
      val month = StdIn.readInt()
      print("请输入年龄：")
      val age = StdIn.readInt()
      if (month >= 4 && month <= 10) {
        val picktPrice = 60
        if (age >= 18 && age <= 60) {
          println("你应该支付：" + picktPrice)
        }
        if (age < 18) {
          println("你应该支付：" + picktPrice / 2)
        }
        if(age>60){
          println("你应该支付：" + picktPrice / 3)
        }
      } else {
        if (age >= 19 && age <= 60) {
          println("你应该支付：" + 40)
        }
        else
          println("你应该支付：" + 20)
      }

    }
  }


}
