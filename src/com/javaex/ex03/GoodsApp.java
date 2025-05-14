package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	System.out.println("상품을 입력해주세요(종료 q)");
    	Scanner sc = new Scanner(System.in);
    	String inputDate = sc.nextLine();
    	
    	ArrayList<Goods> gList = new ArrayList<Goods>();
    	
    	Goods g01 = new Goods();
    	g01.setName("LG그램");
    	g01.setPrice(9000000);
    	g01.setCount(5);
    	
    	Goods camera = new Goods();
    	camera.setName("니콘");
    	camera.setPrice(400000);
    	camera.setCount(5);
    	
    	Goods cup = new Goods();
    	cup.setName("머그컵");
    	cup.setPrice(2000);
    	cup.setCount(100);
    	
    	Goods drink = new Goods();
    	drink.setName("코카콜라");
    	drink.setPrice(1500);
    	drink.setCount(10);
    	
    	Goods food = new Goods();
    	food.setName("컵라면");
    	food.setPrice(1050);
    	food.setCount(20);
    	
    	gList.add(g01);
    	gList.add(camera);
    	gList.add(cup);
    	gList.add(drink);
    	gList.add(food);
    	
    	Goods g = gList.get(0);
    	
    	for(int i=0; i<gList.size(); i++) {
    		System.out.println(gList.get(1).toString());
    	}
    	sc.close();
    }

}
/* 결 과 값이 다르게 나옴
상품을 입력해주세요(종료 q)
LG그램,9000000,5
q
[입력완료]
========================
(가격:400000원)이5 개 입고 되었습니다.	모든 상품의 갯수는 5개입니다.

[입력완료]
========================
(가격:400000원)이5 개 입고 되었습니다.	모든 상품의 갯수는 5개입니다.
*/