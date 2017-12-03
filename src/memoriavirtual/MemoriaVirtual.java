/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoriavirtual;

import java.util.ArrayList;




public class MemoriaVirtual {

private Pagina[] PaginasMP;
private ArrayList<Pagina> ListaPaginasMS;
 private ArrayList<Proceso> listaProcesos;
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
        if(ListaPaginasMS.get(i)==null){
            ListaPaginasMS.add(i,Proceso.getPagina(j));
            j++;
        }
    }
    
    
}
    
    
}
