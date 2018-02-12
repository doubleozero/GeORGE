import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuBar {
	
	public JMenuBar createMenu() {
		JMenuBar menuBar = new JMenuBar(); // Create the menu bar
		
		JMenu fileMenu = new JMenu("File"); // Build the first menu
		JMenuItem fileExit = new JMenuItem("Exit");
		fileMenu.add(fileExit); // This add the item "Exit" (above) to the "File" menu
		
		menuBar.add(fileMenu);
		
		return menuBar;
	}
}