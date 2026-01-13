/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localproxylive;

import localproxylive.domain.ImageInterface;
import localproxylive.domain.ImageProxy;

/**
 *
 * @author null
 */
public class LocalProxyLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImageInterface image1 = new ImageProxy("someimage");
        image1.showImage();
    }
    
}
