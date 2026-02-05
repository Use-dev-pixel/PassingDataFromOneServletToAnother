package org.jsp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Building getBuilding1() {
		Building building = new Building("Elite Arcade", 5, 7, false);
		return building;
	}

	@Bean
	public Building getBuilding2() {
		Building building = new Building("GOOGLE", 5, 7, false);
		return building;
	}
}
