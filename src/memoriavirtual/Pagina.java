/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoriavirtual;



public class Pagina {
 private int NroPag;
 private int proceso;
 private int VecesUtilizado=0;

    public Pagina() {
    }

 
 
 
    public void setNroPag(int NroPag) {
        this.NroPag = NroPag;
    }

    public int getNroPag() {
        return NroPag;
    }
    

    public int getProceso() {
        return proceso;
    }

    public void setProceso(int proceso) {
        this.proceso = proceso;
    }
    
    public void AumentarVecesUtilizado(){
        VecesUtilizado++;
    }

    public int getVecesUtilizado() {
        return VecesUtilizado;
    }
    
    
    
}
