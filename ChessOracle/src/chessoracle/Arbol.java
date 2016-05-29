/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessoracle;

/**
 *
 * @author alexy
 */
public class Arbol {
    nodo_arbol root;

    public Arbol() {
    }

    public Arbol(nodo_arbol root) {
        this.root = root;
    }
    
    public nodo_arbol getRoot(){
        return root;
    }
    
    public Lista postOrden(){
        Lista recorrido = new Lista();
        recorrido.push_back(this);
        
        
        
        return recorrido;
    }
}
