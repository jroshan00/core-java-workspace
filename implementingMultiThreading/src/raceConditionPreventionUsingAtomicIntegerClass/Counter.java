package raceConditionPreventionUsingAtomicIntegerClass;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	AtomicInteger count= new AtomicInteger();
	
	public void increment() {
		count.getAndIncrement();
	}

}
