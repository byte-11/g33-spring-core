package uz.pdp.xml_based;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:/ioc-settings.xml");
        /*ABean aBean = context.getBean(ABean.class);
        aBean.print();
        aBean.getBBean().print();
        aBean.getCBean().print();
        aBean.getCBean().getDBean().print();*/
        DatasourceManager datasourceManager = context.getBean(DatasourceManager.class);
        System.out.println(datasourceManager);
        context.close();
    }
}
