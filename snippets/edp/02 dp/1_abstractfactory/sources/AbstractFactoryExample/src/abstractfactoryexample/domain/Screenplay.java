/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryexample.domain;

/**
 *
 * @author null
 */
public class Screenplay implements Story{

    private String title;
    private String content;

    public Screenplay(String title, String content) {
        this.title = title;
        this.content = content;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String read() {
         return "Screenplay: " + title + " " + content;
    }
}
