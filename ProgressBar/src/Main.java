
import java.awt.Color;
import java.awt.Font;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author emirarikan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
     Progress p = new Progress();
     p.setVisible(true);
     sonuc s = new sonuc();
     s.getContentPane().setBackground(Color.BLUE);
     s.setFont(new Font("Serif",Font.BOLD,48));

     
     for(int i = 0 ;i<=100;i++){
         Thread.sleep(50);
         Progress.jProgressBar1.setValue(i);
         if(i ==100){
             p.setVisible(false);
             s.setVisible(true);
         }
     }
    }
    
}
