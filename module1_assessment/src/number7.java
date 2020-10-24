
import java.io.File;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class number7 {
    public static void main(String args[]){
        String folderPath = "C:\\Users\\hp\\Desktop\\lily";
        File folder = new File(folderPath);
        
        File[] files = folder.listFiles();
        
        for(File file:files){
            if(file.isFile()){
                System.out.println("File -> "+file.getName());
            }else
                if(file.isDirectory()){
                    System.out.println("Folder -> "+file.getName());
                    
                }
        }
    }
       
        
    
}
