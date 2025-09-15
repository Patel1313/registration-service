package com.evotingplatform.datainput;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static java.lang.System.*;

@SpringBootApplication
public class DataInputServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataInputServiceApplication.class, args);
		printAppName();
		out.println("Application Running at: http://localhost:1313");
		out.println("Swagger-UI Running at: http://localhost:1313/swagger-ui/index.html");
		out.println("Actuator Running at: http://localhost:1313/actuator");
	}

	private static void printAppName() {
		out.println();
		out.println("██████╗  █████╗ ████████╗ █████╗     ██╗███╗   ██╗██████╗ ██╗   ██╗████████╗");
		out.println("██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗    ██║████╗  ██║██╔══██╗██║   ██║╚══██╔══╝");
		out.println("██║  ██║███████║   ██║   ███████║    ██║██╔██╗ ██║██████╔╝██║   ██║   ██║   ");
		out.println("██║  ██║██╔══██║   ██║   ██╔══██║    ██║██║╚██╗██║██╔═══╝ ██║   ██║   ██║   ");
		out.println("██████╔╝██║  ██║   ██║   ██║  ██║    ██║██║ ╚████║██║     ╚██████╔╝   ██║   ");
		out.println("╚═════╝ ╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝    ╚═╝╚═╝  ╚═══╝╚═╝      ╚═════╝    ╚═╝   ");
		out.println();
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
