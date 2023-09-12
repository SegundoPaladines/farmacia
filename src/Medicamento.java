import javax.swing.JOptionPane;

public class Medicamento {
     //Atributos
    private String descripcion;
    private int codigo, costo, estado;
    
    //CONSTRUCTOR
    
    public Medicamento(int codigo){
        this.codigo=codigo;
        descripcion=  JOptionPane.showInputDialog("INGRESAR DESCRIPCION DEL MEDICAMENTO");
        costo = Integer.parseInt(JOptionPane.showInputDialog("INGRESAR COSTO DE MEDICAMENTO"));
        estado = 1; //1 --> disponible, 0 --> no disponible
  
    }
    
    public String getMedicamento(){
        String state[]= {"No disponible", "Disponible"};
        return"\n Codigo:  " +codigo+ " Descripcion:  " +descripcion+""+ " Costo:   " +costo+ " Estado:  "+state[estado];

    }
    public void setEstado(int estado){
        this.estado=estado;
    }
    public int getEstado() {
    	return estado;
    }
    public int getCodigo() {
    	return this.codigo;
    }
    public void setCodigo(int codigo) {
    	this.codigo=codigo;
    }
    public int getCosto() {
    	return this.costo;
    }
}