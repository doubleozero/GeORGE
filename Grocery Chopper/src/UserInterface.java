import java.awt.FlowLayout;  // awt = Abstract Windowing Toolkit
import javax.swing.JFrame;
import javax.swing.JButton;
//import javax.swing.*;  << may be better to just import all classes from the javax.swing package

@SuppressWarnings("serial") // Warning will occur without this. Book says to suppress warning. Research further? 
public class UserInterface extends JFrame {    // "extends" means I am adding functionality not already present in JFrame, without altering JFrame directly

		public UserInterface() {                      // constructor declaration. This will call various methods from the Java API.
			setTitle("GeORGE");
			setLayout(new FlowLayout());	//setLayout() puts the new FlowLayout object in charge of arranging components on the frame
											//FlowLayout() positions objects on the frame centered near the top
			setDefaultCloseOperation(EXIT_ON_CLOSE); // Refers to the "X" button
			add(new JButton("CLICK TO TEST"));       //Sets the button label. Button does not yet actually do anything. "add" places button on object's surface.
			setSize(300, 100);             // 300 x 100 pixels (wide x tall)
			setVisible(true);
		}
}
