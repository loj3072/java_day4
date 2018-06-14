
package edu.skku.java.store;

public class WearManagerImpl {
	Shirt[] ss=new Shirt[100];
	int index=0;
	
	public void add(Shirt s) {
		ss[index]=s;
		index++;
	}
	
	public void allList() {
		for(int i=0; i<index; i++) {
			System.out.println(ss[i]);//ss[i].toString()을 출력
		}
	}
	
	public void getColor(String color) {
		for(int i=0; i<index; i++) {
			if(ss[i].getColor().contains(color)) //똑같으냐 .equlas / 포함하냐 .contains
				System.out.println(ss[i]);
		}
	}
	
	public void getPrice(int price) {
		for(int i=0; i<index; i++) {
			if(ss[i].getPrice()<=price)
				System.out.println(ss[i]);
		}
	}
	
	//파라메터로 주어진 상품번호의 옷을 찾아서 리턴
	public Shirt search(int num) {
		for(int i=0; i<index; i++) {
			if(ss[i].getNum() ==num) {
				return ss[i];
			}
		}
		return null; //아무 것도 없다
	}
	
	//파라메터의 셔츠를 구매
	public void buy(Shirt s) {
		//제품이 존재하는지 체크
		Shirt sh=search(s.getNum());
		if(sh==null){ //같은 클래스 내의 메서드는 그냥 쓸 수 있다
			add(s);	//존재하지 않으면 새로 셔츠 추가 .add()	
		}else { //존재하면 수량만 증가
			sh.setQuantity(sh.getQuantity()+s.getQuantity());
		}	
	}
	
	//파라메터의 셔츠를 quantity 수량만큼 판매
	public void sell(int num, int quantity) {
		Shirt sh=search(num); //번호로 셔츠 찾기
		if(sh != null) {//옷이 있다면
			if(sh.getQuantity()>=quantity) {
				sh.setQuantity(sh.getQuantity()-quantity);	
			}else {
				System.out.println("수량부족~");
			}
		}else {
			System.out.println("상품번호가 존재하지 않습니다.");
		}
		
		//재고가 0이 되면 그 상품 정보를 남길 것인가 제거할 것인가도 고려하기
	}
	
	public int size() {
		return index;
	}
	
	public int getTotalPrice() {
		int total=0;
		for(int i=0; i<index; i++) {
			//total = total + ss[i].getPrice()*ss[i].getQuantity();
			total += ss[i].getPrice()*ss[i].getQuantity();
		}
		return total;
	}

}
