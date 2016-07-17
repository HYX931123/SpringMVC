package com.cnpay.serviceImpl;

import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnpay.mapper.UsersMapper;
import com.cnpay.model.Users;
import com.cnpay.service.UsersService;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {

	@Resource
	private UsersMapper usersMapper;

	  /**
	   * 添加用户信息
	   * 
	   * @param param
	   */
	  @Override
	  public void insertUsers(Map<String, Object> param) {
	    usersMapper.insertUsers(param);
	  }

	  /**
	   * 删除用户信息
	   * 
	   * @param id
	   */
	  @Override
	  public void deleteUsers(int id) {
	    usersMapper.deleteUsers(id);
	  }

	  /**
	   * 修改用户信息
	   * 
	   * @param param
	   */
	  @Override
	  public void updateUsers(Map<String, Object> param) {
	    usersMapper.updateUsers(param);
	  }

	  /**
	   * 查询用户信息(后台)
	   * 
	   * @return List<Users>
	   */
	  @Override
	  public ArrayList<Users> searchUsers() {
	    return usersMapper.searchUsers();
	  }

	  /**
	   * 根据用户名称查询用户信息(后台)
	   * 
	   * @return List<Users>
	   */
	  @Override
	  public ArrayList<Users> searchUsersByUsername(String username) {
	    return usersMapper.searchUsersByUsername(username);
	  }

	  /**
	   * 根据编号查询用户信息
	   * 
	   * @param id
	   * @return Users
	   */
	  @Override
	  public Users searchUsersById(int id) {
	    return usersMapper.searchUsersById(id);
	  }

	  /**
	   * 根据用户名和密码查询用户是否存在
	   * 
	   * @param param
	   * @return Users
	   */
	  public Users getUserByUsernameAndPassword(Map<String, Object> param) {
	    return usersMapper.getUserByUsernameAndPassword(param);
	  }
}
