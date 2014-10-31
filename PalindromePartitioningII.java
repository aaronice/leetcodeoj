import java.util.*;

//Given a string s, partition s such that every substring of the partition is a palindrome.
//
//Return the minimum cuts needed for a palindrome partitioning of s.
//
//For example, given s = "aab",
//Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut. 


public class PalindromePartitioningII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromePartitioningII pp2 = new PalindromePartitioningII();
		System.out.println(pp2.reverseString("abc"));
		System.out.println("abcde".substring(0,4));
		System.out.println(pp2.minCut("aaabcde"));
	}

	public int minCut(String s) {
		int count=0;
		String subs = null;
		PalindromePartitioningII po = new PalindromePartitioningII();
		int i = 0;
		int j = s.length()-1;
		while (i < s.length() ){
			while ( j>i ){
				subs = s.substring(i, j);
				if ((po.reverseString(subs)).equals(subs)){
					count++;
					i=j;
					j=s.length();
					continue;
				}else{
					j--;
				}
			}
			i++;
		}

		return count;

	}


	public String reverseString(String s){

		char[] input = s.toCharArray();
		int begin = 0;
		int end = input.length;
		char temp='\0';
		while(end-1 > begin){
			temp = input[begin];
			input[begin] = input[end-1];
			input[end-1]=temp;
			end--;
			begin++;
		}
		return new String(input);
	}


	//	public static String reverse(String input){
	//		char[] in = input.toCharArray();
	//		int begin=0;
	//		int end=in.length;
	//		char temp;
	//		while(end>begin){
	//			temp = in[begin];
	//			in[begin]=in[end];
	//			in[end] = temp;
	//			end--;
	//			begin++;
	//		}
	//		return new String(in);
	//	}

	//	/*-------More Complicated Method---------*/
	//	public String reverseString(String s){
	//		
	//		ArrayList<Character> revs = new ArrayList<Character>();
	//		int strlen = s.length();
	//		for (int index = 0; index < strlen; index++){
	//			revs.add(s.charAt(strlen - index - 1)) ; 
	//		}
	//		
	//		return new PalindromePartitioningII().getStringRepresentation(revs);
	//	}
	//	
	//	public String getStringRepresentation(ArrayList<Character> list)
	//	{    
	//	    StringBuilder builder = new StringBuilder(list.size());
	//	    for(Character ch: list)
	//	    {
	//	        builder.append(ch);
	//	    }
	//	    return builder.toString();
	//	}
	//	/*--------------------------------------------*/

}

