package frontend;

import java.awt.EventQueue;
import javax.swing.JFrame;

import controller.WindowController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainWindow extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JFrame frame;

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    MainWindow window = new MainWindow();
                    window.setBounds(500, 500, 500, 500);
                    window.frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainWindow()
    {
        setTitle("Main Window");
        setSize(500, 500);

        getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Calculator");
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        btnNewButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                WindowController.ProgressBarWindow();
            }
        });

        btnNewButton.setBounds(164, 203, 134, 55);
        getContentPane().add(btnNewButton);
        initialize();
    }

    private void initialize()
    {
        frame = new JFrame();
        frame.setBounds(500, 500, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
