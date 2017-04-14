public class MainClass {
  public static void main(String args[]){
    
    StringBuilder sb = new StringBuilder();

    BufferedReader br = new BufferedReader(new FileReader("file.txt"));
    try {
        String line = br.readLine();
        String code = "";
        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }
        code = sb.toString();
    } catch(Exception e){
    	System.out.println("EXCEPTION");
    }finally {
        br.close();
    }
    generator(everything);    
  }
  
  public void generator(String code){
    if(code == null || code.length() == 0){
	System.out.println("Please enter valid code.");
	System.exit(0);
    }
    try {
	Parser parser = new Parser();
        parser.validateCode(code);
    } catch (Exception e) {
	System.out.println("Exception: ");
	e.printStackTrace();
    }
  }
}
