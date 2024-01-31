package uz.pdp.java_based;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.pdp.java_based.controller.CommentController;

public class JavaConfigBasedMain {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ApplicationConfig2.class);
        /*EmailService emailService = context.getBean(EmailService.class);
        emailService.send();
        DatabaseManager databaseManager = context.getBean(DatabaseManager.class);
        System.out.println(databaseManager);*/
        CommentController controller = context.getBean(CommentController.class);
        System.out.println(controller);
    }
}
