/**
 * @author tf
 * @ version 2.0
 */
package day01_Frame;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public final class FramWork extends JFrame {

    public static void main(String[] args) {
    	FramWork tt = new FramWork();
        tt.setVisible(true);
        tt.setSize(400, 400);
        tt.setName("嗅探器");
        
    }
    CaptureDemo captur=new Capture
    private JLabel label = new JLabel("获取网络接口");
    private JLabel label02=new JLabel("展示报文信息");

    private JTextArea textArea;
    private JButton button;
   
      private JTextArea textArea02;
      private JButton button02;

/**
 * 初始化图形界面
 */
    public FramWork() {
    	
        super("Test Texts");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setName("嗅探器");;
        getContentPane().setLayout(new java.awt.FlowLayout());
        
        button=new JButton("点击获取");
        textArea = new JTextArea(5, 15);
        textArea.setLineWrap(true);
              
        button02=new JButton("点击获取");
        textArea02=new JTextArea(5,15);
        textArea02.setDragEnabled(true);
        textArea02.setLineWrap(true);

        getContentPane().add(label);
        getContentPane().add(button);
        getContentPane().add(textArea);
        
        
        getContentPane().add(label02);
        getContentPane().add(button02);
        getContentPane().add(textArea02);

        setSize(200, 200);
    }
    
    public String  getNetWork() {
  
	}
    
    private void myEvent() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText(networks);
			}
		});

	}

}