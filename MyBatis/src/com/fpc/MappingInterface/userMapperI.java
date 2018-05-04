package com.fpc.MappingInterface;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;

import com.fpc.Entity.User;

public interface userMapperI {
	//使用@Insert注解指明add方法要执行的SQL
	@Insert("insert into users(name,age) values(#{name},#{age})")
	public int addUser(User user);
	
	//使用@Delete注解指明deleteUser方法要执行的SQL
	@Delete("delete from users where id=#{id}")
	public int deleteUser(int id);
	
	//使用@Update方法指明updateUser方法要执行的SQL
	@Update("update users set name=#{name},age=#{age} where id=#{id}")
	public int updateUser(User user);
	
	//使用select注解指明getUserById方法要执行的SQL
	@Select("select * from users where id=#{id}")
	public User getUserById(int id);
	
	//使用select注解指明getAllUsers方法要执行的SQL
	@Select("select * from users")
	public List<User> getAllUsers();
}
