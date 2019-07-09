package meeeeep;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.ArrayList;

/**
 *
 * A class creating a GUI to see the question and the possible answers.
 *
 * @version 1.0 vom 14.05.2019
 * @author TheRaynex
 */

public class GuiFrage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Anfang Attribute
	private Question meineFrage;
	private Player aktPlayer;
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

	public GuiFrage(Question pMeineFrage, Player pPlayer) {

		// Frame-Initialisierung
		super();
		this.meineFrage = pMeineFrage;
		this.aktPlayer = pPlayer;
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
		tfA.setText(meineFrage.getFrage());
		tfA.setFont(new Font("Times New Roman", Font.BOLD, 20));
		tfA.setForeground(Color.BLACK);
		tfA.setHorizontalAlignment(SwingConstants.CENTER);
		tfA.setEditable(false);
		cp.add(tfA);
		textA.setBounds(113, 259, 438, 148);
		textA.setBackground(new Color(0xFFC800));
		textA.setText((meineFrage.getAntA()));
		textA.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textA.setForeground(Color.BLACK);
		textA.setHorizontalAlignment(SwingConstants.CENTER);
		textA.setEditable(false);
		cp.add(textA);
		textB.setBounds(701, 259, 438, 148);
		textB.setBackground(Color.MAGENTA);
		textB.setText((meineFrage.getAntB()));
		textB.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textB.setForeground(Color.BLACK);
		textB.setHorizontalAlignment(SwingConstants.CENTER);
		textB.setEditable(false);
		cp.add(textB);
		textC.setBounds(113, 419, 438, 148);
		textC.setBackground(new Color(0xFFAFAF));
		textC.setText((meineFrage.getAntC()));
		textC.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textC.setForeground(Color.BLACK);
		textC.setHorizontalAlignment(SwingConstants.CENTER);
		textC.setEditable(false);
		cp.add(textC);
		textD.setBounds(701, 419, 438, 148);
		textD.setBackground(Color.CYAN);
		textD.setText((meineFrage.getAntD()));
		textD.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textD.setForeground(Color.BLACK);
		textD.setHorizontalAlignment(SwingConstants.CENTER);
		textD.setEditable(false);
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
		if (meineFrage.getRichtig() == 'A') {
			aktPlayer.setPoints(aktPlayer.getPoints() + meineFrage.getPunkte());
			Auswahl.setAktPlayer(aktPlayer);
			Auswahl.bestimmeAktPlayer();
		}
		bA1.setBackground(Color.WHITE);
	} // end of bA1_ActionPerformed

	public void bB1_ActionPerformed(ActionEvent evt) {
		kontrolle();
		if (meineFrage.getRichtig() == 'B') {
			aktPlayer.setPoints(aktPlayer.getPoints() + meineFrage.getPunkte());
			Auswahl.setAktPlayer(aktPlayer);
			Auswahl.bestimmeAktPlayer();
		}

		bB1.setBackground(Color.WHITE);
	} // end of bB1_ActionPerformed

	public void bC_ActionPerformed(ActionEvent evt) {
		kontrolle();
		if (meineFrage.getRichtig() == 'C') {
			aktPlayer.setPoints(aktPlayer.getPoints() + meineFrage.getPunkte());
			Auswahl.setAktPlayer(aktPlayer);
			Auswahl.bestimmeAktPlayer();
		}
		bC.setBackground(Color.WHITE);
	} // end of bC_ActionPerformed

	public void bD_ActionPerformed(ActionEvent evt) {
		kontrolle();
		if (meineFrage.getRichtig() == 'D') {
			aktPlayer.setPoints(aktPlayer.getPoints() + meineFrage.getPunkte());
			Auswahl.setAktPlayer(aktPlayer);
			Auswahl.bestimmeAktPlayer();
		}
		bD.setBackground(Color.WHITE);
	} // end of bD_ActionPerformed

	public void kontrolle() {
		switch (meineFrage.getRichtig()) {
		case 'A':
			textA.setBackground(Color.GREEN);
			textC.setBackground(Color.RED);
			textB.setBackground(Color.RED);
			textD.setBackground(Color.RED);

			break;

		case 'B':
			textB.setBackground(Color.GREEN);
			textA.setBackground(Color.RED);
			textC.setBackground(Color.RED);
			textD.setBackground(Color.RED);
			break;

		case 'C':
			textC.setBackground(Color.GREEN);
			textA.setBackground(Color.RED);
			textB.setBackground(Color.RED);
			textD.setBackground(Color.RED);

			break;

		case 'D':
			textD.setBackground(Color.GREEN);
			textA.setBackground(Color.RED);
			textB.setBackground(Color.RED);
			textC.setBackground(Color.RED);
			break;

		default:
			System.out.println("lol");
			break;
		}

	}
}
