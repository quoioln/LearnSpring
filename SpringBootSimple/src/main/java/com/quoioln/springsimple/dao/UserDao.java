/**
 * 
 */
package com.quoioln.springsimple.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.quoioln.springsimple.model.User;

/**
 * @author quoioln
 *
 */
@Transactional
public interface UserDao extends CrudRepository<User, Long> {
	
	public User findOneById(Long id);
	
//	@Query(value = "select u from User where id = :id and deleteFlag = :deleteFlag")
	@Query(value = "from User u where u.id = :id and u.deleteFlag = 0", nativeQuery = false)
	public User findOne(@Param("id") Long id);
	
	public List<User> findAll();
	
	public User findOneByIdAndDeleteFlag(Long id, Integer deleteFlag);
}
