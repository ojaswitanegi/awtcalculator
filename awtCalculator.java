/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author OjaswitaNegi
 */
class Calc extends Frame implements ActionListener
{
    Label lblfno, lblsno,lblrs;
    TextField txtfno,txtsno,txtrs;
    Button btnAdd, btnSub;
    Panel p1;
    public Calc()
    {lblfno= new Label("Enter first number");
    lblsno=new Label("Enter second number");
    lblfno.setBounds(10,50,150,20);
    lblsno.setBounds(10,70,150,20);
    lblrs= new Label("Result");
    lblrs.setBounds(10,90,150,20);
    txtfno= new TextField(20);
    txtsno= new TextField(20);
    txtrs= new TextField(20);
    txtfno.setBounds(175,50,150,20);
    txtsno.setBounds(175,70,150,20);
    txtrs.setBounds(175,90,150,20);
    btnAdd= new Button("ADD");
    btnAdd.setBounds(10,150,100,20);
    p1=new Panel();
    add(p1);
    p1.add(lblfno);
    p1.add(lblsno);
    p1.add(lblrs);
    p1.add(txtfno);
    p1.add(txtsno);
    p1.add(txtrs);
    p1.add(btnAdd);
    
    btnAdd.addActionListener(this);
    addWindowListener(new WindowAdapter()
    {
        public void windowClosing(WindowEvent evt)
        {
            System.exit(0);
        }
    });
    
    }
    public void actionPerformed(ActionEvent evt)
    {
        Object obj=evt.getSource();
        int a,b,rs;
        a=Integer.parseInt(txtfno.getText());
        b=Integer.parseInt(txtsno.getText());
        if(obj==btnAdd)
        {
            rs=a+b;
            txtrs.setText(String.valueOf(rs));
        }
    }
}
            
    
    
    }
}
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calc c= new Calc();
        c.setSize(400,300);
        c.setLocation(100,100);
        c.setVisible(true);
        c.setLayout(null);
        // TODO code application logic here
    }
    
}
