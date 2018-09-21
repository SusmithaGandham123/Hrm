package autoit;
import org.sikuli.script.Screen;
public class Sikuli {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Screen s=new Screen();
		//to open the application..........
		Runtime.getRuntime().exec("Calc.exe");
		
		s.click("D:/Mngo.sikuli/1536644133918.png");
		s.click("D:/Mngo.sikuli/1536644139629.png");
		s.click("D:/Mngo.sikuli/1536644151677.png");
	    s.click("D:/Mngo.sikuli/1536644240653.png");
	    s.click("D:/Mngo.sikuli/1536644162058.png");	
	    s.click("D:/Mngo.sikuli/1536644167472.png");
  }
}


