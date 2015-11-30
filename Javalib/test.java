import java.util.*;
import java.lang.*;
import java.io.*;

/*
instead of printing on console, save it into a file OUTPUT.java
*/
class test{
	public static void main(String[] args) throws IOException{
		File file = new File("input-flowme.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String line = null;
		
		while( (line = br.readLine())!= null ){
			String [] tokens = line.split("\\s+");
			for(int i=0; i<tokens.length; i++){
				if(tokens[i].equals("START")){
					System.out.println("import java.util.*;\nimport java.lang.*;\nimport java.io.*;");
					System.out.println("class Output {\npublic static void main(String[] args){");				
				}
				else if(tokens[i].equals("NUM")){System.out.print("float");}
				else if(tokens[i].equals("IF")){System.out.print("if");}
				else if(tokens[i].equals("ELSE")){System.out.print("else");}
				else if(tokens[i].equals("OUTPUT")){System.out.print("System.out.println("+ tokens[i+1]+")"); i++;}
				else if(tokens[i].equals("STOP")){System.out.print("return;");}
				else {System.out.print(tokens[i]);}
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("}\n}");
	}
}