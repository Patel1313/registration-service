package com.evotingplatform.datainput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.*;

@SpringBootApplication
public class DataInputServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataInputServiceApplication.class, args);
		printAppName();
		out.println("Application Running at: http://localhost:1313");
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

}
