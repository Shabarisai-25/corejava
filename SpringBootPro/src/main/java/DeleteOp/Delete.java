package DeleteOp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
@Controller
public class Delete {
	
	@Value("${dir}")
	private static String dir;
	
	public static void main(String[] args) throws IOException
    {
		
		
//		 String director= System.getProperty("dir");
//		 System.out.println(director);
		String [] array=dir.split(",");
		for(int i =0;i < array.length;i++) {
			String file_loc=array[i];
			System.out.println(file_loc);
			try {
	            Files.deleteIfExists(
	                Paths.get(file_loc));
	            System.out.println("deleted");
			}catch (NoSuchFileException e) {
	            System.out.println("No such file/directory exists");
	        }
		}
		
		
		
		
//		String dir="/home/shabariraj/1/";
//        	//System.out.println("hello");
//        	File folder = new File("/home/shabariraj/1");
//        	File[] listOfFiles = folder.listFiles();
//
//        	for (int i = 0; i < listOfFiles.length; i++) {
//        	  if (listOfFiles[i].isFile()) {
//        		  String file_loc=listOfFiles[i]+"/";
//        		  System.out.println(file_loc);
//        		//  Files.deleteIfExists(Paths.get("/home/shabariraj/1/"+listOfFiles));
//        		  try {
//      	            Files.deleteIfExists(
//      	                Paths.get(file_loc));
//      	            System.out.println("deleted");
//      	        }
//            		 catch (NoSuchFileException e) {
//       	            System.out.println("No such file/directory exists");
//       	        }
//        		  
//        		  System.out.println("File " + listOfFiles[i].getName());
//        		  break;
//        	    
//        	  } else if (listOfFiles[i].isDirectory()) {
//        	    System.out.println("Directory " + listOfFiles[i].getName());
//        	  }
//        	  
//
//        	}
//
////          Files.deleteIfExists(Paths.get("/home/shabariraj/1"));{
////        	 " File folder = new File("/home/shabariraj/1")" + "System.out.println("File " + listOfFiles[i].getName())"
////        	  
////          }
        
    }
}


