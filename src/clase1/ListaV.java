/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1;

/**
 *
 * @author Royer
 */
public class ListaV {

    NodoV p;

    public ListaV() {
        p = null;
    }

    public NodoV getP() {
        return p;
    }

    public void setP(NodoV p) {
        this.p = p;
    }

    public void adicion(String a, String b, String c, int d) {
        NodoV nue = new NodoV();
        nue.setPlaca(a);
        nue.setMarca(b);
        nue.setColor(c);
        nue.setModelo(d);

        nue.setSig(getP());
        setP(nue);
    }
    
    public void mostrar(NodoV r){
        if(r!=null){
            System.out.println(r.getPlaca()+" - "+r.getMarca()+" - "+r.getModelo()+" - "+r.getColor());
            mostrar(r.getSig());
        }else{
            return;
        }
    }
}
