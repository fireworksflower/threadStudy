package com.hh.threadDemo;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * Created by IntelliJ IDEA.
 *
 * @author lijing
 * @date 2019/9/5 19:42
 **/
public class MultiThread {
  public static void main(String[] args) {
      ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
      ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
    for (ThreadInfo threadInfo : threadInfos) {
      System.out.println("["+threadInfo.getThreadId()+"]"+threadInfo.getThreadName());
    }
  }
}
