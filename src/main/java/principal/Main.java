package principal;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N"));
    int soma = 0;
    for (int i = 0; i < n; i++) {
    int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));
    soma += x;
    }

    JOptionPane.showMessageDialog(null, "A soma é: " + soma);
    }
}