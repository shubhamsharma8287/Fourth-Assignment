import java.util.*;
  class Seven {

    public static boolean is_Unique_str(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i-1]) {
                return false;
            }
        }
        return true;
    }
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
                String str = sc.next();
		System.out.println("String has all unique characters: "+is_Unique_str(str));
	}		
}