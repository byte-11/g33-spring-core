package uz.pdp.xml_based;

public class BBean {

    private BBean() {
    }

    public static BBean getInstance() {
        System.out.println(BBean.class.getName() + " getInstance()");
        return new BBean();
    }
    public void print(){
        System.out.println(BBean.class.getName() + " print() method called");
    }
}
