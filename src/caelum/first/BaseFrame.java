package caelum.first;

import javax.swing.*;


public class BaseFrame extends JFrame {

    public BaseFrame(int type){
        super("Matrizes");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1024, 720);
        setLocationRelativeTo(null);

        String matriz1 = "Primeira Matriz";
        String matriz2 = "Segunda Matriz";

        int first_a11;
        int first_a12;
        int first_a21;
        int first_a22;

        int two_a11;
        int two_a12;
        int two_a21;
        int two_a22;

        int a11;
        int a12;
        int a21;
        int a22;

        String result = null;

        switch(type){
            case 0: // soma

                first_a11 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a11 da " + matriz1));
                first_a12 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a12 da " + matriz1));
                first_a21 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a21 da " + matriz1));
                first_a22 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a22 da " + matriz1));

                two_a11 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a11 da " + matriz2));
                two_a12 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a12 da " + matriz2));
                two_a21 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a21 da " + matriz2));
                two_a22 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a22 da " + matriz2));

                a11 = first_a11 + two_a11;
                a12 = first_a12 + two_a12;
                a21 = first_a21 + two_a21;
                a22 = first_a22 + two_a22;

                result = "Resultado das Matrizes(Adição):\n[ " + a11 + "  " + a12 + " ]\n[ " + a21 + "  " + a22 + " ]";

                break;
            case 1: // subtração

                first_a11 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a11 da " + matriz1));
                first_a12 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a12 da " + matriz1));
                first_a21 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a21 da " + matriz1));
                first_a22 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a22 da " + matriz1));

                two_a11 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a11 da " + matriz2));
                two_a12 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a12 da " + matriz2));
                two_a21 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a21 da " + matriz2));
                two_a22 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a22 da " + matriz2));

                a11 = first_a11 - two_a11;
                a12 = first_a12 - two_a12;
                a21 = first_a21 - two_a21;
                a22 = first_a22 - two_a22;

                result = "Resultado das Matrizes(Subtração):\n[ " + a11 + "  " + a12 + " ]\n[ " + a21 + "  " + a22 + " ]";
                break;
            case 2: // multiplicação

                first_a11 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a11 da " + matriz1));
                first_a12 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a12 da " + matriz1));
                first_a21 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a21 da " + matriz1));
                first_a22 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a22 da " + matriz1));

                two_a11 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a11 da " + matriz2));
                two_a12 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a12 da " + matriz2));
                two_a21 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a21 da " + matriz2));
                two_a22 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a22 da " + matriz2));

                a11 = (first_a11 * two_a11) + (first_a12 * two_a21);
                a12 = (first_a11 * two_a12) + (first_a12 * two_a22);
                a21 = (first_a21 * two_a11) + (first_a22 * two_a21);
                a22 = (first_a21 * two_a12) + (first_a22 * two_a22);

                result = "Resultado das Matrizes(Multiplicação):\n[ " + a11 + "  " + a12 + " ]\n[ " + a21 + "  " + a22 + " ]";
                break;
        }
        if(result != null) {
            String title = null;
            switch(type){
                case 0:
                    title = "Adição";
                    break;
                case 1:
                    title = "Subtração";
                    break;
                case 2:
                    title = "Multiplicação";
                    break;
            }
            JOptionPane.showMessageDialog(null, result, title, 1);
        }

        int recom = JOptionPane.showConfirmDialog(null, "Deseja recomeçar?");
        switch(recom){
            case 0:
                int vv = Integer.parseInt(JOptionPane.showInputDialog(null, "Soma: 0\nSubtração: 1\nMultipicação: 2"));
                new BaseFrame(vv);
                break;
            case 1:
                break;
            case 2:
                break;
        }
    }

}
