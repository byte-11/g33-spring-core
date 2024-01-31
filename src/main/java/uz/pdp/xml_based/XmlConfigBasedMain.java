package uz.pdp.xml_based;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.pdp.xml_based.service.PublisherService;

public class XmlConfigBasedMain {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("classpath:/ioc-settings.xml");
        /*ABean aBean = context.getBean(ABean.class);
        aBean.print();
        aBean.getBBean().print();
        aBean.getCBean().print();
        aBean.getCBean().getDBean().print();*/
       /* DatasourceManager datasourceManager = context.getBean(DatasourceManager.class);
        System.out.println(datasourceManager);
       */

//        for (int i = 0; i < 10; i++) {
//            System.out.println(context.getBean(DBean.class));
//        }

//        context.getBean(PublisherService.class);
        context.close();
    }
}
