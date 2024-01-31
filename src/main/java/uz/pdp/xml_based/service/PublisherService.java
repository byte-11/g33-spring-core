package uz.pdp.xml_based.service;

public class PublisherService {
    private final Service service;

    public PublisherService(Service service) {
        System.out.println(PublisherService.class.getName() + " construct()");
        this.service = service;
    }
}
