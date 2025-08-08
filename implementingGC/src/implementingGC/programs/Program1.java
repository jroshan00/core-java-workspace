package implementingGC.programs;

public class Program1 {
	
	public static void main(String[] args) {
		
		Program1 p=new Program1();
		int i=0;
		while(i>0) {
			Demo d =p.new Demo();
			System.out.println(d);
			d=null;
			
		}
	}
	class Demo{
		
	}
}	
