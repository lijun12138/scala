package com.atguigu.scala.test

import scala.io.StdIn

/**
  *
  *
  * @author lijun
  * @date 2018/9/29
  */
object Work1 {

  //ax2+bx+c=0
  //b2-4ac>0有两个解 =0一个解，<0无解
  //x1=(-b+sqrt(b2-4ac))/2a
  //x2=(-b-sqrt(b2-4ac))/2a
  def main(args: Array[String]): Unit = {
    print("请输入a：")
    val a = StdIn.readDouble()
    print("请输入b：")
    val b = StdIn.readDouble()
    print("请输入c：")
    val c = StdIn.readDouble()

    val res = b*b - 4 * a * c
    val result = getVal(res)

    if(result==1){
      println("x1="+(-b+math.sqrt(res)/(2*a)))
      println("x2="+(-b-math.sqrt(res)/(2*a)))
    }else if(result==0){
      println("x="+(-b-math.sqrt(res)/(2*a)))
    }
  }

  def getVal(res: Double): Int = {
    if (res > 0) {
      return 1;
    } else if (res == 0) {
      return 0;
    } else
      return -1;
  }
}
