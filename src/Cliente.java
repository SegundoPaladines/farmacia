
public class Cliente {
    
     ///atributos
    private int id;
    private String nombre;
    private int telefono;
    
    public Cliente(){
    
    }
    
    public String Datoscliente(){
       String cliente="";
       cliente=cliente+" Id: "+this.id+" Nommbre: "+this.nombre+" Telefono: "+this.telefono+"\n";
       return cliente;
    }
    public void setDatoscliente(int id, String nombre, int telefono){
        this.id=id;
        this.nombre=nombre;
        this.telefono=telefono;
    
    }
}