package meeeeep;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.ArrayList;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 25.05.2019
 * @author
 */

public class Auswahl extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Anfang Attribute
	private static Quiz1 meinQuiz1 = new Quiz1();
	private static ArrayList<Player> myPlayers;
	private static Player aktPlayer;
	private Graph playerGraph;
	private JTextField tfDLRG = new JTextField();
	private JButton bA1 = new JButton();
	private JButton bA2 = new JButton();
	private JButton bA3 = new JButton();
	private JButton bA4 = new JButton();
	private JButton bA5 = new JButton();

	private JTextField tfErdkunde = new JTextField();
	private JButton b10 = new JButton();
	private JButton b20 = new JButton();
	private JButton b30 = new JButton();
	private JButton b40 = new JButton();
	private JButton b50 = new JButton();
	private JTextField tfAllgemeinwissen = new JTextField();
	private JButton b1 = new JButton();
	private JButton b2 = new JButton();
	private JButton b3 = new JButton();
	private JButton b4 = new JButton();
	private JButton b5 = new JButton();
	private JTextField tfMINT = new JTextField();
	private JButton b11 = new JButton();
	private JButton b21 = new JButton();
	private JButton b31 = new JButton();
	private JButton b41 = new JButton();
	private JButton b51 = new JButton();
	private JTextField tfPOPKultur = new JTextField();
	private JButton b12 = new JButton();
	private JButton b22 = new JButton();
	private JButton b32 = new JButton();
	private JButton b42 = new JButton();
	private JButton b52 = new JButton();
	private JButton bS1 = new JButton();
	private JButton bS2 = new JButton();
	private JButton bS3 = new JButton();
	private JButton bS4 = new JButton();
	private static JTextArea textSpieler = new JTextArea("");
	private JScrollPane textSpielerScrollPane = new JScrollPane(textSpieler);
	// Ende Attribute

	public Auswahl(Quiz1 pMeinQuiz1, ArrayList<Player> pPlayers, Graph pGraph) {
		// Frame-Initialisierung
		super();
		this.meinQuiz1 = pMeinQuiz1;
		this.myPlayers = pPlayers;
		this.playerGraph = pGraph;
		this.aktPlayer = myPlayers.get(0);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		int frameWidth = 1087;
		int frameHeight = 628;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		setTitle("auswahl");
		setResizable(true);
		Container cp = getContentPane();
		cp.setLayout(null);
		// Anfang Komponenten

		cp.setBackground(new Color(0x404040));
		tfDLRG.setBounds(10, 20, 160, 50);
		tfDLRG.setEditable(false);
		tfDLRG.setText("DLRG");
		tfDLRG.setHorizontalAlignment(SwingConstants.CENTER);
		tfDLRG.setBackground(Color.RED);
		cp.add(tfDLRG);
		bA1.setBounds(10, 80, 160, 75);
		bA1.setText("10");
		bA1.setMargin(new Insets(2, 2, 2, 2));
		bA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bA1_ActionPerformed(evt);
			}
		});
		bA1.setBackground(Color.RED);
		cp.add(bA1);
		bA2.setBounds(10, 165, 160, 75);
		bA2.setText("20");
		bA2.setMargin(new Insets(2, 2, 2, 2));
		bA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bA2_ActionPerformed(evt);
			}
		});
		bA2.setBackground(Color.RED);
		cp.add(bA2);
		bA3.setBounds(10, 250, 160, 75);
		bA3.setText("30");
		bA3.setMargin(new Insets(2, 2, 2, 2));
		bA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bA3_ActionPerformed(evt);
			}
		});
		bA3.setBackground(Color.RED);
		cp.add(bA3);
		bA4.setBounds(10, 335, 160, 75);
		bA4.setText("40");
		bA4.setMargin(new Insets(2, 2, 2, 2));
		bA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bA4_ActionPerformed(evt);
			}
		});
		bA4.setBackground(Color.RED);
		cp.add(bA4);
		bA5.setBounds(10, 420, 160, 75);
		bA5.setText("50");
		bA5.setMargin(new Insets(2, 2, 2, 2));
		bA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bA5_ActionPerformed(evt);
			}
		});
		bA5.setBackground(Color.RED);
		cp.add(bA5);
		tfErdkunde.setBounds(180, 20, 160, 50);
		tfErdkunde.setEditable(false);
		tfErdkunde.setHorizontalAlignment(SwingConstants.CENTER);
		tfErdkunde.setText("Erdkunde");
		tfErdkunde.setBackground(Color.GREEN);
		cp.add(tfErdkunde);
		b10.setBounds(180, 80, 160, 75);
		b10.setText("10");
		b10.setMargin(new Insets(2, 2, 2, 2));
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b10_ActionPerformed(evt);
			}
		});
		b10.setBackground(Color.GREEN);
		cp.add(b10);
		b20.setBounds(180, 165, 160, 75);
		b20.setText("20");
		b20.setMargin(new Insets(2, 2, 2, 2));
		b20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b20_ActionPerformed(evt);
			}
		});
		b20.setBackground(Color.GREEN);
		cp.add(b20);
		b30.setBounds(180, 250, 160, 75);
		b30.setText("30");
		b30.setMargin(new Insets(2, 2, 2, 2));
		b30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b30_ActionPerformed(evt);
			}
		});
		b30.setBackground(Color.GREEN);
		cp.add(b30);
		b40.setBounds(180, 335, 160, 75);
		b40.setText("40");
		b40.setMargin(new Insets(2, 2, 2, 2));
		b40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b40_ActionPerformed(evt);
			}
		});
		b40.setBackground(Color.GREEN);
		cp.add(b40);
		b50.setBounds(180, 420, 160, 75);
		b50.setText("50");
		b50.setMargin(new Insets(2, 2, 2, 2));
		b50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b50_ActionPerformed(evt);
			}
		});
		b50.setBackground(Color.GREEN);
		cp.add(b50);
		tfAllgemeinwissen.setBounds(350, 20, 160, 50);
		tfAllgemeinwissen.setEditable(false);
		tfAllgemeinwissen.setBackground(Color.CYAN);
		tfAllgemeinwissen.setText("Allgemeinwissen");
		tfAllgemeinwissen.setHorizontalAlignment(SwingConstants.CENTER);
		cp.add(tfAllgemeinwissen);
		b1.setBounds(350, 80, 160, 75);
		b1.setText("10");
		b1.setMargin(new Insets(2, 2, 2, 2));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b1_ActionPerformed(evt);
			}
		});
		b1.setBackground(Color.CYAN);
		cp.add(b1);
		b2.setBounds(350, 165, 160, 75);
		b2.setText("20");
		b2.setMargin(new Insets(2, 2, 2, 2));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b2_ActionPerformed(evt);
			}
		});
		b2.setBackground(Color.CYAN);
		cp.add(b2);
		b3.setBounds(350, 250, 160, 75);
		b3.setText("30");
		b3.setMargin(new Insets(2, 2, 2, 2));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b3_ActionPerformed(evt);
			}
		});
		b3.setBackground(Color.CYAN);
		cp.add(b3);
		b4.setBounds(350, 335, 160, 75);
		b4.setText("40");
		b4.setMargin(new Insets(2, 2, 2, 2));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b4_ActionPerformed(evt);
			}
		});
		b4.setBackground(Color.CYAN);
		cp.add(b4);
		b5.setBounds(350, 420, 160, 75);
		b5.setText("50");
		b5.setMargin(new Insets(2, 2, 2, 2));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b5_ActionPerformed(evt);
			}
		});
		b5.setBackground(Color.CYAN);
		cp.add(b5);
		tfMINT.setBounds(520, 20, 160, 50);
		tfMINT.setEditable(false);
		tfMINT.setHorizontalAlignment(SwingConstants.CENTER);
		tfMINT.setText("MINT");
		tfMINT.setBackground(new Color(0xFFC800));
		cp.add(tfMINT);
		b11.setBounds(520, 80, 160, 75);
		b11.setText("10");
		b11.setMargin(new Insets(2, 2, 2, 2));
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b11_ActionPerformed(evt);
			}
		});
		b11.setBackground(new Color(0xFFC800));
		cp.add(b11);
		b21.setBounds(520, 165, 160, 75);
		b21.setText("20");
		b21.setMargin(new Insets(2, 2, 2, 2));
		b21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b21_ActionPerformed(evt);
			}
		});
		b21.setBackground(new Color(0xFFC800));
		cp.add(b21);
		b31.setBounds(520, 250, 160, 75);
		b31.setText("30");
		b31.setMargin(new Insets(2, 2, 2, 2));
		b31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b31_ActionPerformed(evt);
			}
		});
		b31.setBackground(new Color(0xFFC800));
		cp.add(b31);
		b41.setBounds(520, 335, 160, 75);
		b41.setText("40");
		b41.setMargin(new Insets(2, 2, 2, 2));
		b41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b41_ActionPerformed(evt);
			}
		});
		b41.setBackground(new Color(0xFFC800));
		cp.add(b41);
		b51.setBounds(520, 420, 160, 75);
		b51.setText("50");
		b51.setMargin(new Insets(2, 2, 2, 2));
		b51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b51_ActionPerformed(evt);
			}
		});
		b51.setBackground(new Color(0xFFC800));
		cp.add(b51);
		tfPOPKultur.setBounds(690, 20, 160, 50);
		tfPOPKultur.setEditable(false);
		tfPOPKultur.setHorizontalAlignment(SwingConstants.CENTER);
		tfPOPKultur.setText("POP-Kultur");
		tfPOPKultur.setBackground(new Color(0xFFAFAF));
		cp.add(tfPOPKultur);
		b12.setBounds(690, 80, 160, 75);
		b12.setText("10");
		b12.setMargin(new Insets(2, 2, 2, 2));
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b12_ActionPerformed(evt);
			}
		});
		b12.setBackground(new Color(0xFFAFAF));
		cp.add(b12);
		b22.setBounds(690, 165, 160, 75);
		b22.setText("20");
		b22.setMargin(new Insets(2, 2, 2, 2));
		b22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b22_ActionPerformed(evt);
			}
		});
		b22.setBackground(new Color(0xFFAFAF));
		cp.add(b22);
		b32.setBounds(690, 250, 160, 75);
		b32.setText("30");
		b32.setMargin(new Insets(2, 2, 2, 2));
		b32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b32_ActionPerformed(evt);
			}
		});
		b32.setBackground(new Color(0xFFAFAF));
		cp.add(b32);
		b42.setBounds(690, 335, 160, 75);
		b42.setText("40");
		b42.setMargin(new Insets(2, 2, 2, 2));
		b42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b42_ActionPerformed(evt);
			}
		});
		b42.setBackground(new Color(0xFFAFAF));
		cp.add(b42);
		b52.setBounds(690, 420, 160, 75);
		b52.setText("50");
		b52.setMargin(new Insets(2, 2, 2, 2));
		b52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				b52_ActionPerformed(evt);
			}
		});
		b52.setBackground(new Color(0xFFAFAF));
		cp.add(b52);
		bS1.setBounds(100, 505, 160, 75);
		bS1.setText("100");
		bS1.setMargin(new Insets(2, 2, 2, 2));
		bS1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bS1_ActionPerformed(evt);
			}
		});
		bS1.setBackground(Color.MAGENTA);
		cp.add(bS1);
		bS2.setBounds(270, 505, 160, 75);
		bS2.setText("100");
		bS2.setMargin(new Insets(2, 2, 2, 2));
		bS2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bS2_ActionPerformed(evt);
			}
		});
		bS2.setBackground(Color.MAGENTA);
		cp.add(bS2);
		bS3.setBounds(440, 505, 160, 75);
		bS3.setText("100");
		bS3.setMargin(new Insets(2, 2, 2, 2));
		bS3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bS3_ActionPerformed(evt);
			}
		});
		bS3.setBackground(Color.MAGENTA);
		cp.add(bS3);
		bS4.setBounds(610, 505, 160, 75);
		bS4.setText("100");
		bS4.setMargin(new Insets(2, 2, 2, 2));
		bS4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bS4_ActionPerformed(evt);
			}
		});
		bS4.setBackground(Color.MAGENTA);
		cp.add(bS4);
		textSpielerScrollPane.setBounds(860, 80, 200, 415);
		textSpieler.setEditable(false);
		cp.add(textSpielerScrollPane);
		// Ende Komponenten

		setVisible(true);
		
		bestimmeAktPlayer();
	} // end of public auswahl

	// Anfang Methoden

	public static ArrayList<Player> getMyPlayers() {
		return myPlayers;
	}

	public static void setMyPlayers(ArrayList<Player> myPlayers) {
		Auswahl.myPlayers = myPlayers;
	}
	
	public static void setAktPlayer(Player p) {
		Auswahl.aktPlayer = p;
	}

	public void bA1_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenA().get(0), aktPlayer);
		bA1.setBackground(Color.WHITE);

	} // end of bA1_ActionPerformed

	public void bA2_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenA().get(1), aktPlayer);
		bA2.setBackground(Color.WHITE);

	} // end of bA2_ActionPerformed

	public void bA3_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenA().get(2), aktPlayer);
		bA3.setBackground(Color.WHITE);
		
	} // end of bA3_ActionPerformed

	public void bA4_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenA().get(3), aktPlayer);
		bA4.setBackground(Color.WHITE);
		
	} // end of bA4_ActionPerformed

	public void bA5_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenA().get(4), aktPlayer);
		bA5.setBackground(Color.WHITE);
		
	} // end of bA5_ActionPerformed

	public void b10_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenB().get(0), aktPlayer);
		b10.setBackground(Color.WHITE);
		
	} // end of b10_ActionPerformed

	public void b20_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenB().get(1), aktPlayer);
		b20.setBackground(Color.WHITE);
		
	} // end of b20_ActionPerformed

	public void b30_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenB().get(2), aktPlayer);
		b30.setBackground(Color.WHITE);
		
	} // end of b30_ActionPerformed

	public void b40_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenB().get(3), aktPlayer);
		b40.setBackground(Color.WHITE);
	
	} // end of b40_ActionPerformed

	public void b50_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenB().get(4), aktPlayer);
		b50.setBackground(Color.WHITE);
	
	} // end of b50_ActionPerformed

	public void b1_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenC().get(0), aktPlayer);
		b1.setBackground(Color.WHITE);
	
	} // end of b1_ActionPerformed

	public void b2_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenC().get(1), aktPlayer);
		b2.setBackground(Color.WHITE);
	
	} // end of b2_ActionPerformed

	public void b3_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenC().get(2), aktPlayer);
		b3.setBackground(Color.WHITE);
	
	} // end of b3_ActionPerformed

	public void b4_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenC().get(3), aktPlayer);
		b4.setBackground(Color.WHITE);
	
	} // end of b4_ActionPerformed

	public void b5_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenC().get(4), aktPlayer);
		b5.setBackground(Color.WHITE);

	} // end of b5_ActionPerformed

	public void b11_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenD().get(0), aktPlayer);
		b11.setBackground(Color.WHITE);
		
	} // end of b11_ActionPerformed

	public void b21_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenD().get(1), aktPlayer);
		b21.setBackground(Color.WHITE);
		
	} // end of b21_ActionPerformed

	public void b31_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenD().get(2), aktPlayer);
		b31.setBackground(Color.WHITE);
		
	} // end of b31_ActionPerformed

	public void b41_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenD().get(3), aktPlayer);
		b41.setBackground(Color.WHITE);
		
	} // end of b41_ActionPerformed

	public void b51_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenD().get(4), aktPlayer);
		b51.setBackground(Color.WHITE);
		
	} // end of b51_ActionPerformed

	public void b12_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenE().get(0), aktPlayer);
		b12.setBackground(Color.WHITE);
		
	} // end of b12_ActionPerformed

	public void b22_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenE().get(1), aktPlayer);
		b22.setBackground(Color.WHITE);
		
	} // end of b22_ActionPerformed

	public void b32_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenE().get(2), aktPlayer);
		b32.setBackground(Color.WHITE);
		
	} // end of b32_ActionPerformed

	public void b42_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenE().get(3), aktPlayer);
		b42.setBackground(Color.WHITE);
		
	} // end of b42_ActionPerformed

	public void b52_ActionPerformed(ActionEvent evt) {
		new GuiFrage(meinQuiz1.getFragenE().get(4), aktPlayer);
		b52.setBackground(Color.WHITE);
		
	} // end of b52_ActionPerformed

	public void bS1_ActionPerformed(ActionEvent evt) {
		// TODO hier Quelltext e

	} // end of bS1_ActionPerformed

	public void bS2_ActionPerformed(ActionEvent evt) {
		// TODO hier Quelltext een

	} // end of bS2_ActionPerformed

	public void bS3_ActionPerformed(ActionEvent evt) {
		// TODO hier Quelltext einen

	} // end of bS3_ActionPerformed

	public void bS4_ActionPerformed(ActionEvent evt) {
	
	}
		// TODO hier Quellte


	// Ende Methoden

	public static void bestimmeAktPlayer() {
		for (int i = 0; i < myPlayers.size(); i++) {
			if (aktPlayer.getName() == myPlayers.get(i).getName()) {
				myPlayers.set(i, aktPlayer);
			}
		}
		for (int i = 0; i < myPlayers.size(); i++) {
			if (aktPlayer.getPoints() >= myPlayers.get(i).getPoints()) {
				Auswahl.aktPlayer = myPlayers.get(i);
			}
		}
		String ausgabe = "";
		for (int i = 0; i < myPlayers.size(); i++) {
			ausgabe = ausgabe + myPlayers.get(i).getName() + myPlayers.get(i).getPoints() + "\n" ;
		}
		textSpieler.setText("");
		textSpieler.setText(aktPlayer.getName() + " " + aktPlayer.getPoints() +"\n"+"\n"+"\n"+ ausgabe);
		
	}
} // end of class auswahl
