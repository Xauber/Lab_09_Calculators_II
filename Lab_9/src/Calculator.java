/**
 * The main class of a simple calculator. Create one of these and you'll
 * get the calculator on screen.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class Calculator
{
    private CalcEngineHex engine;
    private UserInterfaceHex gui;

    /**
     * Create a new calculator and show it.
     */
//    public Calculator()
//    {
//        engine = new CalcEngineHex();
//        gui = new UserInterfaceHex(engine);
//    }
//
//    /**
//     * In case the window was closed, show it again.
//     */
//    public void show()
//    {
//        gui.setVisible(true);
//    }
    
    public static void main(String[] args) {
//		CalcEngine calcEngine = new CalcEngine();
//		UserInterface userInterface = new UserInterface(calcEngine);
//		
//		userInterface.setVisible(true);
    	CalcEngineHex engine = new CalcEngineHex();
    	UserInterfaceHex gui = new UserInterfaceHex(engine);
         gui.setVisible(true);
//		Calculator calculator = new Calculator();
		
		
	}
}
