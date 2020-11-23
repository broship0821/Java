package peter.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		List<String> addressList = bean.getAddressList();
		for(String address : addressList) {
			System.out.println(address);
		}
		
		System.out.println("-------------------------");
		Map<String, String> addressList2 = bean.getAddressList2();
		for(String key : addressList2.keySet()) {
			System.out.printf("키: %s, 값: %s\n", key, addressList2.get(key));
		}
		
		System.out.println("-------------------------");
		Properties addressList3 = bean.getAddressList3();
		for(String key : addressList3.stringPropertyNames()) {
			System.out.printf("키: %s, 값: %s\n", key, addressList2.get(key));
		}
		
		System.out.println("-------------------------");
		Set<String> addressList4 = bean.getAddressList4();
		for(String key : addressList4) {
			System.out.println(key);
		}
		
		factory.close();
		

	}

}
