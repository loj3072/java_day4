package edu.skku.java.cms;

public class CarManager {//�ڵ����� �����ϴ� Ŭ����

	//������ ���, Ʈ���� ���... Car �迭�� ����� ������!
	Car[] cars=new Car[100];
	int index=0;
	
	public void add(Car c) {
		cars[index]=c;
		index++;
	}
	
	public void print() {
		for(int i=0; i<index; i++) {
			System.out.println(cars[i]);//c.toString
		}
	}
	
	public void busList() {
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Bus) //instanceof: ������Ʈ Ȯ��. �޸𸮿� Bus�� �ֳ�?
				System.out.println(cars[i]);//c.toString
		}
	}
	
	public void truckList() {
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Truck) //instanceof: ������Ʈ Ȯ��. �޸𸮿�Truck�� �ֳ�?
				System.out.println(cars[i]);//c.toString
		}
	}
	
}
