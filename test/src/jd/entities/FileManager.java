package jd.entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager extends IOException {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8098057964019925149L;
	
	private static final String FILENAME = "aquarium.txt";
	
	private static final String charset = "UTF-8";
	

	
	
	File fileManager = new File(FILENAME);
	
	BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));
	
	FileWriter writer; 
	
	public FileManager (File fileManager, BufferedReader keyboardReader, FileWriter writer) {
		super();
		this.fileManager = fileManager;
		this.keyboardReader = keyboardReader;
		this.writer = writer;
	}


	public FileManager() throws IOException {
		
	}
	
	
	public void createRecord(Aquarium aquarium) throws IOException {
		File fileManager = new File(FILENAME);
		BufferedReader fileReader = new BufferedReader(new FileReader(FILENAME));
//		FileReader fileReader = new FileReader(FILENAME);
		String lineReader = fileReader.readLine();
		FileWriter writer = new FileWriter(FILENAME, true);
		/* PrintWriter writer = new PrintWriter(FILENAME, "UTF-8"); */
//		while ((lineReader)!=null) {
			lineReader = fileReader.readLine();
//		}
		writer.write(aquarium.getNameRecord());
		writer.write("Date de la dernière maintenance:");
		writer.write(aquarium.toString());
		writer.close();
		fileReader.close();
	}
	
	public void updateRecord(Aquarium aquarium) throws IOException {
		File fileManager = new File(FILENAME);
		BufferedReader fileReader = new BufferedReader(new FileReader(FILENAME));
		FileWriter updater = new FileWriter(FILENAME, false);
		String lineReader= fileReader.readLine();
		try {
			
			lineReader = fileReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		while ((lineReader)!=null && (lineReader)!=aquarium.getNameRecord()) {
			lineReader = fileReader.readLine();
		}
		for (int i=0; i<=3; i++) {
			writer.write(aquarium.getNameRecord());
			writer.write("Date de la dernière maintenance:");
			writer.write(aquarium.toString());	    
	}
		fileReader.close();
		updater.close();
	}
	
	public void readAllRecords() throws IOException {
		File fileManager = new File(FILENAME);
		BufferedReader fileReader = new BufferedReader(new FileReader(FILENAME));
		String lineReader = fileReader.readLine();
		while ((lineReader)!=null) {
			System.out.println(lineReader);
			lineReader = fileReader.readLine();
		}
		fileReader.close();
	}
		
	public void readRecord(String nameRecord) throws IOException {
		BufferedReader fileReader = new BufferedReader(new FileReader(FILENAME));
		String lineReader = fileReader.readLine();
		while ((lineReader)!=null && (lineReader)!=nameRecord) {
			lineReader = fileReader.readLine();
		}
		System.out.println("Contenu de l'enregistrement:");
		System.out.println();
		for (int i=0; i<=3; i++) {
			System.out.println(lineReader);
			lineReader = fileReader.readLine();
		}
		fileReader.close();
	}
	
	public void deleteAllRecordsFromFile() throws IOException {
		FileOutputStream fos = new FileOutputStream( FILENAME );
	}
	
	public void copyAllRecordsIntoNewFile() throws IOException {
		System.out.println("Saisir le nom du nouveau fichier (sans l'extension).");
		System.out.println("Ce fichier sera copié sur votre bureau");
		String FILENAMECOPY = keyboardReader.readLine()+".txt";
		File file = new File(FILENAMECOPY);
		BufferedReader fileReader = new BufferedReader(new FileReader(FILENAME)); 
//		FileReader fileReader = new FileReader(FILENAME);
		BufferedWriter fileWriter = new BufferedWriter(new FileWriter(FILENAMECOPY, true));
		String lineReader ="0";
		while ((lineReader = fileReader.readLine())!=null) {
			System.out.println(lineReader);
			fileWriter.write(lineReader);
		}
		fileReader.close();
		fileWriter.close();
//		Logger.info(">>>   Copie des datas sur le fichier : "+FILENAMECOPY+" terminée.");
		System.out.println("Copie des datas sur le fichier : "+ FILENAMECOPY+" terminée.");
	}
}
		
	
		
	
 
	
	
	

