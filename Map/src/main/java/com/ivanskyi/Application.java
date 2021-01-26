package com.ivanskyi;

import com.ivanskyi.library.Reception;

public class Application {
    static Reception reception = new Reception();
    public static void main(String[] args) {
        reception.startTerminal();
    }
}
