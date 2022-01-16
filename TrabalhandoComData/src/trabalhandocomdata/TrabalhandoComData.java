package trabalhandocomdata;

import java.util.Date;

public class TrabalhandoComData {

    public static void main(String[] args) {
        Date relogio = new Date(); //O novo objeto receberá a classe Date()
        
        System.out.println("O horário atual é:");
        System.out.println(relogio.toString());
    }
}
