
package edu.skku.java.store;

//��Ŭ�������� ���ٺ���: ctrl+alt+����Ű 
//�̵�: alt+����Ű
public class Test3 {

	public static void main(String[] args) {
		WearManagerImpl mgr=new WearManagerImpl();
		mgr.add(new Shirt(1001,90,"����, ����",15000,10));
		mgr.add(new Shirt(2001,100,"���",35000,5));
		mgr.add(new Shirt(3001,90,"��ũ, ����",85000,10));
		mgr.allList();
		System.out.println("====== ���� ======");
		mgr.getColor("����");
		System.out.println("====== ����: 20000�� ======");
		mgr.getPrice(20000);
		System.out.println("======= ����: ======");
		mgr.buy(new Shirt(2001,100,"���",35000,3));
		mgr.buy(new Shirt(4001,105,"���, �Ͼ�",45000,5));
		mgr.allList();
		System.out.println("======= �Ǹ�: ======");
		mgr.sell(5001, 10);
		mgr.sell(2001, 10);
		mgr.sell(3001, 10);
		mgr.allList();
		System.out.println("��ü ��ǰ��: " + mgr.size());
		System.out.println("��ü ���ݾ�: " + mgr.getTotalPrice());
		
	}

}

