// Classe que representa um nó do tipo genérico
public class No<T> {

    private T elemento; //elemento vai guardar um valor de qualquer tipo
    private No<T> proximo;
    
    // Construtores
    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }
    
    
    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }


    public T getElemento() {
        return elemento;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    public No<T> getProximo() {
        return proximo;
    }
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }


}
