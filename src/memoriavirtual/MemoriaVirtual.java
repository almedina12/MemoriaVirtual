/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoriavirtual;

import java.util.ArrayList;




public class MemoriaVirtual {

private Pagina[] PaginasMP;
private ArrayList<Pagina> ListaPaginasMS=new ArrayList<>();
 private ArrayList<Proceso> listaProcesos= new ArrayList<>();
private int IDProceso=0;
private int i,j;

    public MemoriaVirtual(int Max) {
        this.PaginasMP = new Pagina[Max];
        
    }

    public Pagina[] getPaginasMP() {
        return PaginasMP;
    }

    public ArrayList<Pagina> getListaPaginasMS() {
        return ListaPaginasMS;
    }

    

    public ArrayList<Proceso> getListaProcesos() {
        return listaProcesos;
    }

    
    
 
public void CrearProceso(int paginas){
    
    Proceso Proceso=new Proceso(IDProceso,paginas);
    listaProcesos.add(Proceso);
    IDProceso++;
   
    
    
    i=0;j=0;
    while(i<PaginasMP.length && j<(paginas)){
        if(PaginasMP[i]==null){
            PaginasMP[i]=Proceso.getPagina(j);
            j++;
        }
        i++;
    }
    i=0;
    
    while(j<(paginas)){
        
            ListaPaginasMS.add(Proceso.getPagina(j));
            j++;
        
    }
    
    
}

public Pagina InsertarPaginaMP(Pagina Pagina){
    i=0;
    boolean SeMetio=false;
    while(i<PaginasMP.length && !SeMetio){
    if(PaginasMP[i]==null ){
        PaginasMP[i]=Pagina;
        SeMetio=true;
    }
    i++;
    }
    if(!SeMetio){
        int Minimo=0;
        for(int i=0;i<PaginasMP.length;i++){
            
            if(PaginasMP[i].getVecesUtilizado()<PaginasMP[Minimo].getVecesUtilizado()){
                Minimo=i;
            }
        }
        
        PaginasMP[Minimo]=Pagina;
        return PaginasMP[Minimo];
    }else{
    return null;
    }
    }

    
public void InsertarPaginaMS(Pagina Pagina){
    ListaPaginasMS.add(Pagina);
}

public void EliminarPaginaMP(Pagina Pagina){
    for(int i=0;i<PaginasMP.length;i++){
       if(PaginasMP[i]==Pagina){
           PaginasMP[i]=null;
           break;
       } 
    }
}
public void EliminarPaginaMS(Pagina Pagina){
    ListaPaginasMS.remove(Pagina);
}



public void EliminarPagina(Pagina Pagina){
    boolean listo=false;
    for(int i=0;i<PaginasMP.length;i++){
       if(PaginasMP[i]==Pagina){
           this.EliminarPaginaMP(Pagina);
           listo=true;
           break;
       } 
    }
    if(!listo){
       this.EliminarPaginaMS(Pagina);
    }
}

public void EliminarProceso(Proceso Proceso){
    for(int i=0;i<Proceso.getPaginas().length;i++){
        this.EliminarPagina(Proceso.getPaginas()[i]);
    }
    listaProcesos.remove(Proceso);
}

public void EliminarProceso(int numero){
    for(int i=0;i<this.listaProcesos.size();i++){
     if(listaProcesos.get(i).getNroProceso()==numero){
         this.EliminarProceso(listaProcesos.get(i));
     }
    }
}

public void CambiarPaginas(Pagina PaginaMP){
    
   Pagina PaginaMS=this.InsertarPaginaMP(PaginaMP);
   this.EliminarPaginaMS(PaginaMP);
    this.InsertarPaginaMS(PaginaMS);
}

public boolean EstaEnMP(Pagina pagina){
    boolean esta=false;
    for(int i=0;i<this.PaginasMP.length;i++){
       if(PaginasMP[i]==pagina) 
           esta=true;
    }
    return esta;
}
    
}
