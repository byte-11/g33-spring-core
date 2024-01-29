package uz.pdp.xml_based;

public class DBean {
    public void print(){
        System.out.println(DBean.class.getName() + " print() method called");
    }

    public void init(){
        System.out.println(DBean.class.getName() + " init() method called");
    }

    public void destroy(){
        System.out.println(DBean.class.getName() + " destroy() method called");
    }
}
