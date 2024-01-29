package uz.pdp.xml_based;

import lombok.Getter;

@Getter
public class ABean {

    private final BBean bBean;

    private final CBean cBean;

    public ABean(BBean b, CBean c) {
        this.bBean = b;
        this.cBean = c;
    }

    public void print(){
        System.out.println(ABean.class.getName() + " print() method called");
    }
}
