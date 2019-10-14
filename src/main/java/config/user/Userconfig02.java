package config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.itcen.springcontainer.user.User;

@Configuration					// 많이 사용
public class Userconfig02 {

	@Bean
	public User user() {
		return new User();
	}
	
	
}
