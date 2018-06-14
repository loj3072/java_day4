package edu.skku.java.store;

import edu.skku.java.cms.Bus;

public class StoreManager {
	Shirt[] wears=new Shirt[100];
	int index=0;
	
	public void add(Shirt s) {
		wears[index]=s;//Shirt가 올 수도 있고 Pants가 올 수도 있음
		index++;
	}
	
	public void print() {
		for(int i=0; i<index; i++) {
			System.out.println(wears[i]);
		}
	}
	
	public void shirtList() {
		for(int i=0; i<index; i++) {
			if(!(wears[i] instanceof Pants)) //조건을 (괄호)로 묶어주고 그 조건의 반대를 !로 나타내기.
				System.out.println(wears[i]);
		}
	}
	
	

}
