package prob02;

public class Goods {

	public String name;
	public int price;
	public int countStock;

	public Goods(String name, int price, int countStock) {

		this.name = name;
		this.price = price;
		this.countStock = countStock;

	}

	public void getGoods() {

		System.out.println(name + "(가격:" + price + "원)이 " + countStock + "개 입고 되었습니다.");

	}

}
