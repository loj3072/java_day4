package edu.skku.java.store;

public class test5 {

	public static void main(String[] args) {
		StoreManager mgr=new StoreManager();
		mgr.add(new Shirt(2001,100,"white",10000,10));
		mgr.add(new Pants(1234,100,"°ËÁ¤",5000,4,10));
		mgr.add(new Shirt(1001,95,"»¡°­",25000,15));
		mgr.add(new Pants(3000,90,"ÆÄ¶û",15000,7,8));
		mgr.add(new Shirt(4001,100,"white",13000,5));
		
		mgr.print();
		System.out.println("=========¼ÅÃ÷ ¸®½ºÆ®");
		mgr.shirtList();

	}

}
