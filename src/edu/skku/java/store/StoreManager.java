package edu.skku.java.store;

import edu.skku.java.cms.Bus;

public class StoreManager {
	Shirt[] wears=new Shirt[100];
	int index=0;
	
	public void add(Shirt s) {
		wears[index]=s;//Shirt�� �� ���� �ְ� Pants�� �� ���� ����
		index++;
	}
	
	public void print() {
		for(int i=0; i<index; i++) {
			System.out.println(wears[i]);
		}
	}
	
	public void shirtList() {
		for(int i=0; i<index; i++) {
			if(!(wears[i] instanceof Pants)) //������ (��ȣ)�� �����ְ� �� ������ �ݴ븦 !�� ��Ÿ����.
				System.out.println(wears[i]);
		}
	}
	
	

}
