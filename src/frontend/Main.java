package frontend;

import javax.swing.*; 

public class Main extends JFrame {

	JProgressBar current;
	int num = 0;
	
	public Main() {
		
		super("Progress");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		pane.setLayout(null);
		current = new JProgressBar(0, 2000);
		current.setBounds(144, 5, 146, 17);
		current.setValue(0);
		current.setStringPainted(true);
		pane.add(current);
		setContentPane(pane);
	}

	public void iterate() {
		
		while (num < 2000) {
			current.setValue(num);
			try {
		  Thread.sleep(1000);
		  } catch (InterruptedException e) { 
		    }
		  num += 95;
		  }
		  }
		public static void main(String[] arguments) {
		  Main frame = new Main();
		  frame.pack();
		  frame.setVisible(true);
		  frame.iterate();
		  }
}


