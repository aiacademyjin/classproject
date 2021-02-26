package com.aia.op.member.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import com.aia.op.member.domain.LoginInfo;


@Service
public class RedisService {

	//private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	//private String TAG = this.getClass().getName();

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	/**
	 * Redis 에 사용자 정보를 등록한다.
	 * 
	 * @param LoginInfo
	 */

	public void setUserInformation(LoginInfo loginInfo, HttpSession session ) {

		//logger.debug("> setUserInformation", TAG);

		
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new StringRedisSerializer());
		
		String key = session.getId();

		Map<String, Object> mapMemberInfo = new HashMap<String, Object>();
		mapMemberInfo.put("memberId", loginInfo.getMemberid());
		mapMemberInfo.put("memberName", loginInfo.getMembername());
		mapMemberInfo.put("memberPhoto", loginInfo.getMemberphoto());
		redisTemplate.opsForHash().putAll(key, mapMemberInfo);

	}

	/**
	 * Redis 에서 사용자 정보를 가져온다.
	 * @param loginInfo
	 * @return
	 */

	public LoginInfo getUserInformation(String sessionId) {

		//logger.debug("> getUserInformation", TAG);
		
		redisTemplate.opsForHash();
		

		String key = sessionId;
		
		System.out.println(redisTemplate.opsForValue().get("6DF7C1BFDD326765865F866F1155A17A"));

		
		
		
		/*
		 * LoginInfo result = new LoginInfo( (String)
		 * redisTemplate.opsForHash().get(key, "memIdx"), (String)
		 * redisTemplate.opsForHash().get(key, "memberName"), (String)
		 * redisTemplate.opsForHash().get(key, "memberPhoto"));
		 */
		//logger.debug("> userId       : {}", result.getMemberid(), TAG);
		//logger.debug("> userPassword : {}", result.getMembername(), TAG);
		//logger.debug("> phoneNumber  : {}", result.getMemberphoto(), TAG);

		return null;

	}

}
