package org.console.redis.service;

import java.util.Set;

public interface RedisService {
	
	Set<String> keys(String pattern);
}
