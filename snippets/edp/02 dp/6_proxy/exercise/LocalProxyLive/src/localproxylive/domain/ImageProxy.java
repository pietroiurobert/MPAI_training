/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localproxylive.domain;

/**
 *
 * @author null
 */
public class ImageProxy implements ImageInterface{

    private Image realImage = null;
    private String fileName;
    
    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void showImage() {
        if (realImage == null){
            realImage = new Image(fileName);
        }
        realImage.showImage();
    }
    
}
