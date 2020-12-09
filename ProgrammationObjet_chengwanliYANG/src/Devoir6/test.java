package Devoir6;
import java.io.*;
import java.util.zip.DeflaterOutputStream;

public class test {

	public static void main(String[] args) throws IOException  {
		
		
		FileInputStreamTP7.Copie("livres/madame bovary.txt", "src/devoir6/madame bovary.txt");
		FileInputStreamTP7.Compresse("avare.txt", "avare.zip");		
		
}



}
