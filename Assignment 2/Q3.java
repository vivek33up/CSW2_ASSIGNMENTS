import java.util.*;

class Car implements Comparable<Car> {
	private String model, color;
	private int speed;

	Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

	@Override
	public int compareTo(Car c) {
		return Integer.compare(this.getSpeed(), c.getSpeed());
	}

	public String toString() {
		return "Car model : " + model + ", color : " + color + ", speed : " + speed;
	}
}

public class Q3 {

	public static void main(String[] args) {
		Car cars[] = { new Car("Tesla", "White", 200), new Car("Jaguar", "Black", 100) };
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		Arrays.sort(cars);
		System.out.println("The car has highest speed -> " + cars[1]);
	}

}