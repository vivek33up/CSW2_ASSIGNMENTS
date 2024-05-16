class Animal {
	private String name;
	private String color;
	private String type;

	public Animal(String name, String color, String type) {
		this.name = name;
		this.color = color;
		this.type = type;
	}

	@Override
	public int hashCode() {
		int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

}

public class Q6 {
	public static void main(String[] args) {
		Animal animal1 = new Animal("Dog", "Brown", "Pet");
		Animal animal2 = new Animal("Tiger", "Orange", "Wild");

		System.out.println("Hash code for animal1: " + animal1.hashCode());
		System.out.println("Hash code for animal2: " + animal2.hashCode());
	}
}