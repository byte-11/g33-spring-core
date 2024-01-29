package uz.pdp.java_based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import uz.pdp.xml_based.DatasourceManager;
import uz.pdp.xml_based.UserService;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {
    /*@Bean
    public EmailService emailService() {
        return new EmailService(databaseManager());
    }*/

    @Bean
    public EmailService emailService(DatabaseManager databaseManager) {
        return new EmailService(databaseManager);
    }

    @Bean(initMethod = "init" , destroyMethod = "destroy")
    public DatabaseManager databaseManager() {
        return new DatabaseManager();
    }

    @Bean
    public PostService postService(DatabaseManager databaseManager){
        PostService postService = new PostService();
        postService.setDatabaseManager(databaseManager);
        return postService;
    }
}
