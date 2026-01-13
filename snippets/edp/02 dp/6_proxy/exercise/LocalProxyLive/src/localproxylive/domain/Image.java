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
public class Image implements ImageInterface{

    private String fileName;

    public Image(String fileName) {
        this.fileName = fileName;
        loadImageFromFile(fileName);
    }
    
    
    @Override
    public void showImage() {
        System.out.println("Showing image : " + fileName);
    }

    private void loadImageFromFile(String fileName) {
        System.out.println("Loading image : " + fileName);
    }
    
}
