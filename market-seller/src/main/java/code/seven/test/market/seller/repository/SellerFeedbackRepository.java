package code.seven.test.market.seller.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import code.seven.test.market.seller.entity.SellerFeedback;
import code.seven.test.market.seller.repository.custom.CustomRepository;


/**
 * createTime: 2018-09-13 20:44:19
 * 
 * @author seven
 * @version 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "sellerFeedbacks", path = "sellerFeedbacks")
public interface SellerFeedbackRepository extends CustomRepository<SellerFeedback, Integer> {

}