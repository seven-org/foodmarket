package code.seven.test.market.user.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import code.seven.test.market.user.entity.UserSigninAwardGoods;
import code.seven.test.market.user.repository.custom.CustomRepository;


/**
 * createTime: 2018-09-13 15:59:33
 * 
 * @author seven
 * @version 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "userSigninAwardGoodss", path = "userSigninAwardGoodss")
public interface UserSigninAwardGoodsRepository extends CustomRepository<UserSigninAwardGoods, Integer> {

}