package com.mmall.test;

import com.mmall.util.BigDecimalUtil;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2019-08-05
 */

public class BigDecimalTest {

    @Test
    public void test1(){
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015*100);
        System.out.println(123.3/100);
        //可能导致大型故障
        //0.060000000000000005
        //0.5800000000000001
        //401.49999999999994
        //1.2329999999999999

        //实际数据库存float、double什么的 我们来封装一个BigDecimalUtil工具类 转换
        System.out.println(BigDecimalUtil.add(0.05,0.01));
        System.out.println(BigDecimalUtil.sub(1.0,0.42));
        System.out.println(BigDecimalUtil.mul(4.015,100));
        System.out.println(BigDecimalUtil.div(123.3,100));
        //0.06
        //0.58
        //401.5000
        //1.23
    }







    @Test
    public void test2(){
        BigDecimal b1 = new BigDecimal(0.05);
        BigDecimal b2 = new BigDecimal(0.01);
        System.out.println(b1.add(b2));
        //0.06000000000000000298372437868010820238851010799407958984375
    }

    @Test
    public void test3(){
        //商业计算  一定要用BigDecimal的String构造器
        BigDecimal b1 = new BigDecimal("0.05");
        BigDecimal b2 = new BigDecimal("0.01");
        System.out.println(b1.add(b2));
        //0.06   string
    }


}
