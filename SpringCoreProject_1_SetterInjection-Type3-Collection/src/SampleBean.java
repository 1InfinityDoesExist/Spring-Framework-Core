import java.util.Iterator;
import java.util.Set;

public class SampleBean {

	private Set data;

	public void setData(Set data) {
		this.data = data;
	}

	public void printData() {

		Iterator it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
