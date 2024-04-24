package ex_240424;

import java.util.Scanner;

public class ArrayHomework {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String menuArray[] =new String[5];
		
		System.out.println("메뉴를 입력하세요.(최대 5개)");
		
		for(int i=0;i<menuArray.length;i++) {
			menuArray[i]=scanner.next();
		}
		
		System.out.println("점심메뉴 리스트");
		System.out.println("=====================");
		for(int j=0;j<menuArray.length;j++) {
			System.out.print(menuArray[j]+" ");
		}
		
		scanner.close();
	}
}