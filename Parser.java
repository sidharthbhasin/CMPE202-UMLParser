  import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import japa.parser.JavaParser;
import japa.parser.ParseException;
import japa.parser.ast.CompilationUnit;

public class Parser implements ParserInterface{

  public void parseCode(String code){
    
  }
  
  public boolean validateCode(String code){
  
  }
  
  public void divideCode(String code){
  
  }
  
  ArrayList<CompilationUnit> currentArray;
	String inputPath;
	
	String outputPath;
	ParserEngine(String inputPath, String outputPath){
		this.inputPath=inputPath;
		this.outputPath=inputPath + "\\" + outputPath + ".png";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void start() throws Exception {
		currentArray = readFileFromFolder(inputPath);
    System.out.println("Code Started");
    }
  
}
