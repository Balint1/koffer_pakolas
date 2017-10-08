package algorithm;

import model.Koffer;

/**
 * Created by Balint on 2017. 10. 08..
 */
public abstract class KofferAlgorithm {
    private Koffer koffer;
    KofferAlgorithm(Koffer koffer){this.koffer = koffer;}
    public int order(){return 0;}
    public final void print()
    {
        System.out.print(koffer);
    }
}
