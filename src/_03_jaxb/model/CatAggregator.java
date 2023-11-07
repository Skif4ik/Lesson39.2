package _03_jaxb.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

import java.util.List;

@XmlRootElement(name = "cats")
@XmlAccessorType(XmlAccessType.FIELD)
@Data //гетер, сетер -  ломбок
public class CatAggregator {
    @XmlElement(name = "cat")
    private List<CatJaxb> cats;
}
