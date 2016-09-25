package File.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TxtManagement {
	
	public String StoreText(String text){
		String msg;
		try{
			OutputStream out = new FileOutputStream("C:/workspace/JavaClass/files/test1.txt", true);
			OutputStreamWriter writer = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write(text+"\n");
			bw.flush();
			bw.close();
			out.close();
			msg = "Datas stored";
		}catch(Exception e){
			msg = "Erro: "+e.getMessage();
		}
		return msg;
	}
	
	public String getText(String file){
		try{
			InputStream in = new FileInputStream(file);
			InputStreamReader reader = new InputStreamReader(in);
			BufferedReader    br     = new BufferedReader(reader);
			StringBuilder     sb     = new StringBuilder();
			String txt = "";
			while((txt = br.readLine())!=null){
				sb.append(txt+"\n");
			}
			return sb.toString();
		}catch(Exception e){
			return "Erro: "+e.getMessage();
		}
	}
	
}
