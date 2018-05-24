package org.console.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		var jedis = new Jedis("140.143.246.241");
		jedis.auth("j1234&*()");

		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxTotal(10);
//		jedis.set("fot", "bar");
//		var value = jedis.get("fot");
//		System.out.println(value);
		jedis.keys("*").stream().forEach(System.out :: println);;
		jedis.close();
		new App().getConfig();
	}

	public void getConfig() {
//		Config config = new Config();
//		config.useSingleServer()
//		      .setAddress("redis://140.143.246.241:6379")
//			  .setPassword("j1234&*()");
//		RedissonClient redisson = Redisson.create(config);
//		RBucket<Object> bucket = redisson.getBucket("fot");
//		System.out.println(bucket.get());
	}

}
