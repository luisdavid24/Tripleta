package matricesdispersas;

import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class MatricesDispersas {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Matriz matriz1 = new Matriz();
        matriz1.pack();
        matriz1.setVisible(true);
        matriz1.setResizable(true);
        
        Tripleta Trip1 = new Tripleta(matriz1.getnFil(), matriz1.getnCol(), matriz1.getDato());
        Trip1.crearTrip(matriz1.getMat());
    }
}
