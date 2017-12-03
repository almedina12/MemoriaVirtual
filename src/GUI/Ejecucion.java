/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import memoriavirtual.MemoriaVirtual;
import memoriavirtual.Proceso;


public class Ejecucion extends Thread {
    
    JTextField Proceso_Ejecutando;
    JTextField Pagina_Ejecutando;
    MemoriaVirtual  MemoriaVirtual;
    boolean HayProceso,parar;
    Proceso Proceso;


    public Ejecucion(JTextField Proceso_Ejecutando, JTextField Pagina_Ejecutando, MemoriaVirtual MemoriaVirtual) {
        this.Proceso_Ejecutando = Proceso_Ejecutando;
        this.Pagina_Ejecutando = Pagina_Ejecutando;
        this.MemoriaVirtual=MemoriaVirtual;
    }
    
    
    
    public void run(){
        while(true){
            if(HayProceso){
        for(int i=0;i<Proceso.getPaginas().length;i++){
            if(parar){
                break;
            }
            
            
            Proceso_Ejecutando.setText(""+Proceso.getPaginas()[i].getProceso());
            Pagina_Ejecutando.setText(""+Proceso.getPaginas()[i].getNroPag());
            
            this.MemoriaVirtual.CambiarPaginas(Proceso.getPaginas()[i]);
            
            try {
                sleep(500);
                        } catch (InterruptedException ex) {
                Logger.getLogger(Ejecucion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
            
            if(!parar){
            HayProceso=false;    
            }else{
            parar=false;    
            }
            
            }
        }
    }

    public void setProceso(Proceso Proceso) {
        if(HayProceso){
            parar=true;
        }else{
        
        this.HayProceso=true;
        }
        this.Proceso = Proceso;
    }
    
    
    
}
