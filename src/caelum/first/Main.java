package caelum.first;


import javax.swing.*;
import java.util.*;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int type = Integer.parseInt(JOptionPane.showInputDialog(null, "Soma: 0\nSubtração: 1\nMultipicação: 2"));
        new BaseFrame(type);
    }



}