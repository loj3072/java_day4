
package edu.skku.java.store;

/*
 * package java.util;
 * 
 * 
 * public class Random{
 *     public int nextInt(int su){} //����Ÿ�� int
 *     public static void sm(){} //�޼��� �տ� static�� �ٴ´ٸ� new ���� �ٷ� Random.sm()�θ� �� ����.
 * }   //API(�̸� �������) 
 * 
 *
 * 
 */

import java.util.Random; //��Ű���� �ٸ��� ������ import
public class Test2 {

	public static void main(String[] args) {
		
		//Random.sm(); //sm�� static�̱⶧���� new ���� �ٷ� �θ� �� ����
		
		java.util.Random r=new java.util.Random();
		for(int i=0; i<7; i++) {
			int su=r.nextInt(45)+1;//0~44 �� ������ ��+1 �ϳ��� ����
			System.out.println(su);			
		}

	}

}

