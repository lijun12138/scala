package com.atguigu.scala.day02

import scala.io.StdIn

/**
  *
  *
  * @author lijun
  * @date 2018/9/29
  */
object HomeWork2 {
  def main(args: Array[String]): Unit = {

    //    2统计三个班及格人数，每个班有5名同学。
    val mark = 60
    var markCount = 0
    for (i <- 1 to 3) {
      for (j <- 1 to 5) {
        print("请输入" + i + "班的第" + j + "个学生的成绩：")
        val grade = StdIn.readDouble()
        if (grade >= mark) {
          markCount += 1
        }
      }
    }
    println("及格人数一共有:" + markCount + "个")
  }
}
