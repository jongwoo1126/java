package Ch10;

import Ch09.Apple;
import Ch09.Banana;

/*
 * 날짜 : 2022/01/11
 * 이름 : 박종우
 * 내용 : 자바 제네릭 실습하기 교재 p384
 */

public class Sub1_GenericTest {

	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("일본", 2000);
		
		FruitBox<Apple> box1 = new FruitBox<>();
		FruitBox<Banana> box2 = new FruitBox<>();
		
		box1.setFruit(apple);
		box2.setFruit(banana);
		
		box1.getFruit().toString();
		box2.getFruit().toString();
		
	}
}
