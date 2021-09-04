
public class DemoBean {

	private String message;
	private String uname;
	private String pwd;

	public DemoBean(String uname, String pwd) {
		this.uname = uname;
		this.pwd = pwd;
	}

	public DemoBean(String message) {
		this.message = message;
	}

	public void show() {
		System.out.println(message);
	}

	public void show1() {
		System.out.println(uname);
		System.out.println(pwd);
	}
}
