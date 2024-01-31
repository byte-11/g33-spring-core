package uz.pdp.autoconfig_based.repo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@Lazy
public class PostRepo implements CrudRepo{
    @Override
    public void create() {
        System.out.println(PostRepo.class.getName() + " create()");
    }
}
