/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removevirus;

import java.io.IOException;
import javax.swing.JTextArea;

/**
 *
 * @author SECINFOR
 */
public class Cmd {
    
    Runtime r = Runtime.getRuntime();
    
    public void runAttrib(String str) throws IOException{
        String attrib = "attrib -r -s -h /s /d";
        r.exec(attrib+" "+str);
    }
    
}
