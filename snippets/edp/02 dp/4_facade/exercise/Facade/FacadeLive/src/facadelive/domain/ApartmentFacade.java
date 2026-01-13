/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadelive.domain;

import facadelive.domain.apartment.GasValve;
import facadelive.domain.apartment.WaterFaucet;
import facadelive.domain.apartment.Window;

/**
 *
 * @author null
 */
public class ApartmentFacade {
    private Window window;
    private WaterFaucet waterFaucet;
    private  GasValve gasValve;

    public ApartmentFacade(Window window, WaterFaucet waterFaucet, GasValve gasValve) {
        this.window = window;
        this.waterFaucet = waterFaucet;
        this.gasValve = gasValve;
    }
    
    public void closeApartment(){
        this.window.close();
        this.waterFaucet.close();
        this.gasValve.close();
    }
    
    public void openApartment(){
        this.window.open();
        this.waterFaucet.open();
        this.gasValve.open();
    }
    
}
