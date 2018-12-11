package code.seven.test.market.seller.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import code.seven.test.market.seller.entity.SellerCapitalRecord;
import code.seven.test.market.seller.repository.custom.CustomRepository;


/**
 * createTime: 2018-09-13 20:43:33
 * 
 * @author seven
 * @version 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "sellerCapitalRecords", path = "sellerCapitalRecords")
public interface SellerCapitalRecordRepository extends CustomRepository<SellerCapitalRecord, Integer> {

}