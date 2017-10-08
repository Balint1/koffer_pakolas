package hu.lokter.mi;

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
        Koffer k = new Koffer(new ArrayList< Item>(),3,6);
        System.out.print(k);
    }

}
