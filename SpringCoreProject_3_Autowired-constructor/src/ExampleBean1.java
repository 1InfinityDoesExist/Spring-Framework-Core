
public class ExampleBean1 {

	ExampleBean2 eb2;

	public ExampleBean1(ExampleBean2 eb2) {
		this.eb2 = eb2;
	}

	public void show() {
		eb2.m1();
	}

}
