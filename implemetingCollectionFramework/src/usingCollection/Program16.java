package usingCollection;

public class Program16 {
	public static void main(String[] args) {
		short c=129;
		short d=128;
		byte cc=64;
		byte dd=64;
		short f=(short)(c+d);  //(c+d) returns <int> so can't directly stored in <short> data type
		byte ff=(byte)(cc+dd);
		System.out.println(f);
		System.out.println(ff);
	}

}
