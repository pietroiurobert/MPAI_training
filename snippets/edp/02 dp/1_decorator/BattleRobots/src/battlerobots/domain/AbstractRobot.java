/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlerobots.domain;

import java.util.ArrayList;

/**
 *
 * @author null
 */
public abstract class AbstractRobot {

    protected ArrayList<String> components = new ArrayList<>();

    public abstract String fight();

    public abstract String printComponents();
}
