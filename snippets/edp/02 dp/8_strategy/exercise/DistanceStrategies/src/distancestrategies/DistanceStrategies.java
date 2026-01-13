/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package distancestrategies;

import distancestrategies.domain.DistanceException;
import distancestrategies.domain.IDistance;
import distancestrategies.domain.MagicalAlgorithm;
import distancestrategies.domain.NonNumericalDistance;
import distancestrategies.domain.NumericalDistance;
import distancestrategies.domain.StrategyException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author null
 */
public class DistanceStrategies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DistanceException, StrategyException {
        MagicalAlgorithm a = new MagicalAlgorithm();
        List<Double> c1 = new ArrayList<>();
        c1.add(3.0);
        c1.add(3.0);
        c1.add(3.0);
        List<Double> c2 = new ArrayList<>();
        c2.add(4.0);
        c2.add(5.0);
        c2.add(3.0);
        IDistance num = new NumericalDistance();
        a.setFirst(c1);
        a.setSecond(c2);
        a.setDistance(num);
        a.applyMagicalAlgorithm();

        IDistance cat = new NonNumericalDistance();
        a.setDistance(cat);
        a.applyMagicalAlgorithm();
    }
    
}
