package uz.pdp.xml_based;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CBean {

    private DBean dBean;

    public void print(){
        System.out.println(CBean.class.getName() + " print() method called");
    }

    public void setdBean(DBean d) {
        this.dBean = d;
    }
}
