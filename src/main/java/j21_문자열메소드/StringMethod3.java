package j21_문자열메소드;

import java.util.function.Function;

public class StringMethod3 {
	public static void main(String[] args) {
		Function<String, String> replacePhoneToken = phoneNumber -> 
		phoneNumber.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
				
		String phone1 = "010-9988/1916";
		String phone2 = "010.9988/1916";
		String phone3 = "010 9988/1916";
		String phone4 = "010-9988 1916";
		
//		phone1.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
//		phone2.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
//		phone3.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
//		phone4.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
		
		System.out.println(replacePhoneToken.apply(phone1));
		System.out.println(replacePhoneToken.apply(phone2));
		System.out.println(replacePhoneToken.apply(phone3));
		System.out.println(replacePhoneToken.apply(phone4));
		
		
		
	}
}








