package code.seven.test.market.user.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import code.seven.test.market.user.entity.UserSigninAwardGoodsOrder;
import code.seven.test.market.user.repository.custom.CustomRepository;


/**
 * createTime: 2018-09-13 16:00:25
 * 
 * @author seven
 * @version 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "userSigninAwardGoodsOrders", path = "userSigninAwardGoodsOrders")
public interface UserSigninAwardGoodsOrderRepository extends CustomRepository<UserSigninAwardGoodsOrder, Integer> {

}