package matricesdispersas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Anderson
 */
public class Matriz extends JFrame{
    
    private int nCol;
    private int nFil;
    private int dato;
    private Object mat[][];

    public Object[][] getMat() {
        return mat;
    }

    public void setMat(Object[][] mat) {
        this.mat = mat;
    }

    public int getnCol() {
        return nCol;
    }

    public void setnCol(int nCol) {
        this.nCol = nCol;
    }
    
    public int getnFil() {
        return nFil;
    }

    public void setnFil(int nFil) {
        this.nFil = nFil;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    
    public Matriz(){
        super("Matriz Ingresada");
        int cont = 0;
        
        int f = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número de filas:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número de columnas:"));
        
        this.setnFil(f);
        this.setnCol(c);
        
        Object[][] mat = new Object[f][c];
        int porcentaje = (int)(f*c*90)/100;
        
        int i = 0;
        
        for (i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
               mat[i][j] = 0 + (int)(Math.random()*30);
            }
        }
        
        while(i <= porcentaje){
            mat[(int)(0 + Math.random()*f)][(int)(0 + Math.random()*c)] = 0;
            i++;
        }
        
        for (i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
               if((int)mat[i][j] != 0){
                   cont++;
               }
            }
        }
       
       String[] columNames = new String[c];
        for (int j = 0; j < c; j++) {
            columNames[j] = "Col " + (j+1); 
        }
      
       JOptionPane.showMessageDialog(null, cont);
       
       final JTable table = new JTable(mat,columNames);
       table.setPreferredScrollableViewportSize(new Dimension(500,70));
       JScrollPane scrollPane = new JScrollPane(table);
       getContentPane().add(scrollPane, BorderLayout.CENTER);
       
       addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
       }
    });
   }    
        
}

