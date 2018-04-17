package smm.springboot_ftl.service;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import smm.springboot_ftl.bean.User;
import smm.springboot_ftl.mapper.UserMapper;


@ComponentScan({"ssm.springboot_ftl.mapper"})
@Service("userService")
public class UserService implements UserIService{

	@Resource
	private UserMapper userMapper;
	
	@Override
	public void insert(User user) {
		userMapper.insert(user);
	}

	public void update(User user) {
		userMapper.update(user);
	}

	public User find(int id) {
		return userMapper.find(id);
	}
	
	public void delete(int id){
		userMapper.delete(id);
	}
}
