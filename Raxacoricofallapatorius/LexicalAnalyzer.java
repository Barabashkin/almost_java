import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class LexicalAnalyzer {
	public int curLine = 1;
	public int curChar = 1;
	ArrayList<Token> tokens = new ArrayList<Token>();
	String code = null;
	public LexicalAnalyzer(String code){
		this.code = code;
	}
	public void parse(){
		BufferedReader bf;
		try {
			//if file is in directory - use file. This is an pre-pre-pre-pre ... -pre alpha moment, that will be replaced by some serious stuff, like cyborgs, or sharks with AK-47's or a dino with a rocket launcher
			if((new File(code).exists())){
				bf = new BufferedReader(new FileReader(code));
				code = "";
				String string;
				while((string=bf.readLine())!=null){
					code+=string;
					}
				}
			bf = new BufferedReader(new StringReader(code));
			String buf;							//wierdo buffer. Cosmic power told me that I need it
			char ch;
			while(bf.ready()){
				curChar++;
				ch =(char) bf.read();
				switch(ch){
					//make it ...
					case 'a':
			        case 'b':
			        case 'c':
			        case 'd':
			        case 'e':
			        case 'f':
			        case 'g':
			        case 'h':
			        case 'i':
			        case 'j':
			        case 'k':
			        case 'l':
			    	case 'm':
			    	case 'n':
			    	case 'o':
			     	case 'p':
			     	case 'q':
			     	case 'r':
			     	case 's':
			     	case 't':
			     	case 'u':
			     	case 'v':
			     	case 'w':
			     	case 'x':
			     	case 'y':
			     	case 'z':
			     	//... fully
			     	case '\n':{
			     		curLine++;
			     		curChar = 0;
			     		break;
			     	}
			     	case ' ':{
			
			     		break;
			            }
					}
				}
			
			bf.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.printf("Problem at %d,%d",curLine,curChar);
		}
	}
	public static void main(String[] args) {
		
	}
}
