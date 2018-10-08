package com.atguigu.scala.test;

import java.util.HashMap;

/**
 * @author lijun
 * @date 2018/9/29
 */
public class HashMapTest {

  public static void main(String[] args) {

    HashMap<Demo2, Integer> map = new HashMap<>();

    //    while (true) {
    //      map.put(new Demo(), 1);
    //    }
    for (int i = 0; i < Integer.MAX_VALUE; i++) {

      map.put(new Demo2(i), 1);
    }
  }
}

class Demo {
  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}

class Demo2 {
  private Integer code;

  public Demo2(Integer code) {
    this.code = code;
  }

  @Override
  public int hashCode() {
    return this.code;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}
