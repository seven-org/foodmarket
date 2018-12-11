package code.seven.test.market.seller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MarketSellerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketSellerApplication.class, args);
	}
}
