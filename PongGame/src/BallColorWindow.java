
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
/**
 * 
 */

/**
 * @author Binh Tran - T151266
 *	
 * 
 */
public class BallColorWindow extends JFrame{
	JRadioButton optWhite = new JRadioButton("White Ball");
	JRadioButton optTennis = new JRadioButton("Tennis");
	JRadioButton optbasketball = new JRadioButton("basketball");
	JLabel lblWhite = new JLabel();
	JLabel lblBasket = new JLabel();
	JLabel lblTennis = new JLabel();
	ImageIcon imWhite = new ImageIcon("./BallTypeImage/ballwhite.png");
	ImageIcon imTennis = new ImageIcon("./BallTypeImage/tennisball.png");
	ImageIcon imbasketball = new ImageIcon("./BallTypeImage/basketball.png");
	ButtonGroup btnGroup = new ButtonGroup();
	JButton btnChoose = new JButton("Choose");
	public BallColorWindow(){
		setSize(500, 280);
		setTitle("BallTyle");
		setLayout(null);
		setLocationRelativeTo(null);
		
		add(optWhite);
		add(optTennis);
		add(optbasketball);
		add(lblWhite);
		add(lblBasket);
		add(lblTennis);
		add(btnChoose);
		
		lblWhite.setIcon(imWhite);
		lblTennis.setIcon(imTennis);
		lblBasket.setIcon(imbasketball);
		btnGroup.add(optWhite);
		btnGroup.add(optTennis);
		btnGroup.add(optbasketball);
		
		lblWhite.setBounds(10, 10, 50, 50);
		optWhite.setBounds(60, 20, 100, 30);
		
		
		lblBasket.setBounds(10, 70, 50, 50);
		optbasketball.setBounds(60, 80, 100, 30);
		
		lblTennis.setBounds(10, 130, 50, 50);
		optTennis.setBounds(60, 140, 100, 30);
		
		btnChoose.setBounds(350, 190, 100, 30);
		
		//default option
		optWhite.setSelected(true);
		
		btnChoose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(optWhite.isSelected() == true)
				{
					PongPanel.NumTypeBall = 0;
				}else if(optbasketball.isSelected() == true){
					PongPanel.NumTypeBall = 1;
				}else if(optTennis.isSelected() == true){
					PongPanel.NumTypeBall = 2;
				}
				
			}
		});
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BallColorWindow mainWidow = new BallColorWindow();
		mainWidow.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainWidow.setVisible(true);
	}

}