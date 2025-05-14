package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	System.out.println("친구를 3명 등록해 주세요");
    	Scanner sc = new Scanner(System.in);
    	String inputDate = sc.nextLine();
    	
    	ArrayList<Friend> fList = new ArrayList<Friend>();
    	
    	Friend f01 = new Friend("정우성","010-2222-3333","초");
    	Friend f02 = new Friend("이효리","010-3232-6666","중");
    	Friend f03 = new Friend("이정재","010-5434-9999","고");
    	
    	fList.add(f01);
    	fList.add(f02);
    	fList.add(f03);
    	
    	Friend f = fList.get(0);
    	
    	for(int i=0; i<fList.size(); i++) {
    		System.out.println();
    		System.out.println(fList.get(i).toString());
    	}
    	sc.close();
    }
}
