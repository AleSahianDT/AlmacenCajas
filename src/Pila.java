import java.util.Stack;

public class Pila {
    private Stack <Caja> almacenamiento;

    public Pila() {
        almacenamiento = new Stack<Caja>();
    }

    public boolean estaVacia(){
        return almacenamiento.empty();
    }

    public void apilar(String nombre, String contenido,String numero){
        almacenamiento.push(new Caja(nombre, contenido, numero));
    }

    public Caja desapilar() throws Exception {
        if (estaVacia())
            throw new Exception("No hay elementos");
        return almacenamiento.pop();
    }

    public Caja cima() throws Exception{
        if (estaVacia())
            throw new Exception("No hay elementos");
        return almacenamiento.peek();
    }

    public int buscarElemento(String codigo) throws Exception {
        if (estaVacia())
            throw new Exception("No hay elementos");
        for (int i = almacenamiento.size() - 1; i >= 0; i--) {
            if (almacenamiento.get(i).getCodigo().equals(codigo));
            return i;
        }
        throw new Exception("Caja no encontrada");
    }

    @Override
    public String toString(){
        String mensaje = "";
        for (int i = almacenamiento.size()-1; i>= 0; i--){
            mensaje += almacenamiento.get(i)+ "\n";
        }
        return mensaje;
    }

    public int getTamaño(){
        return almacenamiento.size();
    }

}
