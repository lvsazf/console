package org.console.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Jedis jedis = new Jedis("140.143.246.241");
		jedis.auth("j1234&*()");
		
//		JedisPoolConfig config = new JedisPoolConfig();
//		config.setMaxTotal(10);
		jedis.set("fot", "bar");
		String value = jedis.get("fot");
		System.out.println(value);
		jedis.close();
		System.out.println("71ad067c-587b-4945-9ece-614b4d3e9ed4".length());
	}
}
