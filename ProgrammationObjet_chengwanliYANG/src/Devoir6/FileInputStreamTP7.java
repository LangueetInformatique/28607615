package Devoir6;
import java.io.*;
import java.util.zip.DeflaterOutputStream;
import java.util.Properties;

public class FileInputStreamTP7 {
	//l'excercice 1
	public static void Copie(String source,String destination) {
		try {
		FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos =  new FileOutputStream(destination);
		
		byte[] b = new byte[(int)source.length()];
		fis.read(b);
		fos.write(b);
	
		fis.close();
		fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//l'excercice 2
	public static void Compresse(String source_compresse, String des_compresse) {
		try {
			String rep1 = "src/Devoir6/";
			File fin = new File(rep1 + source_compresse);
			FileInputStream fis = new FileInputStream(fin);
			File fout = new File(rep1 + des_compresse);
			FileOutputStream fos = new FileOutputStream(fout);
			DeflaterOutputStream dos = new DeflaterOutputStream(fos);
			long taille = fin.length();
			byte mem[] = new byte[(int) taille];
			fis.read(mem);
			dos.write(mem);

			fis.close();
			dos.close();
		}

		catch (EOFException e) {
			System.out.println("Fin de lecture de fichier");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//l'excercice 3
	
	/* public void Proprietes() {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("prop.properties");
        prop.load(fis);
        fis.close(); 
    }*/
}