package ClassPackages;
import java.io.*;
    
public class FileManagement {
    
    private static final String File_Path = "D:\\HR Management Software\\";
    
    File File;
    private final String fileName;
    
    public FileManagement(String fileName) {
        this.fileName = fileName;
        
        createANewFile();
    }
    
    public boolean createANewFile(){
     try{
         File = new File(File_Path + fileName);
         if (File.createNewFile())
             {
             System.out.println("File Created:" + File.getName());
             return true;
            }
         else
              {
             System.out.println("File Already Exists!");
             return false;
               }
        }
    catch(IOException ex) {
    System.out.println("File Creating Failed" + ex);
            return false;
                        }
    }
     
     
     public boolean writeDataToFile(String record) {
         try{
             File.createNewFile();
             FileWriter fileWriter = new FileWriter(File,true);
             BufferedWriter bufferedWriter = new BufferedWriter (fileWriter);
             bufferedWriter.write(record);
             bufferedWriter.newLine();
             bufferedWriter.close();
             bufferedWriter.close();
             
             return true;
         }catch (IOException e) {
             System.out.println("Writing Failed!!" + e);
             return false;
         }
     } 
         public BufferedReader readAFile() {
             if(!createANewFile())
             {
                 try{
                     FileReader fileReader = new FileReader(File);
                     BufferedReader bufferedReader= new BufferedReader (fileReader);
                     
                     return bufferedReader;
                 }
                 catch (IOException ex)
                 {
                     System.out.println("Reading Failed!!" + ex);
                 }
             }
             return null;
                 
             
         }
     }
     
