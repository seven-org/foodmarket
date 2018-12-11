package code.seven.test.market.user.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import code.seven.test.market.user.entity.UserLabel;
import code.seven.test.market.user.repository.custom.CustomRepository;


/**
 * createTime: 2018-09-13 15:55:07
 * 
 * @author seven
 * @version 0.0.1
 */
@RepositoryRestResource(collectionResourceRel = "userLabels", path = "userLabels")
public interface UserLabelRepository extends CustomRepository<UserLabel, Integer> {

}