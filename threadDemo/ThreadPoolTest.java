package com.hh.threadDemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 *
 * @author lijing
 * @date 2019/9/12 16:01
 **/
public class ThreadPoolTest {
  public static void main(String[] args) {
      ThreadPoolExecutor pool = new ThreadPoolExecutor(5,10,200, TimeUnit.MICROSECONDS,new ArrayBlockingQueue<Runnable>(5));

      for (int i =0;i<15;i++){
          Task t = new Task(i);
          pool.execute(t);
      System.out.println("线程池中线程数目"+pool.getPoolSize()+",队列中等待执行的任务数量："+pool.getQueue().size()+",已执行完别的任务数目"+pool.getCompletedTaskCount());
      }
      pool.shutdown();
  }

}
