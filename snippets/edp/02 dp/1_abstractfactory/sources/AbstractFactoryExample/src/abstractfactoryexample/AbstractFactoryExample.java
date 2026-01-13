/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryexample;

import abstractfactoryexample.domain.AbstractStoryFactory;
import abstractfactoryexample.domain.NovelFactory;
import abstractfactoryexample.domain.ScreenplayFactory;
import abstractfactoryexample.domain.Story;
import abstractfactoryexample.domain.StoryBuilder;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author null
 */
public class AbstractFactoryExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StoryBuilder builder = new StoryBuilder();
        AbstractStoryFactory storyFactory = null;
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String");
        String input="";
        try {
            input = inputStream.readLine();
        } catch (IOException ex) {
            Logger.getLogger(AbstractFactoryExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (input.trim().contains("n")) {
            storyFactory = new NovelFactory();
        } else {
            storyFactory = new ScreenplayFactory();
        }
        builder.buildStory(storyFactory);
    }
}
