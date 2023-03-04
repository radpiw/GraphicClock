import	java.awt.*;
import	javax.swing.*;
import java.util.*;

public class GraficznyZegar{
public static void main (String args[]){
	JFrame okno	=new JFrame("Zegar");
	okno.setSize(400,150);
	Panel panel=new Panel();
	okno.getContentPane().add(panel);
	okno.setDefaultCloseOperation(3);
	okno.setVisible(true);
	}
}

class Panel extends JPanel{
	private int rok,mc,dzien,godz,min,sek;
	private String smc,sdzien,sgodz,smin,ssek;
	
	public Panel(){
		GregorianCalendar czas= new GregorianCalendar();
		rok=czas.get(Calendar.YEAR);
		mc=czas.get(Calendar.MONTH);
		dzien=czas.get(Calendar.DAY_OF_MONTH);
		godz=czas.get(Calendar.HOUR_OF_DAY);
		min=czas.get(Calendar.MINUTE);
		sek=czas.get(Calendar.SECOND);	
	}
	public void paintComponent (Graphics g){
		Font czcionka=new Font("Monospaced",Font.BOLD,30);
		g.setFont(czcionka);
		if(mc<10){
			smc="0";
		}
		else smc="";
		
		if(dzien<10){
			sdzien="0";
		}
		else sdzien="";
		g.drawString(rok+"."+smc+(mc+1)+"."+sdzien+dzien,70,40);
		
		/*if(godz<10){
			sgodz="0";
		}
		else sgodz"";*/
		
		if(min<10){
			smin="0";
		}
		else smin="";
		
		if(sek<10){
		ssek="0";
		}
		else ssek="";
		g.drawString(godz+":"+smin+min+":"+ssek+sek,70,80);
			
	}
}




