/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.wilsoncys.compi1.sql_em.l.satt;

import com.wilsoncys.compi1.javacraft.model.analisis.Node;
import com.wilsoncys.compi1.javacraft.model.analisis.parser;
import com.wilsoncys.compi1.javacraft.model.analisis.scanner;
import java.io.BufferedReader;
import java.io.StringReader;


/**
 *
 * @author Jonwil
// */
public class LSAtt {

    public static void main(String[] args) {
        
        try {
            String prueba = "101010, 1101";
            parser parser = new parser(new scanner(new BufferedReader(new StringReader(prueba))));
            var valor = parser.parse();
//            Node nodito = (Node)valor.value;
//            System.out.println("Resultado(bool): " + nodito.isAscen());
//            System.out.println("Resultado(valorUlti): " + nodito.getValor());
            
            
            
            System.out.println("succes");
            
            
        } catch (Exception e) {
//            System.out.println("Errr");
            e.printStackTrace();
            
        }
        
        
    }
}
