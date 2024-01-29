package uz.pdp.java_based;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);
        EmailService emailService = context.getBean(EmailService.class);
        emailService.send();
        DatabaseManager databaseManager = context.getBean(DatabaseManager.class);
        System.out.println(databaseManager);
    }
}
