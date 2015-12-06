/*
 * Word
 *
 * Version 1
 */
package textmanager.structure;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Provides the words - the parts of the sentences
 * 
 * @author Tanya Domchenko
 * @version 1, 27 Nov 2015
 */
public class Word extends LanguageUnit {
 
    /**
     * Class constructor specifying text value
     * 
     * @param value 
     */
    public Word( String value ) {
        this.value = value;
        isSeparator = false;
    }
    
    /**
     * Returns length of this word
     * 
     * @return 
     */
    public int length() {
        return value.length();
    }
    
    /**
     * Counts vowel letters in this word (supports UA, RU and EN languages)
     * 
     * @return 
     */
    public int getVowelCount() {
        int count = 0;
        Matcher matcher = Pattern.compile( 
            "[euioaEUIOAуеыіаоэияюєУЕЫІАОЭИЯЮЄ]" ).matcher( value );
        while ( matcher.find() ) {
            count++;
        }
        return count;
    }
}
