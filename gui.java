
package follow.up;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gui extends JFrame{
    
    private JPanel panel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JTextArea area;
    private JTable table;
    private JLabel lbl;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JComboBox bx1;
    private JComboBox bx2;    
    private JButton btn;
    
    
    private static String[] act = {"Statement Conducted ","Medical Examination ", "Investication"};
    private static String[] sta = {"Pending" , "Closed case", "Court date", "Complete"};
    
    public gui(){
        super("Cput");
        setLayout(new FlowLayout());       
         
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.LIGHT_GRAY);
        add(panel);
        
        panel5 = new JPanel();
        panel5.setLayout(new FlowLayout());
        panel5.setBackground (Color.WHITE);
        add(panel5);
        
        panel6 = new JPanel();
        panel6.setLayout(new FlowLayout());
        panel6.setBackground (Color.WHITE);
        add(panel6);
        
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setBackground (Color.WHITE);
        add(panel1);
        
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setBackground (Color.WHITE);
        add(panel2);
        
                
        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        panel3.setBackground (Color.WHITE);
        add(panel3);
        
             
        panel4 = new JPanel();
        panel4.setLayout(new FlowLayout());
        add(panel4);
        
                
        lbl = new JLabel("Report DATE -----");
        lbl.getBaseline(20, 4);
        lbl.setBounds(5, 26, 10, 7);
        panel.add(lbl);
        
        
        lbl1 = new JLabel(" 16\\06\\2023");
        lbl1.getBaseline(20, 4);
        lbl1.setBounds(5, 26, 10, 7);
        panel.add(lbl1);

        lbl5 = new JLabel("Case Number : A2649C");
        panel5.add(lbl5);
        
        lbl6 = new JLabel("Description: Raped by Stepfather");
        panel6.add(lbl6);
        
        lbl2 = new JLabel("ACTION");
        bx1 = new JComboBox(act);
        panel1.add(lbl2);
        panel1.add(bx1);
               
        
        lbl3 = new JLabel("Status");
        bx2 = new JComboBox(sta);
        panel2.add(lbl3);
        panel2.add(bx2);
        
        lbl3 = new JLabel(" any comments...");
       
        area = new JTextArea(10, 20);
        panel3.add(lbl3);
        panel3.add(area);
        
        btn = new JButton("Submit");
        panel4.add(btn);
   }
}
