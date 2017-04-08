
public class MainClass {

	public static void main(String args[]){
    
    // we have to enter a code input here.
    // Let that input be from a '.java' file.
    //Then we first have to read the content of that file and then have put that in a variable.
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
    } finally {
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
