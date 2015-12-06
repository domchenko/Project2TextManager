/*
 * BookLoader
 *
 * Version 1
 */
package textmanager.textprocessing;

/**
 * Provides pre-processing text data
 * 
 * @author Tanya Domchenko
 * @version 1, 27 Nov 2015
 */
public class BookLoader extends FileLoader {

    /**
     * Returns the text without an unnecessary whitespace
     * 
     * @return 
     */
    @Override
    public String getContent() {
        return content.replaceAll( "[\\s]+", " " );
    }
}
