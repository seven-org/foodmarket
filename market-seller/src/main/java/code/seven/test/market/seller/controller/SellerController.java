package code.seven.test.market.seller.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
//import org.springframework.cloud.config.environment.Environment;
//import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class SellerController {
	
	private final Logger logger = LoggerFactory.getLogger(SellerController.class);
	
	@Autowired
	private Environment env;
	
	@Value("${spring.application.name}")
	private String applicationName;

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String index() {
//		List<PropertySource> pss = env.getPropertySources();
		logger.info(env.getProperty("author"));
		logger.info(env.getProperty("from"));
		logger.info(env.getProperty("spring.datasource.url"));
//		List<ServiceInstance> serviceInstances = client.getInstances(applicationName);
//		serviceInstances.forEach(s -> logger.info("/test, serviceId: " + s.getUri()));
		return "restController test";
	}
}
