package edu.skku.java.store;

public class Pants extends Shirt {
	private int len;

	
	public Pants() {
		super();
	}

	public Pants(int num, int size, String color, int price, int quantity, int len) {
		super(num, size, color, price, quantity); //super(num...quantity)상속받은 생성자를 불러라!
		setLen(len);
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	@Override // 접근제한자, 리턴타입, 파라메터가 같아야 함
	public String toString() {
		return "Pants [getNum()=" + getNum() + ", getSize()=" + getSize() + ", getColor()=" + getColor()
				+ ", getPrice()=" + getPrice() + ", getQuantity()=" + getQuantity() + ", len=" + len + "]";
		//return super.toString()+" len:"+len;
	}
	
	
	

}
