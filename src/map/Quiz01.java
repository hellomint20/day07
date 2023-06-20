package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		
		String menu;
		int num =0, price;
		boolean b = true;
		
		while(b) {
			int i = 1;
			System.out.println("1. 메뉴 등록 ");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			num =sc.nextInt();
			
			switch (num) {
			case 1:
				System.out.print("메뉴 입력 : ");
				menu = sc.next();
				if(map.containsKey(menu)) {
					System.out.println("이미 존재하는 메뉴입니다.");
					break;
				}
				System.out.print("가격 입력 : ");
				price = sc.nextInt();
				map.put(menu, price);
				System.out.println("등록 되었습니다.");
				break;
			case 2:
				Set<String> set = map.keySet();
				Iterator<String> it = set.iterator();
				
				if(it.hasNext() == false) {
					System.out.println("등록된 메뉴가 없습니다.");
					break;
				}
				while(it.hasNext()) {
					String key = it.next();
					System.out.println(i+"."+key +" : "+ map.get(key));
					i++;
				}
				System.out.println();
				System.out.println("1)수정 2)삭제 3)나가기");
				System.out.print(">>> ");
				num = sc.nextInt();
				switch (num) {
				case 1:
					System.out.print("수정할 메뉴 입력 : ");
					menu = sc.next();
					if(map.get(menu) == null) {
						System.out.println("없는 메뉴 입니다.");
						break;
					}
					System.out.print("수정할 가격 입력 : ");
					price = sc.nextInt();
					map.put(menu, price);
					System.out.println("수정 되었습니다.");
					break;
				case 2:
					System.out.print("삭제할 메뉴 입력 : ");
					menu = sc.next();
					if(map.get(menu) == null) {
						System.out.println("없는 메뉴 입니다.");
						break;
					}
					map.remove(menu);
					System.out.println("메뉴가 삭제되었습니다.");
					break;
				case 3:
					break;
				default:
					System.out.println("잘못 입력 !!!!");
					break;
				}
				break;
			case 3:
				System.out.println("프로그램을 종료합니다~");
				b = false;
				break;
			default:
				System.out.println("잘못 입력!!!");
				break;
			}
		}
	}
}
