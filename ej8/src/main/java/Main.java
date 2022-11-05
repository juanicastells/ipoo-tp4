import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //VentanaEj8 ventana = new VentanaEj8("HolaMundoSwing");
        //ventana.setVisible(true);

        JFrame ventana = new JFrame( "HolaMundoSwing");
        ventana.setSize(450,350);
        ventana.setLocation(400,200);
        ventana.setVisible(true);
        //Antes de agregar botones y etiquetas hay que agregar un panel.
        //un panel está dentro de la clase Container de la cual hereda Frame.
        Container panel = new Container();
        panel.setLayout(new FlowLayout());//si no ponemos el layout quizas deberiamos indicar a donde va el texto para que el mismo aparezca en la ventana ¿?
        JLabel texto = new JLabel("Hola, Mundo");//JLabel es otra clase de la cual hereda JFrame ¿?
        panel.add (texto);
        ventana.add(panel);

    }
}
