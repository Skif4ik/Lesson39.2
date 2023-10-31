package _01_training;

import _01_training.model.CatModel;
import _01_training.utils.CatUtils;

import java.util.List;

import static _01_training.utils.CatUtils.*;

public class Main {
    public static void main(String[] args) {
        List<CatModel> catModels = extractFromFile();
        printCats(catModels);
    }
}
