package com.petsitter;

import com.petsitter.entity.UserEntity;
import com.petsitter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

	@Autowired
	UserRepository cRes;

	public static void main(String[] args) {
		System.out.println("<<<<<>>>>> XXXXXXXXXXXXX   !!!!!!!!!!!!!!!!!! STARTING SPRING BOOT !!!!!!!!!!!!!!!!!!!!!!!   XXXXXXXXXX      <<<<<>>>>> ");
		SpringApplication.run(App.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("<<<<<>>>>> XXXXXXXXXXXXX   !!!!!!!!!!!!!!!!!! STARTING PET SITTER  !!!!!!!!!!!!!!!!!!!!!!!   XXXXXXXXXX      <<<<<>>>>> ");
		};
	}

	@Bean
	public CommandLineRunner testDBConnectionWorks() {
		return (args) -> {

			UserEntity result = cRes.findByUserName("bob");

			System.out.println("User ! " + (result != null ? result.toString() : " no user"));

			if (result != null) {
				System.out.println("\t\t\t 				__________        __         .__  __    __         ");
				System.out.println("\t\t\t \\______   \\ _____/  |_  _____|__|/  |__/  |_  ___________");
				System.out.println("\t\t\t 						|     ___// __ \\   __\\/  ___/  \\   __\\   __\\/ __ \\_  __ \\");
				System.out.println("\t\t\t 						|    |   \\  ___/|  |  \\___ \\|  ||  |  |  | \\  ___/|  | \\/");
				System.out.println("\t\t\t  |____|    \\___  >__| /____  >__||__|  |__|  \\___  >__|   ");
				System.out.println("\t\t\t                \\/          \\/                    \\/");
				System.out.println(":: Petsitter :: v.1.0 (Copyright Oliver Watkins)");
				System.out.println("");
				System.out.println("");
			}else {
				System.err.println("No user data found for bob");
			}
		};
	}
}
