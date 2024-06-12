package com.baidu.www2;
//声明包的路径,代表Test这个类在包下面

import com.baidu.www.Test;
//引用包

/**
 * Description:
 * Date: 2024-06-12
 * Time: 9:33
 */
public class Test2 {
    public static void main(String[] args) {
        Test test=new Test();
        //Test.name;
        //default 在不同包的不同类中无法被访问

        Test3 test3 =new Test3();
        System.out.println(test3.name);
        //在同一个包的不同类中可以被使用
    }
}
