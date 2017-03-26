

public class Application{
  
  public static void main(String args[]){
    
    Parser parser = new Parser();
    // we have to enter a code input here.
    // Let that input be from a '.java' file.
    //Then we first have to read the content of that file and then have put that in a variable.
    StringBuilder sb = new StringBuilder();

    BufferedReader br = new BufferedReader(new FileReader("file.txt"));
    try {
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }
        String everything = sb.toString();
    } finally {
        br.close();
    }
    // sb has the file code now.
    
  }
}
