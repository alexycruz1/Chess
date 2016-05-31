
package chessoracle;


public class nodo_arbol {
    private Object value = null;
    private nodo_arbol padre = null;
    Lista hijos = new Lista();
    
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
    
    public nodo_arbol getLefterSon() {
        return (nodo_arbol)this.hijos.getHead();
    }
    
    public nodo_arbol getParent() {
        return padre;
    }
    
    public void setParent(nodo_arbol nodo) {
        this.padre = nodo;
    }
    
    public nodo_arbol getRightBrother() {
        nodo_arbol papa = this.getParent();
        Lista temp = papa.hijos;
        nodo_arbol temp2 = null;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.at(i).equals(this)) {
                if (i + 1 == temp.size()) {
                    temp2 = (nodo_arbol)temp.at(i);
                }else{
                    temp2 = (nodo_arbol)temp.at(i + 1);
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
    public int profundidad(){
        int cont=0;
        nodo_arbol temp=this;
        while(temp!=null){
            temp = temp.getParent();
            cont++;
        }
        return cont;
    }
    public Lista path(){
        Lista camino= new Lista();
        
        nodo_arbol temp=this;
        
        while(temp!=null){
            camino.push_back(temp.getValue());
            temp = temp.getParent();
            
        }
        return camino;
    }
}
