package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog ("enter your age");	
	int votingAge = Integer.parseInt(age);
	if(votingAge >= 18) {
		JOptionPane.showInputDialog ("who should be the next president.");
	}
	else {
		JOptionPane.showMessageDialog(null, "nobody cares what you think");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}	
}
