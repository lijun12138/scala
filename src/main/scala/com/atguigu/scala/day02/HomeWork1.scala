package com.atguigu.scala.day02


import scala.io.StdIn

/**
  *
  *
  * @author lijun
  * @date 2018/9/29
  */
object HomeWork1 {
  def main(args: Array[String]): Unit = {
    //    1统计三个班成绩情况，每个班有5名同学，求出各个的平均分和所有班级的平均分[学生的成绩从键盘输入]。

    var gradeSum = 0.0
    for (i <- 1 to 3) {
      var grade = 0.0
      for (j <- 1 to 5) {
        print("请输入"+i+"班的第"+j+"个学生的成绩：")
        grade += StdIn.readDouble()
      }
      val avg =( grade / 5).formatted("%.2f")
      println(i + "班的平均成绩为：" +avg )
      gradeSum += avg.toDouble
    }
    println("所有班级的平均分为：" + (gradeSum / 3).formatted("%.2f"))





  }
}
