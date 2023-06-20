package map;

public class TestClass05 {
	public static void main(String[] args) {
		float f1 = (float)1.11; 
		
		int num = 100;
		String sNum = num+"";
		System.out.println(sNum+100);
		System.out.println(num+100);
		
		//"100"가능. "안녕" 변환안됨
		int n = Integer.parseInt(sNum);	//문자를 숫자로 변환
		System.out.println(n+123);		//숫자로 변환 후 계산
	}
}
