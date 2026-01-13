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
public class NonNumericalDistance implements IDistance{

    @Override
    public double distance(List first, List second) throws DistanceException {
       if (first.size() != second.size()){
            throw new DistanceException();
        }
       double distance = 0;
        for (int i = 0; i < second.size(); i++) {
            if(!second.get(i).equals(first.get(i))){
                distance+=1;
            }
        }
       return distance;
    }
    
}
