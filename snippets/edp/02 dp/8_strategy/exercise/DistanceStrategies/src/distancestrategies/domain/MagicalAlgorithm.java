/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancestrategies.domain;

import java.util.List;

/**
 *
 * @author null
 */
public class MagicalAlgorithm {

    private IDistance distance;
    private List first;
    private List second;

    public MagicalAlgorithm() {
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(IDistance distance) {
        this.distance = distance;
    }

    public void applyMagicalAlgorithm() throws DistanceException, StrategyException {
        if (distance != null) {
            double d = distance.distance(first, second);
            System.out.println("distane : " + d);
        }
        else{
            throw new StrategyException();
        }
    }

    /**
     * @param first the first to set
     */
    public void setFirst(List first) {
        this.first = first;
    }

    /**
     * @param second the second to set
     */
    public void setSecond(List second) {
        this.second = second;
    }
}
