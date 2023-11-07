package _03_jaxb.utils;

import _03_jaxb.model.CatAggregator;
import _03_jaxb.model.CatJaxb;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class XmlCatUtils {
    private static final String INPUT_FILE = "src/_03_jaxb/resources/inputcats.xml";
    private static final String OUT_FILE = "src/_03_jaxb/resources/outcats.xml";

    public static List<CatJaxb> unmarshal() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(CatAggregator.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        CatAggregator catAggregator = (CatAggregator) unmarshaller.unmarshal(new FileReader(INPUT_FILE));
        return catAggregator.getCats();
    }

    public static void marshall(List<CatJaxb> cats) throws JAXBException, IOException {
        CatAggregator aggregator = new CatAggregator();
        aggregator.setCats(cats);
        JAXBContext context = JAXBContext.newInstance(CatAggregator.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(aggregator, new FileWriter(OUT_FILE));
    }

    public static void printCats(List<CatJaxb> cats){
        cats.forEach(System.out::println);
    }
}
