package frontend;

import controller.WindowController;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ProgressBarWindow extends JFrame
{
    private JProgressBar current;
    private boolean progressBarActive = false;
    private JButton btnStart = new JButton ("Start");
    private JButton btnStop = new JButton ("Stop");

    public ProgressBarWindow()
    {
        setTitle("Progress Bar Window");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //---------- Progress Bar panel -------------
        JPanel pane = new JPanel();
        pane.setLayout(null);
        current = new JProgressBar(0, 100);
        current.setBounds(102, 263, 305, 89);
        current.setValue(0);
        current.setStringPainted(true);
        pane.add(current);
        setContentPane(pane);

        //---------- Start botton panel --------------
        btnStart.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
        btnStart.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(!progressBarActive)
                {
                    progressBarActive = true;

                    Thread _threadStart = new Thread()
                    {
                        @Override
                        public void run()
                        {
                            startProgressBar();

                            if(current.getValue() == 100)
                            {
                                WindowController.FinishedProgressBarWindow();
                            }
                        }
                    };
                    _threadStart.start();
                    btnStart.setEnabled(false);
                    btnStop.setEnabled(true);
                }
            }
        });
        btnStart.setBounds(186, 58, 111, 29);
        pane.add(btnStart);

        //---------- Stop botton panel ----------------
        btnStop.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
        btnStop.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(progressBarActive)
                {
                    stopProgressBar();

                    btnStart.setEnabled(true);
                    btnStop.setEnabled(false);
                }
            }
        });
        btnStop.setBounds(186, 149, 111, 29);
        pane.add(btnStop);
    }

    private void startProgressBar()
    {
        while (progressBarActive && current.getValue() < 100)
        {
            try
            {
                Thread.sleep(50);
                current.setValue(current.getValue() + 1);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        progressBarActive = false;
    }

    private void stopProgressBar()
    {
        progressBarActive = false;
    }
}
