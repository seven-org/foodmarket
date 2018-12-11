package code.seven.test.market.seller.facade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import code.seven.test.market.seller.facade.service.SellerService;

@RestController
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@RequestMapping(value = "/sellers", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE+";charset=utf-8"})
	public String getAll() {
		return sellerService.getSellers();
	}

}
