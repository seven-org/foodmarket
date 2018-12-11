package code.seven.test.market.user.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import code.seven.test.market.user.entity.UserSigninSerialsDay;
import code.seven.test.market.user.repository.custom.CustomRepository;


/**
 * createTime: 2018-09-13 16:01:06
 * 
 * @author seven
 * @version 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "userSigninSerialsDays", path = "userSigninSerialsDays")
public interface UserSigninSerialsDayRepository extends CustomRepository<UserSigninSerialsDay, Integer> {

}