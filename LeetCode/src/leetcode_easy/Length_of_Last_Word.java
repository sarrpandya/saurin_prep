package leetcode_easy;

public class Length_of_Last_Word {
	public static int lengthOfLastWord(String s) {
		String[] tmp = s.split(" ");
		if (s.length() == 0 || s == null) {
			return 0;
		}

		return tmp[tmp.length - 1].length();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		System.out.println(Length_of_Last_Word.lengthOfLastWord(str));

	}

}
