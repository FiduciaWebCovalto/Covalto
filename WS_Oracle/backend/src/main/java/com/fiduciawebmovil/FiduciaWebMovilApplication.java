package com.fiduciawebmovil;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
@EnableAsync
@RequiredArgsConstructor
public class FiduciaWebMovilApplication {

//    private final NotificationService notificationService;

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        SpringApplication.run(FiduciaWebMovilApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(){
//        return args -> {
//            NotificationDTO notificationDTO = NotificationDTO.builder()
//                    .recipient("therecepientemail@gmail.com")
//                    .subject("HEllo testing email")
//                    .body("Hey, this is a test eamil 😁")
//                    .type(NotificationType.EMAIL)
//                    .build();
//
//            notificationService.sendEmail(notificationDTO, new User());
//        };
//    }

}
