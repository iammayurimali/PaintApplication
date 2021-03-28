/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintapplication;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import paintapplication.Canvas;
/**
 *
 * @author Amruta
 */
public class Draw {
    private int width, height;
    Color color = Color.WHITE;
    Canvas canvas;
    public void setDimension(int width,int height){
        this.width = width;
        this.height = height;
    }
    
    public void startPaint() { 
            JFrame frame = new JFrame("Paint");
            Container container = frame.getContentPane();
            container.setLayout(new BorderLayout());
            canvas = new Canvas();
            container.add(canvas, BorderLayout.CENTER);
            frame.setVisible(true);

            frame.setSize(width+50,height+50);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public Dimension getCanvasDimension(){
            JTextField wField = new JTextField(5);
            JTextField hField = new JTextField(5);
            JPanel myPanel = new JPanel();
            myPanel.add(new JLabel("Height"));
            myPanel.add(hField);
            myPanel.add(new JLabel("Width"));
            myPanel.add(wField);

            int result = JOptionPane.showConfirmDialog(null, myPanel,"Enter Dimension", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                Dimension d = new Dimension(Integer.parseInt(wField.getText()), Integer.parseInt(wField.getText()));
                return d;
            }
            Dimension d = new Dimension(500,500);
            return d;
        }
    
}
