/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.stpatrick;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author lara
 */
public class decoratedWriter extends FilterWriter {
    
    public decoratedWriter(Writer out) {
        
        super(out);      
    }
    
    @Override
    public void write(String str, int off, int len) throws IOException {

        for(int i = off; i < off+ len; i++){
            
            if(str.charAt(i) != 'A' && str.charAt(i) != 'a') {
                
                out.write(str.charAt(i));
            }
        }
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {

        char[] upperCbuf = new char[cbuf.length];

        for (int i = off; i < off + len; i++) {

            if(upperCbuf[i] != 'A' && upperCbuf[i] != 'a') {
                
                out.write(upperCbuf[i]);
            }
        }
    }
    
    @Override
    public void write(int c) throws IOException {

        if(c != 'A' && c!='A') {
             
            out.write(c); 
        }
    }
}
