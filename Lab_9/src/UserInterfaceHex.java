import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;





public class UserInterfaceHex extends UserInterface {
	 CheckboxGroup ch;
	 Checkbox dec;
	 Checkbox hex;
	 JPanel buttonPanel = new JPanel(new GridLayout(6, 6));
	 JButton a, b , c, d ,e ,f;

    public UserInterfaceHex(CalcEngineHex engine) {
    	super(engine);
    	
    }
    

    protected void makeFrame()
    {
        frame = new JFrame(calc.getTitle());

        JPanel contentPane = (JPanel)frame.getContentPane();
        contentPane.setLayout(new BorderLayout(8, 8));
        contentPane.setBorder(new EmptyBorder( 10, 10, 10, 10));

        display = new JTextField();
        contentPane.add(display, BorderLayout.NORTH);

       
        addButton(buttonPanel, "7");
        addButton(buttonPanel, "8");
        addButton(buttonPanel, "9");
        addButton(buttonPanel, "A");
        addButton(buttonPanel, "B");
        addButton(buttonPanel, "C");
        addButton(buttonPanel, "D");
        addButton(buttonPanel, "E");
        addButton(buttonPanel, "F");
        
        addButton(buttonPanel, "Clear");

        addButton(buttonPanel, "4");
        addButton(buttonPanel, "5");
        addButton(buttonPanel, "6");
        addButton(buttonPanel, "?");

        addButton(buttonPanel, "1");
        addButton(buttonPanel, "2");
        addButton(buttonPanel, "3");
        buttonPanel.add(new JLabel(" "));

        addButton(buttonPanel, "0");
        addButton(buttonPanel, "+");
        addButton(buttonPanel, "-");
        addButton(buttonPanel, "*");
        addButton(buttonPanel, "/");
        addButton(buttonPanel, "=");
        
        //Dec / Hex Checkbox
        ch = new CheckboxGroup();
        JPanel buttonPanel2 = new JPanel(new GridLayout(4, 4));
        

        dec = new Checkbox("dec",ch,false);
        hex = new Checkbox("hex",ch,true);
        buttonPanel.add(dec);
        buttonPanel.add(hex);
        
      
        

        contentPane.add(buttonPanel, BorderLayout.CENTER);

        status = new JLabel(calc.getAuthor());
        contentPane.add(status, BorderLayout.SOUTH);

        frame.pack();
        
        
    }
    

    public void actionPerformed(ActionEvent event)
    {
        String command = event.getActionCommand();

        if(command.equals("0") ||
                command.equals("1") ||
                command.equals("2") ||
                command.equals("3") ||
                command.equals("4") ||
                command.equals("5") ||
                command.equals("6") ||
                command.equals("7") ||
                command.equals("8") ||
                command.equals("9")) {
            int number = Integer.parseInt(command);
            calc.numberPressed(number);
        }
        
        else if (command.equals("A")||
                command.equals("B")||
                command.equals("C")||
                command.equals("D")||
                command.equals("E")||
                command.equals("F")){

        	int decimal = Integer.parseInt(command, 16);
        	calc.numberPressed(decimal);
        	
        }
        
        
        
        else if(command.equals("+")) {
            calc.plus();
          
        }
        else if(command.equals("-")) {
            calc.minus();
            
        }
        else if(command.equals("*")) {
            calc.multiply();
            
        }
        else if(command.equals("/")) {
            calc.devide();
            
        }
        else if(command.equals("=")) {
            calc.equals();
            
        }
        else if(command.equals("Clear")) {
            calc.clear();
            
        }
        else if(command.equals("?")) {
            showInfo();
            
        }
        
//        System.out.println(dec.getState());
    	
        if(dec.getState() == true) {
        	
        	super.redisplay();
        	System.out.println("Flag1");
        	
        }
        
		else  {
		        	
		     this.redisplay();	
		        	  	
		}
        // else unknown command.

//        redisplay();
    }

    protected void redisplay()
    {
    	int x = calc.getDisplayValue();
    	String hexResult = Integer.toHexString(x);
    	
        //display.setText("" + calc.getDisplayValue());
    	display.setText("" + hexResult);
    	
    }

}
