package code.seven.test.market.seller.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import code.seven.test.market.seller.entity.SellerLog;
import code.seven.test.market.seller.repository.custom.CustomRepository;


/**
 * createTime: 2018-09-13 20:45:06
 * 
 * @author seven
 * @version 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "sellerLogs", path = "sellerLogs")
public interface SellerLogRepository extends CustomRepository<SellerLog, Integer> {

}