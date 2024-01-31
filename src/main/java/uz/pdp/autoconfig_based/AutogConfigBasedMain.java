package uz.pdp.autoconfig_based;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.pdp.autoconfig_based.config.AutoAppConfig;
import uz.pdp.autoconfig_based.service.AService;
import uz.pdp.autoconfig_based.service.PostService;

public class AutogConfigBasedMain {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AutoAppConfig.class);
        /*AService aService = context.getBean(AService.class);
        aService.print();*/

        PostService postService = context.getBean(PostService.class);
        postService.save();
        context.close();
    }
}
