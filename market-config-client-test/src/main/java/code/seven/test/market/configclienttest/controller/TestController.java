package code.seven.test.market.configclienttest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Value("${from}")
	private String from;
	
	@Autowired
	private Environment env;
	
	@RequestMapping("/from")
	public String from() {
		logger.info("from: " + from);
		logger.info("env.author: " + env.getProperty("author"));
		logger.info("env.app-name: " + env.getProperty("app-name"));
		return this.from;
	}

}
