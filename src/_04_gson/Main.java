package _04_gson;

import _01_training.model.CatModel;
import _03_jaxb.model.CatJaxb;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Main {
    private static final Gson gson = new Gson();
    private static final Type TYPE = new TypeToken<List<CatModel>>() {
    }.getType();
    private static final String OUT_FILE = "src/_03_jaxb/resources/output.json";

    public static void main(String[] args) throws IOException {
//        List<CatModel> cats = List.of(
//                new CatModel(1, "Vaska", 2),
//                new CatModel(2, "Murzik", 1),
//                new CatModel(3, "Mashka", 3),
//                new CatModel(4, "Murka", 1)
//        );
//
//        String listAsString = gson.toJson(cats);
//        OutputStream os = new FileOutputStream(OUT_FILE);
//        os.write(listAsString.getBytes(StandardCharsets.UTF_8));
//    }



            try {
                List<CatModel> fromFile = gson.fromJson(new FileReader(OUT_FILE), TYPE);
                fromFile.forEach(System.out::println);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    }
