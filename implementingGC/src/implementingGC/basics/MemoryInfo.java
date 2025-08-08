package implementingGC.basics;

public class MemoryInfo {
	    public static void main(String[] args) {
	        long max = Runtime.getRuntime().maxMemory(); // max heap
	        long total = Runtime.getRuntime().totalMemory(); // current heap allocated
	        long free = Runtime.getRuntime().freeMemory();		

	        System.out.println("Max Memory (MB): " + max / (1024 * 1024));
	        System.out.println("Total Memory (MB): " + total / (1024 * 1024));
	        System.out.println("Free Memory (MB): " + free / (1024 * 1024));
	    }

}
