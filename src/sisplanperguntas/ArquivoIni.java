/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisplanperguntas;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.applet.Main;

/**
 *
 * @author Suporte
 */
public class ArquivoIni {
     private static Properties config = new Properties();
   private static String arquivo = "ApplicationFire.ini";
public static void main(String[] args) {
   try {
        config.load(new FileInputStream(arquivo));
        System.out.println("Iniciando processo de leitura de configurações: ");
        System.out.println();
        System.out.println(config.getProperty("Relatorios"));
        System.out.println();
        System.out.println("Finalizando leitura!");
   } catch (IOException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      }
}
}
