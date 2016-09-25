package File.util;

import java.io.File;

public class FileManagement {
	
	public File file;
	
	public void CreateDirectory(String directory){
		file = new File(directory);
		if (file.mkdirs()){
			System.out.println("Directory has created.");	
		}else{
			System.out.println("Problem to create Directory.");
		}
	}
	
	public void CreateFile(String way, String file1){
		file = new File(way,file1);
		try{
			if(!file.exists()){
				file.createNewFile();
				System.out.println("File has created.");
			}else{
				System.out.println("File has already created.");
			}
		}catch(Exception e){
			System.out.println("Problem to create file: "+e.getMessage());
		}
	}
	
}
