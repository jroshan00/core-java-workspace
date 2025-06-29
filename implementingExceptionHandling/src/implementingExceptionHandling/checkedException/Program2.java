package implementingExceptionHandling.checkedException;

public class Program2{
	public static void main(String[] args) {
		for(int i=1,j=5;i<=10;i++){
			System.out.println(j+" * " + i +" = " + i*j );
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				System.out.println("Exception has been occured");
				e.printStackTrace();
			}
		}
	}
}
