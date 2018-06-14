package edu.skku.java.store;

public class Pants extends Shirt {
	private int len;

	
	public Pants() {
		super();
	}

	public Pants(int num, int size, String color, int price, int quantity, int len) {
		super(num, size, color, price, quantity); //super(num...quantity)��ӹ��� �����ڸ� �ҷ���!
		setLen(len);
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	@Override // ����������, ����Ÿ��, �Ķ���Ͱ� ���ƾ� ��
	public String toString() {
		return "Pants [getNum()=" + getNum() + ", getSize()=" + getSize() + ", getColor()=" + getColor()
				+ ", getPrice()=" + getPrice() + ", getQuantity()=" + getQuantity() + ", len=" + len + "]";
		//return super.toString()+" len:"+len;
	}
	
	
	

}
