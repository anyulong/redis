package com.example;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.example.pojo.User;

@Service
public class RedisService {
	@Autowired
	RedisTemplate redisTemplate;
	@Autowired
	StringRedisTemplate stringRedisTemplate;
	
	public String test() {
		String uuid = UUID.randomUUID().toString();
		stringRedisTemplate.opsForValue().set("1", uuid);;
		stringRedisTemplate.opsForHash().put("my", "1", "world");
		return "";
	}
	
	public void saveUser(User user) {
	/*	stringRedisTemplate.opsForHash().put(String.valueOf(user.getId()), "name", user.getName());
		stringRedisTemplate.opsForHash().put(String.valueOf(user.getId()), "age", String.valueOf(user.getAge()));*/
		
		redisTemplate.opsForValue().set("user"+String.valueOf(user.getId()), user);
		//redisTemplate.opsForList().set("users", 1, user);
	}
	public User getUser() {
		User user = new User();
		//System.out.println(redisTemplate.opsForValue().);
		//redisTemplate.keys(pattern)
		return user;
		
	}

}
