package code.seven.test.market.seller.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import code.seven.test.market.seller.entity.Seller;
import code.seven.test.market.seller.repository.custom.CustomRepository;


/**
 * createTime: 2018-09-13 20:42:31
 * 
 * @author seven
 * @version 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "sellers", path = "sellers")
public interface SellerRepository extends CustomRepository<Seller, Integer> {

}