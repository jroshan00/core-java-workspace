package implementingExceptionHandling.checkedException;

public class Program3 extends Thread {
	private String programName;
	private int programId;
	public Program3() {
	}
	Program3(String programName,int programId){
		this.programName=programName;
		this.programId=programId;
	}
	
	public static void main(String[] args) {
		Program3 p1=new Program3("ArrayProgram",101);
		Program3 p2=new Program3("ArrayProgram",101);
		Program3 p3=new Program3("ArrayProgram",101);
		Program3 p4=new Program3("ArrayProgram",101);
		
		
	}
	
	@Override
	public void run() {
		
	}
	@Override
	public String toString() {
		return "programName : "+programName+"\tprogramId : "+programId;
	}
}
