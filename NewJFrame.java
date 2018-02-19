import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class NewJFrame extends javax.swing.JFrame {
	private static final JFrame JFrame = null;
	private JTextPane jTextPane1;
	private JTextPane jTextPane3;
	private JTextPane jTextPane5;
	private JTextField jTextField7;
	private JTextField jTextField8;
	private JRadioButton jRadioButton2;
	private JRadioButton jRadioButton1;
	private JTextField jTextField10;
	private JTextField jTextField9;
	private JButton jButton2;
	private JButton jButton1;
	private JTextField jTextField6;
	private JTextField jTextField5;
	private JTextField jTextField4;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JTextPane jTextPane6;
	private JTextPane jTextPane4;
	private JTextPane jTextPane2;


	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
			
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrame inst = new NewJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public NewJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jTextPane1 = new JTextPane();
				getContentPane().add(jTextPane1);
				jTextPane1.setText("Register");
				jTextPane1.setBounds(142, 24, 54, 23);
			}
			{
				jTextPane2 = new JTextPane();
				getContentPane().add(jTextPane2);
				jTextPane2.setText("First Name:");
				jTextPane2.setBounds(45, 52, 72, 23);
			}
			{
				jTextPane3 = new JTextPane();
				getContentPane().add(jTextPane3);
				jTextPane3.setText("Surname:");
				jTextPane3.setBounds(45, 120, 60, 23);
			}
			{
				jTextPane4 = new JTextPane();
				getContentPane().add(jTextPane4);
				jTextPane4.setText("Email Address:");
				jTextPane4.setBounds(45, 187, 92, 23);
			}
			{
				jTextPane5 = new JTextPane();
				getContentPane().add(jTextPane5);
				jTextPane5.setText("Password:");
				jTextPane5.setBounds(45, 252, 65, 23);
			}
			{
				jTextPane6 = new JTextPane();
				getContentPane().add(jTextPane6);
				jTextPane6.setText("Password Confirmation:");
				jTextPane6.setBounds(45, 320, 144, 23);
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(45, 86, 256, 24);
			}
			{
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setBounds(45, 154, 256, 24);
			}
			{
				jTextField3 = new JTextField();
				getContentPane().add(jTextField3);
				jTextField3.setBounds(45, 219, 256, 24);
			}
			{
				jTextField4 = new JTextField();
				getContentPane().add(jTextField4);
				jTextField4.setBounds(45, 86, 256, 24);
			}
			{
				jTextField5 = new JTextField();
				getContentPane().add(jTextField5);
				jTextField5.setBounds(45, 86, 256, 24);
			}
			{
				jTextField6 = new JTextField();
				getContentPane().add(jTextField6);
				jTextField6.setBounds(45, 219, 256, 24);
			}
			{
				jTextField7 = new JTextField();
				getContentPane().add(jTextField7);
				jTextField7.setBounds(45, 219, 256, 24);
			}
			{
				jTextField8 = new JTextField();
				getContentPane().add(jTextField8);
				jTextField8.setBounds(45, 219, 256, 24);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);

				jButton1.setBounds(253, 489, 58, 30);
				jButton1.setText("OK");
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.exit(0);
						jButton1ActionPerformed(evt);
				
					}
				});
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("Cancel");
				jButton2.setBounds(32, 489, 78, 30);
				jButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.exit(0);
						jButton2ActionPerformed(evt);
					
					}
				});
			}
			{
				jTextField9 = new JTextField();
				getContentPane().add(jTextField9);
				jTextField9.setBounds(45, 287, 256, 24);
			}
			{
				jTextField10 = new JTextField();
				getContentPane().add(jTextField10);
				jTextField10.setBounds(45, 355, 256, 24);
			}
			{
				jRadioButton1 = new JRadioButton();
				getContentPane().add(jRadioButton1);
				jRadioButton1.setText("Student");
				jRadioButton1.setBounds(45, 405, 87, 21);
			
				
			}
			{
				jRadioButton2 = new JRadioButton();
				getContentPane().add(jRadioButton2);
				jRadioButton2.setText("Tutor");
				jRadioButton2.setBounds(45, 443, 77, 21);
		
			}
	
			pack();
			this.setSize(400, 577);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jButton1ActionPerformed(ActionEvent evt) {
		System.out.println("jButton1.actionPerformed, event="+evt);
		//TODO add your code for jButton1.actionPerformed
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
		System.out.println("jButton2.actionPerformed, event="+evt);
		//TODO add your code for jButton2.actionPerformed
	}

}
