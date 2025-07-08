package implementingString.problemSeries;

public class Program107 {
	
	public static char[] reverse(char[] ch) {
		for(int i=0,j=ch.length-1; i<ch.length && j>=0;i++,j--){
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		return ch;
	}
	
	public static void main(String[] args) {
		char[] ch= {'h','e','l','l','o'};
		ch=reverse(ch);
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}

}
