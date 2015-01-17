
public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s = new Solution();
		
		int number = s.titleToNumber("BA");
		
		System.out.print("Number of title is: " + number + "\n");

	}

}

class Solution {
	public int titleToNumber(String s) {
		int num = 0;


		for (int i = 0; i<s.length();i++) {
			char ch = s.charAt(i);
			int delta = ch - 'A' + 1;
			num = 26 * num + delta;
		}

		return num;
	}
}
