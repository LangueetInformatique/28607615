package atelier12;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class testJTextComponent {


	private static final String Style = null;

	public static void main(String[] args) {
		// Declaration de la JFrame
		 JFrame fen = new JFrame("testJTextField"); fen.setSize(280, 280); 
		 JPanel p = new JPanel();
		 fen.getContentPane().add(p);
		 JTextField jtf = new JTextField("chengwanli");
		 p.add(jtf);
		 
		 
		 
		 
		 
		 Style s = ((StyledDocument) jtf).addStyle("st1" , null); 
		 StyleConstants.setForeground(s, Color.blue); 
		 StyleConstants.setFontSize(s, 22); 
		 StyleConstants.setBold(s, true);
		 //setItalic(Style s, boolean b);
		 
		 fen.setVisible(true);
		 

	}

}
