package athome.trader.infrastructure.integration;

import javax.annotation.Resource;

import org.apache.camel.ProducerTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/META-INF/trader-applicationContext.xml"})
public class TraderRouteBuilderTest {

	@Resource
	ProducerTemplate producerTemplate;
	
	@Test
	public void testThis() {
		System.out.println(producerTemplate);
	}
	
}