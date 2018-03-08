// intrest Calculator in java (System Application)


import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.*;

/*
<applet code="Myapp.class" width=700 height=200>
</applet>
*/
 
public class Myapp extends Applet implements ActionListener {
    
     TextField intst,rupee,rate,time;
     public void init() {
           Color col = new Color(0,122,62);
           setBackground(col);
           rupee =new TextField(20);
           rate = new TextField(12);
           time = new TextField(14);
           intst = new TextField(25);
           intst.setEditable(false);
           Label rl = new Label("Balance",Label.LEFT);
           Label r = new Label("Rate",Label.LEFT);
           Label t = new Label("Time",Label.LEFT);
           Label i = new Label("Simple Intrest",Label.LEFT);
           Button b=new Button("Compute");
           add(rl);
           add(rupee);
           add(r);
           add(rate);
           add(t);
           add(time);
           add(i);
           add(intst);
           add(b);
           b.addActionListener(this);
           rupee.addActionListener(this);
           rate.addActionListener(this);
           time.addActionListener(this);
     }

 public void actionPerformed(ActionEvent ob){
          String str,stra,stt;
          str=rupee.getText();
          stra = rate.getText();
          stt = time.getText();
          if(str.length()==0 || stra.length()==0 || stt.length()==0) showStatus("please enter the valid input");
          else showStatus("Intrest Computed");
          double tr = Double.parseDouble(str);
          float tra = Float.parseFloat(stra);
          float tt = Float.parseFloat(stt);
          double ti ;
          ti= (tr*tra*tt)/100;
          intst.setText(Double.toString(ti));
          repaint();        
}

public Insets getInsets() {
   return new Insets(10,3,10,50);
}

  
} 
