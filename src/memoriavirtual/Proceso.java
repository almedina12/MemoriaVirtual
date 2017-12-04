/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoriavirtual;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;
import javafx.scene.Node;




public class Proceso {
    private int NroProceso;
    private Pagina[] Paginas;

    
    
    public Proceso(int NroProceso,int Nro,int[] Orden) {
        this.NroProceso=NroProceso;
        this.Paginas = new Pagina[Nro];
        
        for(int i=0;i<Nro;i++){
            Paginas[i]=new Pagina();
            Paginas[i].setNroPag(Orden[i]);
            Paginas[i].setProceso(NroProceso);
        }
        
    }
    
     public Proceso(int NroProceso,int Nro) {
        this.NroProceso=NroProceso;
        this.Paginas = new Pagina[Nro];
        
        for(int i=0;i<Nro;i++){
            Paginas[i]=new Pagina();
            Paginas[i].setNroPag(i);
            Paginas[i].setProceso(NroProceso);
        }
        
    }

    public int getNroProceso() {
        return NroProceso;
    }

    public Pagina[] getPaginas() {
        return Paginas;
    }
    
    public Pagina getPagina(int Pagina){
        return Paginas[Pagina];
    }

   

    
}
