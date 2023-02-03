// @ Author :- Mangaldip Ghosh
//restaurant billing system

package resturant.java;

public class ResturantService {

	public static void main(String[] args) {
		// object for ResturantMain Class
		ResturantMain resturantMain = new ResturantMain();
		//Array for Create menu Method
		resturantMain.CreateMenu();
		//Menu print Method
		ResturantMain.getDisplay();
		//Menu order Method
		ResturantMain.getOrder();
		//Menu for order and billing Method
		ResturantMain.getBilling();
	}

}
