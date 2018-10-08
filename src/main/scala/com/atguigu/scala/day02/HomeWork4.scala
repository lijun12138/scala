package com.atguigu.scala.day02

import scala.io.StdIn

/**
  *
  *
  * @author lijun
  * @date 2018/9/29
  */
object HomeWork4 {
  def main(args: Array[String]): Unit = {
    //    2、实现登录验证，有三次机会，如果用户名为”张无忌” ,密码”888”提示登录成功，否则提示还有几次机会，请使用for 循环完成
    var count = 0
    while (count < 3) {
      println("请输入用户名：")
      val userName = StdIn.readLine()
      println("请输入用户密码：")
      val password = StdIn.readLine()

      if ("张无忌".equals(userName) && "888".equals(password)) {
        println("登录成功!!!")
      }
      count += 1
      if (count < 3) {
        println("还有" + (3 - count) + "次机会!!!")

      } else
        println("你的机会用完啦")
    }
  }
}
