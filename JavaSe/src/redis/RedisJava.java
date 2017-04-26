package redis;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

/**
 * Created by iparhan on 4/26/17.
 */
public class RedisJava {
    public static void main(String[]arsg) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("    Success");
        System.out.println(jedis.ping());
       RedisJava redisJava = new RedisJava();
       redisJava.TestRedisString();
    }

    //@Test
    public  void TestRedisString(){
        Jedis jedis = new Jedis("localhost");
        System.out.println("Success 01");
        String name = jedis.get("thename");
        String name01 =  jedis.get("theName");
        System.out.println(name);
        System.out.println(name01);
    }

}
