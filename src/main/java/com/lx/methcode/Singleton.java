package com.lx.methcode;

public class Singleton {
	//DCL双重检查锁，必须用volatile防止指令重排序
	/*
	 * 指令重排序会导致指针指向的对象不是预期的那个。
	 * 因为singleton = new Singlton()的操作不是原子性的
	 * singleton在静态方法区创建对象指针，会有一个默认值。
	 * new Singlton在堆里创建对象
	 * = 将指针指向堆里的对象地址。
	 */
	private static volatile Singleton singleton;

	private Singleton() {}

	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
