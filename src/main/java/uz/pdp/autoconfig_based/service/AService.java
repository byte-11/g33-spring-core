package uz.pdp.autoconfig_based.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class AService {
    public  void print(){
        System.out.println(AService.class.getName()+ " print()");
    }

    @PostConstruct
    public void init(){
        System.out.println(AService.class.getName() + " init()");
    }

    @PreDestroy
    public void destroy(){
        System.out.println(AService.class.getName() + " destroy()");
    }
}
