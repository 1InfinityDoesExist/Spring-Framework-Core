
public class DemoBean {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public DemoBean(String message) {
		this.message = message;
	}

	public void show() {
		System.out.println(message);
	}
}
