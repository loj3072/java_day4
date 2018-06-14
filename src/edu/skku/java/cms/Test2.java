package edu.skku.java.cms;

public class Test2 {

	public static void main(String[] args) {

		CarManager mgr=new CarManager();
		mgr.add(new Bus("11호1245",5000,45));//add 메서드에는 Car를 달라고 했지만 Bus도 Truck도 Car가 있으므로
		mgr.add(new Bus("33나2343",9000,15));
		mgr.add(new Truck("55소9783",7000,3));
		mgr.print();
		System.out.println("======= Bus List =======");
		mgr.busList();
	}

}
