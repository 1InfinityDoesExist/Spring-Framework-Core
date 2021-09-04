import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
		
		/*
		 * <?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">


	<bean id="id1" class="SampleBean">
		<property name="db">
			<bean class="DemoBean"></bean>
		</property>
	</bean>

	<bean id="id2" class="ExampleBean">
		<property name="db">
			<bean class="DemoBean"></bean>
		</property>
	</bean>

</beans>
		 * 
		 */
		Resource resource = new ClassPathResource("SpConfig.xml"); // Problem
		BeanFactory factory = new XmlBeanFactory(resource);
		Object sampleObject = factory.getBean("id1");

		Object exampleObject = factory.getBean("id2");
		
		Object demoObject = factory.getBean("id3");

		SampleBean sb = (SampleBean) sampleObject;
		ExampleBean eb = (ExampleBean) exampleObject;
		
		DemoBean db = (DemoBean)demoObject;

		sb.show();
		eb.show1();
		db.m1();
	}
}
