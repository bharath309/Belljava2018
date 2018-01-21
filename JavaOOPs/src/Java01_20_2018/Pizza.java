package Java01_20_2018;

public class Pizza {

	private String pizzaType;
	private int size;
	private double cost;
	private String deliveryMode;
	public String getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getDeliveryMode() {
		return deliveryMode;
	}
	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}
	@Override
	public String toString() {
		return "Pizza [pizzaType=" + pizzaType + ", size=" + size + ", cost=" + cost + ", deliveryMode=" + deliveryMode
				+ "]";
	}
	
	
}
