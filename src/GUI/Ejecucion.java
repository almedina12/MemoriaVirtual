/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JTextField;
import memoriavirtual.MemoriaVirtual;
import memoriavirtual.Pagina;
import memoriavirtual.Proceso;


public class Ejecucion extends Thread {
    
    JTextField Proceso_Ejecutando;
    JTextField Pagina_Ejecutando;
    MemoriaVirtual  MemoriaVirtual;
    boolean HayProceso,parar;
    Proceso Proceso;
    private String[] Aux;
    private Pagina[] AuxP;
    private Pagina[] AuxS;
    private JList AlmacenamientoSecundario;
    private JList MemoriaPrincipal;
  


    public Ejecucion(JTextField Proceso_Ejecutando, JTextField Pagina_Ejecutando, MemoriaVirtual MemoriaVirtual, JList AlmacenamientoSecundario,
     JList MemoriaPrincipal) {
        this.Proceso_Ejecutando = Proceso_Ejecutando;
        this.Pagina_Ejecutando = Pagina_Ejecutando;
        this.MemoriaVirtual=MemoriaVirtual;
        this.AlmacenamientoSecundario=AlmacenamientoSecundario;
        this.MemoriaPrincipal=MemoriaPrincipal;
       
    }
    
    
    
    public void run(){
        while(true){
            try {
                sleep(1500);
                        } catch (InterruptedException ex) {
                Logger.getLogger(Ejecucion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(HayProceso){
                 
        for(int i=0;i<Proceso.getPaginas().length;i++){
            if(parar){
                break;
            }
            
            //System.out.println("Llegaste");
            
            
            if(!this.MemoriaVirtual.EstaEnMP(Proceso.getPaginas()[i])){
                
            this.MemoriaVirtual.CambiarPaginas(Proceso.getPaginas()[i]);
            }
            
            
            this.imprimirMP();
            this.imprimirMS();
  
            this.MemoriaVirtual.EliminarPaginaMP(Proceso.getPaginas()[i]);
            
            Proceso_Ejecutando.setText(""+Proceso.getPaginas()[i].getProceso());
            Pagina_Ejecutando.setText(""+Proceso.getPaginas()[i].getNroPag());
            
            this.imprimirMP();
            this.imprimirMS();
            try {
                sleep(5000);
                        } catch (InterruptedException ex) {
                Logger.getLogger(Ejecucion.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.MemoriaVirtual.InsertarPaginaMP(Proceso.getPaginas()[i]);
            this.imprimirMP();
            this.imprimirMS();
            Proceso.getPaginas()[i].AumentarVecesUtilizado();
        }
        
        Proceso_Ejecutando.setText("");
            Pagina_Ejecutando.setText("");
            
            if(!parar){
            HayProceso=false;    
            }else{
            parar=false;    
            }
            
            }
        }
    }

    public void setProceso(Proceso Proceso) {
        this.Proceso = Proceso;
        if(HayProceso){
            parar=true;
        }else{
        
        
        this.HayProceso=true;
            
        }
        
    }
    
    public void imprimirMS(){
    ArrayList<Pagina> ListaMS=this.MemoriaVirtual.getListaPaginasMS();
    Pagina Pag;
    Aux=new String[ListaMS.size()];
    for(int i=0;i< ListaMS.size();i++){
        Pag=ListaMS.get(i);
        if(Pag==null){
           Aux[i]="Vacio"; 
           
        }else{
            
        Aux[i]="Proceso: "+Pag.getProceso()+" Pagina: "+ Pag.getNroPag(); 
        
        }
        
    }
    this.AlmacenamientoSecundario.setListData(Aux);
}
    
    public void imprimirMP(){
        
        
    AuxP=MemoriaVirtual.getPaginasMP();
    Aux=new String[AuxP.length];
    
    for(int i=0;i< AuxP.length;i++){
        if(AuxP[i]==null){
           Aux[i]="Vacio"; 
           
        }else{
            
        Aux[i]="Proceso: "+AuxP[i].getProceso()+" Pagina: "+ AuxP[i].getNroPag(); 
        
        }
        
    }
    MemoriaPrincipal.setListData(Aux);
}
    
    
    
    
}
