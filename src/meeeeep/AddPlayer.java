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
 * @version 1.0 vom 09.07.2019
 * @author
 */

public class AddPlayer extends JDialog {
	// Anfang Attribute
	private JTextField jTextField1 = new JTextField();
	private JButton bSpielerubernehmen = new JButton();
	private JTextArea jTextArea1 = new JTextArea("");
	private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
	private JTextField tfSpielerhiereintagen = new JTextField();
	private JTextField tfVorhandeneSpieler = new JTextField();
	// Ende Attribute

	public AddPlayer(JFrame owner, boolean modal) {
		// Dialog-Initialisierung
		super(owner, modal);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		int frameWidth = 555;
		int frameHeight = 331;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		setTitle("AddPlayer");
		Container cp = getContentPane();
		cp.setLayout(null);
		// Anfang Komponenten

		jTextField1.setBounds(30, 64, 190, 44);
		jTextField1.setHorizontalAlignment(SwingConstants.CENTER);
		cp.add(jTextField1);
		bSpielerubernehmen.setBounds(34, 126, 131, 41);
		bSpielerubernehmen.setText("Spieler uebernehmen");
		bSpielerubernehmen.setMargin(new Insets(2, 2, 2, 2));
		bSpielerubernehmen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bSpielerubernehmen_ActionPerformed(evt);
			}
		});
		cp.add(bSpielerubernehmen);
		jTextArea1ScrollPane.setBounds(316, 70, 200, 204);
		jTextArea1.setEditable(false);
		cp.add(jTextArea1ScrollPane);
		cp.setBackground(new Color(0x404040));
		tfSpielerhiereintagen.setBounds(28, 18, 190, 28);
		tfSpielerhiereintagen.setEditable(false);
		tfSpielerhiereintagen.setText("Spieler hier eintagen");
		tfSpielerhiereintagen.setHorizontalAlignment(SwingConstants.CENTER);
		cp.add(tfSpielerhiereintagen);
		tfVorhandeneSpieler.setBounds(316, 13, 182, 28);
		tfVorhandeneSpieler.setText("Vorhandene Spieler");
		tfVorhandeneSpieler.setHorizontalAlignment(SwingConstants.CENTER);
		tfVorhandeneSpieler.setEditable(false);
		cp.add(tfVorhandeneSpieler);
		// Ende Komponenten

		setResizable(false);
		setVisible(true);
	} // end of public AddPlayer

	// Anfang Methoden
	public void bSpielerubernehmen_ActionPerformed(ActionEvent evt) {
		if (!jTextField1.getText().equals(""))
			Main.addPlayer(new Player(jTextField1.getText()));
		ArrayList<Player> tmpPlayers = Main.getPlayers();
		String output = "";
		for (int i = 0; i < tmpPlayers.size(); i++) {
			output += tmpPlayers.get(i).getName();
			output += "\n";
		}
		jTextArea1.setText("");
		jTextArea1.setText(output);
	} // end of bSpielerubernehmen_ActionPerformed

	// Ende Methoden

} // end of class AddPlayer
