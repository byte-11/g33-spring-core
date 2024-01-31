package uz.pdp.autoconfig_based.repo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class UserRepo implements CrudRepo{
    @Override
    public void create() {
        System.out.println(UserRepo.class.getSimpleName() + " create()");
    }
}
