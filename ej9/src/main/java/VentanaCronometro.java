import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class VentanaCronometro /*implements ActionListener*/{

    private JFrame ventana;

    public VentanaCronometro (){
        construirVentanaCronometro ();
    }

    private void construirVentanaCronometro () {
        ventana = new JFrame("Cronometro");
        Container panelContenedor = ventana.getContentPane();
        JButton boton = new JButton("Empezar");
        panelContenedor.add(boton);
        JLabel etiqueta = new JLabel(String.valueOf(new Cronometro().getTiempo()));
        panelContenedor.add(etiqueta);
        panelContenedor.setLayout(new FlowLayout());

        ActionListener oyenteBoton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        };

        boton.addActionListener(oyenteBoton);//Se agrega a boton un oyente que es un objeto de actionListener (que es una interfaz).
                                            // Esto invoca a ActionPerformed que tiene que ser implementado.
                                            //Como no se pueden instanciar objetos de una interfaz, lo que hacemos es hacer una clase anónima
                                            //En la cual implementamos el único método de ActionListener (actionPerformed) y así podemos instanciar la interfaz.


        ventana.setSize(300,200);
        ventana.setLocation(400,400);
        //ventana.pack();

        ventana.setVisible(true);
    }
}
