package com.harbiyazilim.mongodb.springbootmongodbexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return new CommandLineRunner() {
			@Override
			public void run(String... arg0) throws Exception {
				userRepository.save(new Users(1, "Cegizhan", "Software Developer", 3000L));
				userRepository.save(new Users(2, "Bedirhan", "Architect", 2000L));
			}
		};
	}

}
