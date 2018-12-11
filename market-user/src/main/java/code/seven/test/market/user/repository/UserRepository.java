package code.seven.test.market.user.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import code.seven.test.market.user.entity.User;
import code.seven.test.market.user.repository.custom.CustomRepository;

/**
 * createTime: 2018-09-13 15:48:29
 * 
 * @author seven
 * @version 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends CustomRepository<User, Integer> {

}