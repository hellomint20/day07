package string;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		String str = "test";
		//System.out.println("문자열 입력 : ");
		String str2 = "test ";
					  //new Scanner(System.in).nextLine();
		System.out.println(str+".");
		System.out.println(str2+".");
		System.out.println(str2.trim()+".");
		System.out.println("str == str2 : "+str.equals(str2));
		System.out.println("str == str2 : "+str.equals(str2.trim()));
		
		System.out.println("-----------------------");
		String addr = "052154 서울 종로구 단성사4층";
		String[] s_addr = addr.split(" ");
		for(int i=0; i<s_addr.length; i++) {
			System.out.println(s_addr[i]);
		}
		System.out.println("-----------------------");
		for(String ss : s_addr) {
			System.out.println(ss);
		}
		System.out.println("-----------------------");
		String addr2 = "052154/서울 종로구/단성사4층";
		String[] s_addr2 = addr2.split("/");
		for(int i=0; i<s_addr2.length; i++) {
			System.out.println(s_addr2[i]);
		}
		System.out.println("=========================");
		String addr3 = addr2.replace('/',',');
		System.out.println(addr3);
	}
}
