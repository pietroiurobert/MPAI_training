/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadelive;

import facadelive.domain.ApartmentFacade;
import facadelive.domain.apartment.GasValve;
import facadelive.domain.apartment.WaterFaucet;
import facadelive.domain.apartment.Window;

/**
 *
 * @author null
 */
public class FacadeLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApartmentFacade apartment = new ApartmentFacade(new Window(), new WaterFaucet(), new GasValve());
        apartment.openApartment();
        apartment.closeApartment();
        
    }
    
}
