
package formas;

import clase.Animal;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
    
    JPanel[] panel;
    JLabel[] etiqueta;
    JButton boton;
    int ANCHO =800;
    
    String nombres[] = {"conejo","morrocoy"};
    
    public Ventana(){
    setLayout(new GridLayout(0,1));
    
    panel = new JPanel[2];
    etiqueta = new JLabel[2];
    boton = new JButton("Comienzo");
    
        for (int i = 0; i < 2; i++) {
        panel[i] = new JPanel();
        add(panel[i]);
        etiqueta[i] = new JLabel(nombres[i]);
        etiqueta[i].setIcon(new ImageIcon(getClass().getResource(nombres[i]+".gif")));
        panel[i].add(this.etiqueta[i]);
        etiqueta[i].setLocation(0,0);
        }
    add(boton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200, 150);
        setSize(ANCHO,400);
        setVisible(true);
        
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Animal conejo = new Animal("conejo",ANCHO-10,etiqueta[0]);
            Animal morrocoy = new Animal("morrocoy",ANCHO-10,etiqueta[1]);
            conejo.start();
            morrocoy.start();
        }
    });
    
    }
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
    }
}
