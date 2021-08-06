package matricesdispersas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;



/**
 *
 * @author Anderson
 */
public class Tripleta{
    
    private int nFil;
    private int nCol;
    private int nTrip;
    private int listaTrip[][];
    
    public Tripleta(int nFil, int nCol, int cd){
        this.nFil = nFil;
        this.nCol = nCol;
        nTrip = cd + 1;
        listaTrip = new int[nTrip][3];
        listaTrip[0][0] = nFil;
        listaTrip[0][1] = nCol;
        listaTrip[0][2] = cd;
    }
   
    //Crear tripleta es pasar los datos de la matriz a una lista de tripletas
    public void crearTrip(Object mat[][]){
        
    }
}
