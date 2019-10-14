package config.user;

import org.springframework.context.annotation.Bean;

import kr.co.itcen.springcontainer.user.Friend;
import kr.co.itcen.springcontainer.user.User;


// 자바 config -> container를 바꿔야함
public class UserConfig01 {
	
	@Bean
	public User user() {
		return new User();
	}
	
	@Bean
	public Friend friend() {
		return new Friend("둘리");
	}
	
}
