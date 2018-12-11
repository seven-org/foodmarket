package code.seven.test.market.seller.facade.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("seller-service")
public interface SellerService {
	
	@RequestMapping(method = RequestMethod.GET, value = "/sellers")
	public String getSellers();

}
