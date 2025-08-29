package InterviewPrep.string;

public class SortString {
	public static void main(String[] args) {
		String str = "Ganesh chaturthi is a famous festival in the world";
		str = sortTheStringInAlbhaticalOrder(str);
		System.out.println("Sorted in alphabatical order : " + str);

	}

	public static String sortTheStringInAlbhaticalOrder(String str) {
		String bin = "";
		String[] string = str.toLowerCase().split(" ");
		for (String strr : string) {
			bin = bin + sortString(strr) + " ";
		}
		return bin;
	}

	public static String sortString(String str) {
		String res = "";
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length - 1; i++) {
			int count = 0;
			for (int j = 0; j < ch.length - 1; j++) {
				if (ch[j] > ch[j + 1]) {
					swap(ch, j, j + 1);
					count++;
				}
			}
			if (count == 0) {
				break;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ')
				res = res + ch[i];
		}
		return res;
	}

	public static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

}
