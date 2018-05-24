package org.console.redis.service;

import java.util.Set;

import org.console.redis.JedisConfig;

import redis.clients.jedis.Jedis;

public class JedisService implements RedisService{
	
	final Jedis jedis;
			
	public JedisService(final JedisConfig config) {
		jedis = new Jedis(config.getHost());
		jedis.auth(config.getPassword());
	}

	@Override
	public Set<String> keys(String pattern) {
		return jedis.keys(pattern);
	}
}
