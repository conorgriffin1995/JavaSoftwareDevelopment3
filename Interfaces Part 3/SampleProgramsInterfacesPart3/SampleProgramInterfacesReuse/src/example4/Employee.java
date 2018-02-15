package example4;

public abstract class Employee implements Measurable {
	private String name;

	public Employee(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract public double pay();

        @Override
	public String toString() {
		return name;
	}

}
