package com.open.cloud.base.java.lock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class LockTest {

	//value1：线程不安全
	private static int value1 = 0;
	//value2：使用乐观锁
	private static AtomicInteger value2 = new AtomicInteger(0);
	//value3：使用悲观锁
	private static int value3 = 0;

	private static synchronized void increaseValue3() {
		value3++;
	}

	@org.testng.annotations.Test
	public void testLoadFirst() throws InterruptedException {
		//开启1000个线程，并执行自增操作
		CountDownLatch countDownLatch = new CountDownLatch(1000);
		for (int i = 0; i < 1000; ++i) {
			new Thread(() -> {
				value1++;value2.getAndIncrement();increaseValue3();
				countDownLatch.countDown();

			}).start();
		}
		countDownLatch.await();
		System.out.println("线程不安全：" + value1);
		System.out.println("乐观锁(AtomicInteger)：" + value2);
		System.out.println("悲观锁(synchronized)：" + value3);
	}
}
