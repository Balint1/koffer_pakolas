package hu.lokter.mi;

import algorithm.StairsAlg;
import model.Item;
import model.Koffer;

import java.util.ArrayList;

/**
 * Created by Balint on 2017. 10. 08..
 */
public class App {
    private Koffer koffer;
    private DataScanner dataScanner;

    public void start() {
        //TODO startApp
        dataScanner = new DataScanner();
        dataScanner.scanData();
        koffer = dataScanner.getKoffer();
       // System.out.print(koffer.enoughSpace(koffer.getItems().get(0),0,0));
        //koffer.putItemToMatrix(koffer.getItems().get(0),0,0);
        StairsAlg alg = new StairsAlg(koffer);
        alg.order();

        System.out.print(koffer);
    }

}
