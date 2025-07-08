package implementingString.problemSeries;

public class Program109 {
	
	public static int getSum(String str) {
		String num="";
		int sum=0;
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if(c>='0' && c<='9') {
				num=num+c;
			}
			if((i==str.length()-1) || !(c>='0' && c<='9')){
				if(!num.isBlank())
					sum=sum+Integer.parseInt(num);
				num="";
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		String str="ab45d s45a1 ";
		System.out.println(getSum(str));
	}
}
