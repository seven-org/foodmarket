package code.seven.test.market.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	private final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private DiscoveryClient client;
	
	@Value("${spring.application.name}")
	private String applicationName;

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String index() {
		List<ServiceInstance> serviceInstances = client.getInstances(applicationName);
		serviceInstances.forEach(s -> logger.info("/test, serviceId: " + s.getUri()));
		return "restController test";
	}
}
