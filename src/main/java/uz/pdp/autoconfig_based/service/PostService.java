package uz.pdp.autoconfig_based.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import uz.pdp.autoconfig_based.repo.CrudRepo;

@Component
public class PostService {
    private final CrudRepo repo;

    public PostService(@Qualifier("postRepo") CrudRepo repo) {
        this.repo = repo;
    }

    public void save() {
        System.out.println(PostService.class.getName() + " save()");
        repo.create();
    }
}
