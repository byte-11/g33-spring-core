package uz.pdp.java_based;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import uz.pdp.java_based.controller.CommentController;
import uz.pdp.java_based.service.CommentService;
import uz.pdp.java_based.service.LikeService;
import uz.pdp.java_based.service.Service;

@Configuration
public class ApplicationConfig2 {

    @Bean
    public CommentService commentService(){
        return new CommentService();
    }

    @Bean
    @Scope("singleton")
    public LikeService likeService(){
        return new LikeService();
    }

    /*@Bean
    public CommentController commentController(){
        return new CommentController(commentService());
    }*/

    @Bean
    @Scope("prototype")
    @Lazy
    public CommentController commentController(@Qualifier("commentService") Service service){
        return new CommentController(service);
    }
}
