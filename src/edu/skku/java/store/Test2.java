
package edu.skku.java.store;

/*
 * package java.util;
 * 
 * 
 * public class Random{
 *     public int nextInt(int su){} //리턴타입 int
 *     public static void sm(){} //메서드 앞에 static이 붙는다면 new 없이 바로 Random.sm()부를 수 있음.
 * }   //API(미리 만들어진) 
 * 
 *
 * 
 */

import java.util.Random; //패키지가 다르기 때문에 import
public class Test2 {

	public static void main(String[] args) {
		
		//Random.sm(); //sm이 static이기때문에 new 없이 바로 부를 수 있음
		
		java.util.Random r=new java.util.Random();
		for(int i=0; i<7; i++) {
			int su=r.nextInt(45)+1;//0~44 중 임의의 값+1 하나를 리턴
			System.out.println(su);			
		}

	}

}

