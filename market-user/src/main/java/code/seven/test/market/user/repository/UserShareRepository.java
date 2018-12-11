package code.seven.test.market.user.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import code.seven.test.market.user.entity.UserShare;
import code.seven.test.market.user.repository.custom.CustomRepository;


/**
 * createTime: 2018-09-13 15:57:15
 * 
 * @author seven
 * @version 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "userShares", path = "userShares")
public interface UserShareRepository extends CustomRepository<UserShare, Integer> {

}