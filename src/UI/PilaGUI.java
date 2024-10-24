package UI;

import Logica.Pila;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PilaGUI {
    private JTextField textField1;
    private JButton pushButton;
    private JButton popButton;
    private JTextArea textArea1;
    private JPanel PilaGUI;
    private JTextArea textArea2;
    private JButton revertButton;
    private Pila pila = new Pila();
    private Pila pila2 = new Pila();

    public PilaGUI() {
        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{

                    int valorEntrada= Integer.parseInt(textField1.getText());
                    pila.push(valorEntrada, textArea1);
                    textField1.setText("");
                }catch (Exception ex){

                    JOptionPane.showMessageDialog(null, "Valor no valido");
                }
            }
        });

        popButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                pila.pop(textArea1);
            }
        });

        revertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                pila.revertStack(pila2, textArea2);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PilaGUI");
        frame.setContentPane(new PilaGUI().PilaGUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
