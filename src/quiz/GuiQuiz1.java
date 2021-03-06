package quiz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * A class creating a GUI to see the question and the possible answers.
 *
 * @version 1.0 vom 14.05.2019
 * @author TheRaynex
 */

public class GuiQuiz1 extends JFrame {

	// Anfang Attribute
    private Quiz1 meinQuiz;
    private JTextField tfA = new JTextField();
    private JTextField textA = new JTextField();
    private JTextField textB = new JTextField();
    private JTextField textC = new JTextField();
    private JTextField textD = new JTextField();
    private JButton bA1 = new JButton();
    private JButton bB1 = new JButton();
    private JButton bC = new JButton();
    private JButton bD = new JButton();
    // Ende Attribute
    
    public GuiQuiz1(Quiz1 pMeinQuiz) { 
        
        // Frame-Initialisierung
        super();
        this.meinQuiz = pMeinQuiz;
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 1242; 
        int frameHeight = 800;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("GuiQuiz1");
        setResizable(true);
        Container cp = getContentPane();
        cp.setLayout(null);
        // Anfang Komponenten
        
        cp.setBackground(new Color(0x404040));
        tfA.setBounds(113, 84, 1022, 156);
        tfA.setBackground(new Color(0xC0C0C0));
        tfA.setText(meinQuiz.getFrage1().getFrage());
        tfA.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tfA.setForeground(Color.BLACK);
        tfA.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(tfA);
        textA.setBounds(113, 259, 438, 148);
        textA.setBackground(new Color(0xFFC800));
        textA.setText((meinQuiz.getFrage1().getAntA()));
        textA.setFont(new Font("Times New Roman", Font.BOLD, 20));
        textA.setForeground(Color.BLACK);
        textA.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(textA);
        textB.setBounds(701, 259, 438, 148);
        textB.setBackground(Color.MAGENTA);
        textB.setText((meinQuiz.getFrage1().getAntB()));
        textB.setFont(new Font("Times New Roman", Font.BOLD, 20));
        textB.setForeground(Color.BLACK);
        textB.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(textB);
        textC.setBounds(113, 419, 438, 148);
        textC.setBackground(new Color(0xFFAFAF));
        textC.setText((meinQuiz.getFrage1().getAntC()));
        textC.setFont(new Font("Times New Roman", Font.BOLD, 20));
        textC.setForeground(Color.BLACK);
        textC.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(textC);
        textD.setBounds(701, 419, 438, 148);
        textD.setBackground(Color.CYAN);
        textD.setText((meinQuiz.getFrage1().getAntD()));
        textD.setFont(new Font("Times New Roman", Font.BOLD, 20));
        textD.setForeground(Color.BLACK);
        textD.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(textD);
        bA1.setBounds(552, 259, 75, 148);
        bA1.setText("A");
        bA1.setMargin(new Insets(2, 2, 2, 2));
        bA1.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent evt) { 
                bA1_ActionPerformed(evt);
            }
        });
        bA1.setBackground(new Color(0xFFC800));
        cp.add(bA1);
        bB1.setBounds(627, 259, 75, 148);
        bB1.setText("B");
        bB1.setMargin(new Insets(2, 2, 2, 2));
        bB1.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent evt) { 
                bB1_ActionPerformed(evt);
            }
        });
        bB1.setBackground(Color.MAGENTA);
        cp.add(bB1);
        bC.setBounds(552, 419, 75, 148);
        bC.setText("C");
        bC.setMargin(new Insets(2, 2, 2, 2));
        bC.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent evt) { 
                bC_ActionPerformed(evt);
            }
        });
        bC.setBackground(new Color(0xFFAFAF));
        cp.add(bC);
        bD.setBounds(627, 419, 75, 148);
        bD.setText("D");
        bD.setMargin(new Insets(2, 2, 2, 2));
        bD.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent evt) { 
                bD_ActionPerformed(evt);
            }
        });
        bD.setBackground(Color.CYAN);
        cp.add(bD);
        // Ende Komponenten
        
        setVisible(true);
    } // end of public GuiQuiz1
    
    // Anfang Methoden
    
    
    public void bA1_ActionPerformed(ActionEvent evt) {
    	kontrolle();
    	bA1.setBackground(Color.WHITE);
    } // end of bA1_ActionPerformed

    public void bB1_ActionPerformed(ActionEvent evt) {
    	kontrolle();
    	bB1.setBackground(Color.WHITE);
    } // end of bB1_ActionPerformed

    public void bC_ActionPerformed(ActionEvent evt) {
    	kontrolle();
    	bC.setBackground(Color.WHITE);
    } // end of bC_ActionPerformed

    public void bD_ActionPerformed(ActionEvent evt) {
    	kontrolle();
    	bD.setBackground(Color.WHITE);
    } // end of bD_ActionPerformed
    
    public void kontrolle() {
    	switch (meinQuiz.getFrage1().getRichtig()) {
		case 'A':
			textA.setBackground(Color.GREEN);
        	textC.setBackground(Color.RED);
     		textB.setBackground(Color.RED);
     		textD.setBackground(Color.RED);
     		System.out.println("A");
			
			break;
			
		case 'B':
			textB.setBackground(Color.GREEN);
    		textA.setBackground(Color.RED);
			textC.setBackground(Color.RED);
			textD.setBackground(Color.RED);
			System.out.println("B");
			break;
			
		case 'C':
			textC.setBackground(Color.GREEN);
    		textA.setBackground(Color.RED);
    		textB.setBackground(Color.RED);
    		textD.setBackground(Color.RED);
    		System.out.println("C");
	
			break;
			
		case 'D':
			textD.setBackground(Color.GREEN);
    		textA.setBackground(Color.RED);
    		textB.setBackground(Color.RED);
    		textC.setBackground(Color.RED);
    		System.out.println("D");
			break;

		default:
			System.out.println("lol");
			break;
		}
    }
    // Ende Methoden
} // end of class GuiQuiz1

