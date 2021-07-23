package test;
import java.util.*;

public class testtest {

	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		list2.add(21);
		list2.add(31);
//		for (int i = 0; i < 5; i++) {
//			String num = sc.next();
//			list.add(num);
//		}
//		System.out.println(list);
		for (Integer number:list2) {
			System.out.println(list2);
		}
		
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			list2.add(num);
		}
		System.out.println(list2);
	}

}
