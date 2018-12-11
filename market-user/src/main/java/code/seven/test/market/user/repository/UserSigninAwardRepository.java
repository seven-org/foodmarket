package code.seven.test.market.user.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import code.seven.test.market.user.entity.UserSigninAward;
import code.seven.test.market.user.repository.custom.CustomRepository;


/**
 * createTime: 2018-09-13 15:58:45
 * 
 * @author seven
 * @version 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "userSigninAwards", path = "userSigninAwards")
public interface UserSigninAwardRepository extends CustomRepository<UserSigninAward, Integer> {

}