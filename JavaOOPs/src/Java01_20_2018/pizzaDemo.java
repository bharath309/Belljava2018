package Java01_20_2018;

public class pizzaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza dominos =new Pizza();
		
		dominos.setPizzaType("Veggie");
		dominos.setSize(10);
		dominos.setCost(20.23);
		dominos.setDeliveryMode("pickUp");
		
		Pizza pizzahut =new Pizza();
		
		pizzahut.setPizzaType("chicken");
		pizzahut.setSize(12);
		pizzahut.setCost(25.11);
		pizzahut.setDeliveryMode("2go");
		
		
		System.out.println(dominos);
		
		

	}

}
