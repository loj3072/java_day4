package edu.skku.java.cms;

public class CarManager {//자동차를 관리하는 클래스

	//버스도 담고, 트럭도 담고... Car 배열을 만들면 오케이!
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
			if(cars[i] instanceof Bus) //instanceof: 오브젝트 확인. 메모리에 Bus가 있나?
				System.out.println(cars[i]);//c.toString
		}
	}
	
	public void truckList() {
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Truck) //instanceof: 오브젝트 확인. 메모리에Truck이 있나?
				System.out.println(cars[i]);//c.toString
		}
	}
	
}
