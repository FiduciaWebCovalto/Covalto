package com.fiduciawebmovilp;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
@EnableAsync
@RequiredArgsConstructor
public class FiduciaWebMovilApplicationP {

//    private final NotificationService notificationService;

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        SpringApplication.run(FiduciaWebMovilApplicationP.class, args);
        /*System.setProperty("PORT", dotenv.get("PORT"));
        System.setProperty("LOCAL_DB_URL", dotenv.get("LOCAL_DB_URL"));
        System.setProperty("LOCAL_DB_USERNAME", dotenv.get("LOCAL_DB_USERNAME"));
        System.setProperty("LOCAL_DB_PASSWORD", dotenv.get("LOCAL_DB_PASSWORD"));
        System.setProperty("PROD_DB_URL", dotenv.get("PROD_DB_URL"));
        System.setProperty("PROD_DB_USERNAME", dotenv.get("PROD_DB_USERNAME"));
        System.setProperty("PROD_DB_PASSWORD", dotenv.get("PROD_DB_PASSWORD"));
        System.setProperty("JWT_SECRET", dotenv.get("JWT_SECRET"));
        System.setProperty("JWT_EXPIRATION_TIME", dotenv.get("JWT_EXPIRATION_TIME"));

        System.setProperty("MAIL_USER", dotenv.get("MAIL_USER"));
        System.setProperty("MAIL_PASS", dotenv.get("MAIL_PASS"));
        System.setProperty("AWS_ACCESS_KEY", dotenv.get("AWS_ACCESS_KEY"));
        System.setProperty("AWS_SECRETE_KEY", dotenv.get("AWS_SECRETE_KEY"));
        System.setProperty("AWS_BUCKET_NAME", dotenv.get("AWS_BUCKET_NAME"));*/
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
