package upt.http.util;

public class Strings {
	public static boolean isEmpty(String str) {
		return str == null || str.trim().length() == 0; 
	}
	
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
}
