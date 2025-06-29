package implementingString.splitMethod;

public class Program4 {
	public static void main(String[] args) {
		String s="123@987$fef#sd^^FDDF^^&&";
		String[] string=s.split("[^0-9a-zA-Z]");
		for(int i=0;i<string.length;i++){
			if(!string[i].isEmpty())
				System.out.println("'"+string[i]+"'");
		}
	}

}
