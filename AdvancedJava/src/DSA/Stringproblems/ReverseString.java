package DSA.Stringproblems;


public class ReverseString {
	public static String reverse(String s) {
		
		char[] ch = s.toCharArray();
		int start = 0, end = s.length()-1;
		
		while(start < end) {
			
			char temp = ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			
			start ++;
			end --;
		}
		return new String(ch);
		
	}
	public static void main(String[] args) {
		String s = reverse("Programming");
		
		System.out.println(s);
	}
}
