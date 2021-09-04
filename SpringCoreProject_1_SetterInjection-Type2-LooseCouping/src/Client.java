import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String[] args) {

		Resource res = new ClassPathResource("SpConfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		Resource res1 = new ClassPathResource("SpConfig1.xml");
		BeanFactory factory1 = new XmlBeanFactory(res1, factory);

		Object o = factory1.getBean("id3");

		Journey j = (Journey) o;
		j.startJourney();

	}

}
