import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TicTacToe extends JFrame implements ActionListener{

	private JFrame gameFrame;
	private String playerTurn;
	private ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	public TicTacToe() {
		
		playerTurn ="X";
		gameFrame = new JFrame("Tic Tac Toe");
		gameFrame.setLayout(new BorderLayout());
		
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		JPanel textPanel = new JPanel();
		JTextArea text = new JTextArea("Tic Tac Toe");
		text.setEditable(false);
		text.setFont(font1);
		text.setBackground(null);
		textPanel.add(text);
		
		JPanel buttonPanel =  new JPanel();
		buttonPanel.setLayout(new GridLayout(3,3));
		
		Font font2 = new Font("SansSerif", Font.BOLD, 0);
		for(int i = 0; i < 9; i++) {
			JButton button = new JButton(i+"");
			button.setActionCommand(i+"");
			button.addActionListener(this);
			buttonPanel.add(button);
			buttons.add(button);
			button.setFont(font2);
		}
		
		gameFrame.pack();
		gameFrame.add(textPanel,BorderLayout.NORTH);
		gameFrame.add(buttonPanel,BorderLayout.CENTER);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setSize(500,500);
		gameFrame.setVisible(true);
	}

	public void playerTurn() {
		if(playerTurn.equals("X")) {
			playerTurn = "O";
			return;
		}
		
		playerTurn = "X";
		
	}
	
	public void win() {
		if(buttons.get(0).getText().equals(buttons.get(1).getText()) && buttons.get(0).getText().equals(buttons.get(2).getText())) {
			for(JButton buttons : buttons) {
				buttons.setEnabled(false);
				buttons.setText("");
			}
			
			buttons.get(0).setBackground(new Color(0,255,0));
			buttons.get(0).setText(playerTurn);
			buttons.get(1).setBackground(new Color(0,255,0));
			buttons.get(1).setText(playerTurn);
			buttons.get(2).setBackground(new Color(0,255,0));
			buttons.get(2).setText(playerTurn);
			return;
		}
		
		if(buttons.get(0).getText().equals(buttons.get(3).getText()) && buttons.get(0).getText().equals(buttons.get(6).getText())) {
			for(JButton buttons : buttons) {
				buttons.setEnabled(false);
				buttons.setText("");
			}
			
			buttons.get(0).setBackground(new Color(0,255,0));
			buttons.get(0).setText(playerTurn);
			buttons.get(3).setBackground(new Color(0,255,0));
			buttons.get(3).setText(playerTurn);
			buttons.get(6).setBackground(new Color(0,255,0));
			buttons.get(6).setText(playerTurn);
			return;
		}
		
		if(buttons.get(0).getText().equals(buttons.get(4).getText()) && buttons.get(0).getText().equals(buttons.get(8).getText())) {
			for(JButton buttons : buttons) {
				buttons.setEnabled(false);
				buttons.setText("");
			}
			
			buttons.get(0).setBackground(new Color(0,255,0));
			buttons.get(0).setText(playerTurn);
			buttons.get(4).setBackground(new Color(0,255,0));
			buttons.get(4).setText(playerTurn);
			buttons.get(8).setBackground(new Color(0,255,0));
			buttons.get(8).setText(playerTurn);
			return;
		}
		
		if(buttons.get(1).getText().equals(buttons.get(4).getText()) && buttons.get(1).getText().equals(buttons.get(7).getText())) {
			for(JButton buttons : buttons) {
				buttons.setEnabled(false);
				buttons.setText("");
			}
			
			buttons.get(1).setBackground(new Color(0,255,0));
			buttons.get(1).setText(playerTurn);
			buttons.get(4).setBackground(new Color(0,255,0));
			buttons.get(4).setText(playerTurn);
			buttons.get(7).setBackground(new Color(0,255,0));
			buttons.get(7).setText(playerTurn);
			return;
		}
		
		if(buttons.get(2).getText().equals(buttons.get(5).getText()) && buttons.get(2).getText().equals(buttons.get(8).getText())) {
			for(JButton buttons : buttons) {
				buttons.setEnabled(false);
				buttons.setText("");
			}
			
			buttons.get(2).setBackground(new Color(0,255,0));
			buttons.get(2).setText(playerTurn);
			buttons.get(5).setBackground(new Color(0,255,0));
			buttons.get(5).setText(playerTurn);
			buttons.get(8).setBackground(new Color(0,255,0));
			buttons.get(8).setText(playerTurn);
			return;
		}
		
		if(buttons.get(2).getText().equals(buttons.get(4).getText()) && buttons.get(2).getText().equals(buttons.get(6).getText())) {
			for(JButton buttons : buttons) {
				buttons.setEnabled(false);
				buttons.setText("");
			}
			
			buttons.get(2).setBackground(new Color(0,255,0));
			buttons.get(2).setText(playerTurn);
			buttons.get(4).setBackground(new Color(0,255,0));
			buttons.get(4).setText(playerTurn);
			buttons.get(6).setBackground(new Color(0,255,0));
			buttons.get(6).setText(playerTurn);
			return;
		}
		
		if(buttons.get(3).getText().equals(buttons.get(4).getText()) && buttons.get(3).getText().equals(buttons.get(5).getText())) {
			for(JButton buttons : buttons) {
				buttons.setEnabled(false);
				buttons.setText("");
			}
			
			buttons.get(3).setBackground(new Color(0,255,0));
			buttons.get(3).setText(playerTurn);
			buttons.get(4).setBackground(new Color(0,255,0));
			buttons.get(4).setText(playerTurn);
			buttons.get(5).setBackground(new Color(0,255,0));
			buttons.get(5).setText(playerTurn);
			return;
		}
		
		if(buttons.get(6).getText().equals(buttons.get(7).getText()) && buttons.get(6).getText().equals(buttons.get(8).getText())) {
			for(JButton buttons : buttons) {
				buttons.setEnabled(false);
				buttons.setText("");
			}
			
			buttons.get(6).setBackground(new Color(0,255,0));
			buttons.get(6).setText(playerTurn);
			buttons.get(7).setBackground(new Color(0,255,0));
			buttons.get(7).setText(playerTurn);
			buttons.get(8).setBackground(new Color(0,255,0));
			buttons.get(8).setText(playerTurn);
			return;
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Font font3 = new Font("SansSerif", Font.BOLD, 50);
		
		int buttonNum = Integer.parseInt(e.getActionCommand());
		JButton tempButton = buttons.get(buttonNum);
		tempButton.setText(playerTurn);
		tempButton.setFont(font3);
		tempButton.setEnabled(false);
		win();
		playerTurn();
	}

}
