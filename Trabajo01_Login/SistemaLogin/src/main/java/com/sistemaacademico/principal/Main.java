package com.sistemaacademico.principal;

import com.sistemaacademico.vista.FrmLogin;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FrmLogin login = new FrmLogin();
            login.setVisible(true);
        });
    }
}
