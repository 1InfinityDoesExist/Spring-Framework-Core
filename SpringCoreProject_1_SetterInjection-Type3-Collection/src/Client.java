import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("SpConfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		Object object = factory.getBean("id1");
		SampleBean bean = (SampleBean) object;
		bean.printData();
	}

}
