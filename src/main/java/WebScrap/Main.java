/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebScrap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;




/**
 *
 * @author anggi
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader  reader = null;
        String line="";
        try{
            reader = new BufferedReader(new FileReader("C:\\Users\\anggi\\OneDrive\\Documents\\NetBeansProjects\\WebScrap\\product.csv"));
            while ((line = reader.readLine())!= null){
                String[] row = line.split(",");
                for(String index : row){
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                reader.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
