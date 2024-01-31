package uz.pdp.autoconfig_based.service;

import org.springframework.stereotype.Component;

@Component
public class BService {
    public  void print(){
        System.out.println(BService.class.getName()+ " print()");
    }
}
