// @ Author :- Mangaldip Ghosh
//restaurant billing system

package resturant.java;

//class for Resutant
public class Resutant {
	//constructor for menu
	String menu;
	int id;
	public Resutant(int id,String menu) {
		super();
		this.id = id;
		this.menu = menu;
	}
	//get method
	public String getMenu() {
		return menu;
	}
	public int getId() {
		return id;
	}
}
//class for price
class Price {
	int price;
	public Price(int price) {
		//constructor for price
		super();
		this.price = price;
	}
	//get method for price
	public int getPrice() {
		return price;
	}
}
