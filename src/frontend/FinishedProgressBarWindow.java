package frontend;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.WindowController;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class FinishedProgressBarWindow extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JButton btnMenu = new JButton("Menu");

    public FinishedProgressBarWindow()
    {
        setTitle("Finished Progress Bar Window");
        setSize(348, 187);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // --------------- btn Menu ----------
        btnMenu.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                WindowController.MainWindow();
            }
        });
        btnMenu.setFont(new Font("Verdana", Font.PLAIN, 14));
        btnMenu.setBounds(233, 114, 89, 23);
        getContentPane().add(btnMenu);

        // --------------- Texto finished calculation ----------
        JLabel txtFinishedCalculation = new JLabel("FINISHED CALCULATION");
        txtFinishedCalculation.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
        txtFinishedCalculation.setHorizontalAlignment(SwingConstants.CENTER);
        txtFinishedCalculation.setBounds(57, 42, 221, 37);
        getContentPane().add(txtFinishedCalculation);
    }
}

