/*
 * SortingWordsByVowels
 *
 * Version 1
 */
package textmanager.modifiers;

import textmanager.structure.Sentence;
import textmanager.structure.Text;
import textmanager.structure.LanguageUnit;
import textmanager.structure.Word;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting words by the proportions of the vowels
 * 
 * @author Tanya Domchenko
 * @version 1, 27 Nov 2015
 */
public class SortingWordsByVowels implements TextModifier {

    /**
     * Comparator for sorting words by the proportion of the vowel letters to their length
     */
    static class VowelComparator implements Comparator<Word> {

        @Override
        public int compare(Word o1, Word o2) {
            float frac1 = (float) o1.getVowelCount() / o1.length();
            float frac2 = (float) o2.getVowelCount() / o2.length();
            if ( frac1 < frac2 ) {
                return -1;
            }
            else {
                if ( Math.abs( frac1 - frac2 ) < 0.0001 ) {
                    return 0;
                }
                else {
                    return 1;
                }
            }
        }        
    }
    
    /**
     * Sorts words in the text <code>inputData</code> by the vowel letters proportion
     * 
     * @param inputData text
     * @return          sorted words 
     */
    @Override
    public Text processText(Text inputData) {
        Text t = new Text();
        
        Comparator<Word> comparator = new VowelComparator();
        List<Word> w = inputData.getWords();
        w.sort( comparator );
        
        for ( LanguageUnit p: w ) {
            t.addString( p.getValue() + "\n" );
            t.addSentence( new Sentence() );
        }
        return t;
    }

}
