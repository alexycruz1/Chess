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
public class nodo_arbol {

    private Object value = null;
    private nodo_arbol padre = null;
    private Lista hijos = new Lista();
    
    public nodo_arbol() {
    }
    
    public nodo_arbol(Object value, nodo_arbol padre) {
        this.value = value;
        this.padre = padre;
    }
    
    public Object getValue() {
        return value;
    }
    
    public void setValue(Object value) {
        this.value = value;
    }
    
    public Object getLefterSon() {
        return hijos.getHead();
    }
    
    public nodo_arbol getParent() {
        return padre;
    }
    
    public void setParent(nodo_arbol nodo) {
        this.padre = nodo;
    }
    
    public Object getRightBrother() {
        nodo_arbol papa = this.getParent();
        Lista temp = papa.hijos;
        Object temp2 = null;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.at(i).equals(this)) {
                if (i + 1 == temp.size()) {
                    temp2 = temp.at(i);
                }else{
                    temp2 = temp.at(i + 1);
                }
            }
        }
        return temp2;
    }
    
    public void addSon(nodo_arbol nodo) {
        nodo.setParent(this);
        hijos.push_back(nodo);
    }
    
    public void Delete(nodo_arbol nodo) {
        nodo_arbol papa = this.getParent();
        Lista temp = papa.hijos;
        Object temp2 = null;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.at(i).equals(this)) {
                temp.erase(i);
            }
        }
    }
}
