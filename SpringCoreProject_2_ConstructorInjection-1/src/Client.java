import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//Note if both setter and constructor injection present then setter injection overrides constructor injection.

// To test remove the <property> in .xml file then test 
//again add the <property> in .xml the test you will see the setter injection overrides the constructor injection.
public class Client {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("SpConfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Object object = factory.getBean("id1");
		DemoBean bean = (DemoBean) object;
		bean.show();
	}

}
