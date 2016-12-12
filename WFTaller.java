import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JInternalFrame;

public class WFTaller extends JFrame{

	public WFTaller(){

		super("WorkFlow");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,400);

		
		JLabel lb = new JLabel("Etiqueta");
		JTextField txt = new JTextField("Caja de texto");
		JButton btn = new JButton("Button");


		JDesktopPane panInt = new JDesktopPane();
		GridBagLayout gridbag = new GridBagLayout();


		panInt.setLayout(gridbag);
		GridBagConstraints constraints = new GridBagConstraints();

		JInternalFrame internal = new JInternalFrame("Haga clic en un control y arrastre a la ventana");
				

        constraints.weightx = 0.1;
		constraints.weighty = 0.1;
		constraints.gridx = 0; 
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;	
        constraints.anchor = GridBagConstraints.NORTHWEST;
		panInt.add(new JLabel("Controles: "),constraints);     

		constraints.weightx = 0.1;
		constraints.weighty = 0.1;
		constraints.gridx = 0; 
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;	
        constraints.anchor = GridBagConstraints.WEST;
		panInt.add(lb,constraints);     

		constraints.weightx = 0.5;
		constraints.weighty = 0.5;
		constraints.gridx = 1; 
		constraints.gridy = 0; 
		constraints.gridwidth = 7; 
		constraints.gridheight = 7; 
		constraints.fill = GridBagConstraints.BOTH;
		panInt.add(internal,constraints);            

		constraints.weightx = 0.1;
		constraints.weighty = 0.1;
		constraints.gridx = 0; 
		constraints.gridy = 3; 
		constraints.gridwidth = 1; 
		constraints.gridheight = 1;       
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.WEST;
		panInt.add(txt,constraints);            

		constraints.weightx = 0.1;
		constraints.weighty = 0.1;
		constraints.gridx = 0; 
		constraints.gridy = 4; 
		constraints.gridwidth = 1; 
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.WEST;
        panInt.add(btn,constraints);
		
		internal.setResizable(true);
        internal.setClosable(true);
		internal.setVisible(true);

        internal.toBack();
		setContentPane(panInt);
		setVisible(true);

		lb.addMouseMotionListener(
  				new MouseMotionListener() {
   
  				@Override
   				public void mouseMoved(MouseEvent arg0) {
    
   				}
   
  				@Override
  				public void mouseDragged(MouseEvent e) {
    			lb.setLocation(e.getXOnScreen()-10, e.getYOnScreen()-55);
   				}
  			}
  		);
		txt.addMouseMotionListener(
  				new MouseMotionListener() {
   
  				@Override
   				public void mouseMoved(MouseEvent arg0) {
    
   				}
   
  				@Override
  				public void mouseDragged(MouseEvent e) {
    			txt.setLocation(e.getXOnScreen()-10, e.getYOnScreen()-55);
   				}
  			}

		);
		btn.addMouseMotionListener(
  				new MouseMotionListener() {
   
  				@Override
   				public void mouseMoved(MouseEvent arg0) {
    
   				}
   
  				@Override
  				public void mouseDragged(MouseEvent e) {
    			btn.setLocation(e.getXOnScreen()-10, e.getYOnScreen()-55);
   				}
  			}

		);


}

	public static void main(String[] args) {
		new WFTaller();
	}

}