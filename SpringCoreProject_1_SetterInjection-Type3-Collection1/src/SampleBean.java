import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SampleBean {

	private List data;
	private Map<String, Integer> employees;

	public void setData(List data) {
		this.data = data;
	}

	public void setEmployees(Map<String, Integer> employees) {
		this.employees = employees;
	}

	public void printList() {
		Iterator it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public void printMap() {
		Set s = employees.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
	}
}
