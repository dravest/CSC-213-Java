import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class GridBagLayoutThing
{
	public static void main( String args[])
	{
		final JFrame frame = new JFrame();
		JPanel panel = new JPanel(new GridBagLayout());
		JLabel label = new JLabel("Press a button", JLabel.CENTER);
		JButton button1 = new JButton(new buttonAction1(label));
		JButton button2 = new JButton(new buttonAction2(label));
		//label.setBackground( Color.cyan );
		label.setOpaque( true );
		
		panel.add(button1,
				new GridBagConstraints( 0, 0, 1, 1, 0.5, 0.5,
							GridBagConstraints.FIRST_LINE_START,
		   				   	GridBagConstraints.BOTH,
		   				   	new Insets( 5, 5, 5, 5 ), 0, 0 ) );
		panel.add(button2,
				new GridBagConstraints( 1, 0, 1, 1, 0.5, 0.5,
							GridBagConstraints.FIRST_LINE_START,
		   				   	GridBagConstraints.BOTH,
		   				   	new Insets( 5, 5, 5, 5 ), 0, 0 ) );
		panel.add(label,
				new GridBagConstraints( 0, 1, 
							GridBagConstraints.REMAINDER, 1, 1.0, 1.0,
		   				   GridBagConstraints.FIRST_LINE_START,
		   				   GridBagConstraints.BOTH,
		   				   new Insets( 5, 5, 5, 5 ), 0, 0 ) );
		frame.add( panel );
		frame.pack();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setLocationRelativeTo( null ); // Display in center of screen
		
		SwingUtilities.invokeLater( new Runnable()
		{
			@Override
			public void run() 
			{
				frame.setVisible( true );	
			}
		});
		
		
	}
	private static class buttonAction1 extends AbstractAction
	{
		private JLabel label;
		public buttonAction1(JLabel Label)
		{
			super();
			this.label = Label;
			
			putValue( AbstractAction.NAME, "Button 1" );
			putValue( AbstractAction.SHORT_DESCRIPTION, "I'm number 1!" );
		}
		
		@Override
		public void actionPerformed( ActionEvent e ) 
		{
			label.setText("Button 1 clicked!");
			label.setBackground(Color.CYAN);
		}
	}
	private static class buttonAction2 extends AbstractAction
	{
		private JLabel label;
		public buttonAction2(JLabel Label)
		{
			super();
			this.label = Label;
			
			putValue(AbstractAction.NAME, "Button 2");
			putValue(AbstractAction.SHORT_DESCRIPTION, "I'm number 2!");
		}
			
		@Override
		public void actionPerformed( ActionEvent e ) 
		{
			label.setText("Button 2 clicked!");
			label.setBackground(Color.YELLOW);
		}
	}
}