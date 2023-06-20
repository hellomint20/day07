package string;

public class TestClass01 {
	public static void main(String[] args) {
		String str3 = new String("Java programming");
		
		System.out.println(str3);
		
		System.out.println("--- 대문자로 변환 ---");
		String s1 = str3.toUpperCase();
		System.out.println(s1);
		
		System.out.println("--- 소문자로 변환 ---");
		String s2 = str3.toLowerCase();
		System.out.println(s2);
		
		System.out.println("--- 글자 비교 ---");
		str3 = "Java";
		if(str3.toLowerCase().equals("java")) {
			System.out.println("수강 과목은 자바군요");
		}	
	}
}
