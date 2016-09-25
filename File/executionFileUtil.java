package File.util;

public class executionFileUtil {
	public static void main(String[] args) {
		
		FileManagement fm = new FileManagement();
		fm.CreateDirectory("c:/JavaClass/files");
		fm.CreateFile("c:/JavaClass/files", "test1.txt");
		fm.CreateFile("c:/JavaClass/files", "test2.docx");
		fm.CreateFile("c:/JavaClass/files", "test1.mp3");
		fm.CreateFile("c:/JavaClass/files", "test1.jpg");
		
		TxtManagement tm = new TxtManagement();
		System.out.println(tm.StoreText("We are creating a txt file!"));
		System.out.println("Datas of File: "+tm.getText("C:/workspace/JavaClass/files/test1.txt"));
		
	}
}
