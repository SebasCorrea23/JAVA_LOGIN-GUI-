import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class VantanaLogin  extends JFrame implements ActionListener {

    JTextField usuario;
    JPasswordField contraseña;
    JPanel miPanel, miPanel2;
    JLabel titulo,error, titulo2, texto, texto2;
    JButton aceptar, limpiar, salir;

    public void Logueo(){
        setTitle("Loguear");
        setSize(1000,1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Inicio();
    }

    public void Inicio(){
        titulo=new JLabel();
        titulo.setText("Iniciar Sesion");
        titulo.setBounds(420,100,200,50);
        titulo.setForeground(Color.orange);
        titulo.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));

        usuario=new JTextField();
        usuario.setBounds(300,250, 400,50);

        contraseña=new JPasswordField();
        contraseña.setBounds(300, 350, 400, 50);


        aceptar=new JButton();
        aceptar.setText("Aceptar");
        aceptar.setBackground(Color.orange);
        aceptar.setForeground(Color.black);
        aceptar.setBounds(300,450, 180,50);
        aceptar.addActionListener(this);

        limpiar=new JButton();
        limpiar.setText("Limpiar");
        limpiar.setBackground(Color.orange);
        limpiar.setForeground(Color.BLACK);
        limpiar.setBounds(520,450,180,50);
        limpiar.addActionListener(this);

        salir=new JButton();
        salir.setText("Salir");
        salir.setBackground(Color.ORANGE);
        salir.setForeground(Color.BLACK);
        salir.setBounds(410,550,180,50);
        salir.addActionListener(this);

        error=new JLabel();
        error.setText("");
        error.setForeground(Color.black);
        error.setBounds(420,550,220,50);
        error.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));

        miPanel=new JPanel();
        miPanel.setLayout(null);
        miPanel.setBackground(Color.black);
        miPanel.add(titulo);
        miPanel.add(usuario);
        miPanel.add(contraseña);
        miPanel.add(aceptar);
        miPanel.add(limpiar);
        miPanel.add(error);
        miPanel.add(salir);

        add(miPanel);

    }

    public void Interfaz(){
        setTitle("Interfaz");
        setSize(700,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Vista();
    }

    public void Vista(){
        titulo2=new JLabel();
        titulo2.setText("Bienvenido"+usuario.getText());
        titulo2.setBounds(300,100,200,50);
        titulo2.setForeground(Color.ORANGE);
        titulo2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));


        miPanel2=new JPanel();
        miPanel2.setLayout(null);
        miPanel2.setBackground(Color.BLACK);
        miPanel2.add(titulo2);

        add(miPanel2);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == aceptar) {
            Ingreso();


        }
        if (e.getSource()== limpiar) {
            limpiarForm();
        }

        if (e.getSource() == salir) {
            salida();
        }


    }
    public void limpiarForm(){
        usuario.setText("");
        contraseña.setText("");
    }

    public void Ingreso(){
        String usuarioIngresado=usuario.getText();
        char[] contraseñaIngresada=contraseña.getPassword();
        if (usuarioIngresado.equals("SweetPain")&& Arrays.equals(contraseñaIngresada,"686268".toCharArray())) {
            error.setText("Bienvenido "+usuario.getText());
            error.setForeground(Color.GREEN);
            error.setBounds(390,550,400,50);
            Interfaz();

        }else if (!usuarioIngresado.equals("SweetPain")){
            error.setForeground(Color.red);
            error.setText("Error en el usuario");
        } else if (!contraseñaIngresada.equals("686268")) {
            error.setForeground(Color.red);
            error.setText("Error en la contraseña");
            error.setBounds(390,550,300,50);
        }

    }

    public void salida(){
        setVisible(false);
    }


}
