package _03_jaxb;

import _03_jaxb.model.CatJaxb;
import _03_jaxb.utils.XmlCatUtils;
import jakarta.xml.bind.JAXBException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static _03_jaxb.utils.XmlCatUtils.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<CatJaxb> cats = XmlCatUtils.unmarshal();

           printCats(cats);

           marshall(cats);

        } catch (JAXBException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
