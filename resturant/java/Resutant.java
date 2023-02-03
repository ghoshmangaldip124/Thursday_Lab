package resturant.java;

public class Resutant {
	String menu;
	int id;
	public Resutant(int id,String menu) {
		super();
		this.id = id;
		this.menu = menu;
	}
	public String getMenu() {
		return menu;
	}
	public int getId() {
		return id;
	}
}
class Price {
	int price;
	public Price(int price) {
		super();
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
}
