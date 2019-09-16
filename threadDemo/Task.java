package com.hh.threadDemo;

/**
 * Created by IntelliJ IDEA.
 *
 * @author lijing
 * @date 2019/9/12 15:57
 **/
public class Task implements Runnable{

    private int num;

    public Task(int num) {
        this.num = num;
    }

    @Override
    public void run() {
    System.out.println("正在执行任务："+num);
    try{

        Thread.currentThread().sleep(4000);
    }catch(Exception e){
        e.printStackTrace();
    }
    System.out.println("线程"+num+"执行完毕");
    }
}
