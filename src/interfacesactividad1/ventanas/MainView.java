package interfacesactividad1.ventanas;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MainView extends JFrame {

    //A
    JLabel lb1;//PROFESION
    JTextField txtField1;
    //B
    JLabel lb2;//NºHermanos
    JLabel lb6;//EDAD
    String comboListaEdades[]= {"entre 18 y 30","menor de edad, es carcel","entre 30 y 65"};
    JComboBox<String> comBox1;//Rango edades

    //C
    JLabel lb3;
    JRadioButton radioButton1, radioButton2;
    JLabel lb4, lb5;

    //D
    JCheckBox chBox1;
    JLabel lb7;//CUAL?
    JList list1;//TENIS FUTBOL

    public MainView() {
        lb1 = new JLabel("Profesion:");
        txtField1 = new JTextField("DALE CAGON");
        lb2 = new JLabel("Nº Hermanos:");
        lb6 = new JLabel("EDAD");
        comBox1 = new JComboBox<String>(comboListaEdades);
    }
}
