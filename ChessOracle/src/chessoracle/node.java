
package chessoracle;


public class node {
    private Object value;
    private node next = null;
    
    public node(Object value, node next) {
        this.value = value;
        this.next = next;
    }

    public node() {
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }
    
    public boolean hasNext(){
        if(next!=null){
            return true;
        }
        return false;
    }
}
