
public class TestDTO {
	private String name;
	

	public TestDTO() {
		super();
	}

	public TestDTO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestDTO [name=" + name + "]";
	}
	
}
