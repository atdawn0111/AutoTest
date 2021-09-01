package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MutilThreadOnAnnotion {

    //invocationCount默认为1，在不设置线程池threadPoolSize的情况下，不管invocationCount设置多少，都只始终按照一个线程执行
    @Test(invocationCount = 10, threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.println("Thread Id : "+ Thread.currentThread().getId());
    }

}
