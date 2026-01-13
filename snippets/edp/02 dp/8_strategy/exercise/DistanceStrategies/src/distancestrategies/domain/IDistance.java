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
public interface IDistance{
    double distance(List<Object> first, List<Object> second) throws DistanceException;
}
