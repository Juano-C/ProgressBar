package controller;

import frontend.MainWindow;
import frontend.ProgressBarWindow;
import frontend.FinishedProgressBarWindow;

import javax.swing.JFrame;

public class WindowController
{

	private static MainWindow _mainWindow = new MainWindow();
	private static ProgressBarWindow _progressBarWindow = new ProgressBarWindow();
	private static FinishedProgressBarWindow _finishedProgressBarWindow = new FinishedProgressBarWindow();

    public static void windowOpen(JFrame openWindow,JFrame closeWindow)
    {
    	openWindow.setLocationRelativeTo(null);
    	openWindow.setVisible(true);
    	closeWindow.setVisible(false);
        openWindow.setResizable(false);
    }

    public static void MainWindow()
    {
    	_mainWindow.setVisible(true);
    	_mainWindow.setLocationRelativeTo(null);
    	_progressBarWindow.setVisible(false);
    	_finishedProgressBarWindow.setVisible(false);
    }

    public static MainWindow getMainWindow()
    {
        return _mainWindow;
    }

    public static void ProgressBarWindow()
    {
    	_mainWindow.setVisible(false);
    	_progressBarWindow.setVisible(true);
    	_progressBarWindow.setLocationRelativeTo(null);
    	_finishedProgressBarWindow.setVisible(false);
    }
    
    public static ProgressBarWindow getProgressBarWindow()
    {
    	return _progressBarWindow;
    }

    public static void FinishedProgressBarWindow()
    {
    	_mainWindow.setVisible(false);
    	_progressBarWindow.setVisible(true);
    	_finishedProgressBarWindow.setVisible(true);
    	_finishedProgressBarWindow.setLocationRelativeTo(null);
    }
    
    public static FinishedProgressBarWindow getFinishedProgressBarWindow()
    {
    	return _finishedProgressBarWindow;
    }

}
