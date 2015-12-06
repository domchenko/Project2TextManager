/*
 * TextModifier
 *
 * Version 1
 */
package textmanager.modifiers;

import textmanager.structure.Text;

/**
 * Declares functions which allow to change the text 
 * 
 * @author Tanya Domchenko
 * @version 1, 27 Nov 2015
 */
public interface TextModifier {

    /**
     * Modifying <code>inputData</code> 
     * 
     * @param inputData
     * @return 
     */
    public Text processText( Text inputData );
}
