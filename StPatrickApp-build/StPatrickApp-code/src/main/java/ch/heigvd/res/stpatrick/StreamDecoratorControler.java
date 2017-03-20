/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.stpatrick;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author lara
 */
public class StreamDecoratorControler implements IStreamDecoratorController {

    @Override
    public Reader decorateReader(Reader inputReader) {

        return inputReader;
    }

    @Override
    public Writer decorateWriter(Writer outputWriter) {

        return new decoratedWriter(outputWriter);
    }
}
