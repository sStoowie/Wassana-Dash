
package main;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Time {
	
	JFrame window;
	JLabel timeLabel;
	Font font1 = new Font("Arial", Font.PLAIN, 70);	
	Timer timer;	
	int second, minute;
	String doubledigitSecond, doubledigitMinute;	
	DecimalFormat doubledigitFormat = new DecimalFormat("00");
	

	public static void main(String[] args) {
		
		new Time();		
	}
	
	public Time() {
		
		window = new JFrame();
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		
		timeLabel = new JLabel("");
		timeLabel.setBounds(300, 230, 200, 100);
		timeLabel.setHorizontalAlignment(JLabel.CENTER);
		timeLabel.setFont(font1);
		
		window.add(timeLabel);
		window.setVisible(true);
	
		// Countdown Timer
		timeLabel.setText("03:00");
		second = 0;
		minute = 3;
		countdownTimer();
		timer.start();						
	}

	public void countdownTimer() {
            
		timer = new Timer(1000, new ActionListener() {
                    
			@Override
			public void actionPerformed(ActionEvent e) {
				
				second--;
				doubledigitSecond = doubledigitFormat.format(second);
				doubledigitMinute = doubledigitFormat.format(minute);	
				timeLabel.setText(doubledigitMinute + ":" + doubledigitSecond);
				
				if(second==-1) {
					second = 59;
					minute--;
					doubledigitSecond = doubledigitFormat.format(second);
					doubledigitMinute = doubledigitFormat.format(minute);	
					timeLabel.setText(doubledigitMinute + ":" + doubledigitSecond);
				}
				if(minute==0 && second==0) {
					timer.stop();
				}
			}
		});		
	}		
}
