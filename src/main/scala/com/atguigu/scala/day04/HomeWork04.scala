package com.atguigu.scala.day04

/**
  *
  *
  * @author lijun
  * @date 2018/10/8
  */

import  java.util.{HashMap=>javaHashMap}
import scala.collection.immutable.HashMap
object HomeWork04 {

  //编写一段程序,将Java哈希映射中的所有元素拷贝到Scala哈希映射。用引入语句重命名这两个类。
  def main(args: Array[String]): Unit = {
    val javaMap = new javaHashMap[String,String]()
    javaMap.put("1","a")
    javaMap.put("2","b")
    javaMap.put("3","c")

    var scalMap = new HashMap[String,String]
    for(key <- javaMap.keySet().toArray){
      scalMap += (key.toString() -> javaMap.get(key))
    }
    println(scalMap.mkString)
  }
}
