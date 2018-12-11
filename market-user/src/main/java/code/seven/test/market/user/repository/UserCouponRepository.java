package code.seven.test.market.user.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import code.seven.test.market.user.entity.UserCoupon;
import code.seven.test.market.user.repository.custom.CustomRepository;


/**
 * createTime: 2018-09-13 15:54:25
 * 
 * @author seven
 * @version 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "userCoupons", path = "userCoupons")
public interface UserCouponRepository extends CustomRepository<UserCoupon, Integer> {

}