import javax.swing.JOptionPane;

public class Farmacia {
     //ATRIBUTOS
    private Medicamento stock[];//definir array
    private int cantidad;//CONTADOR DE MEDICAMENTOS
    
    //CONSTRUCTOR
    public Farmacia(){
        stock = new Medicamento[10];//asignar espacio de memoria para el array
        cantidad =0;
        
          
    }
    
    //METODOS
    public void addMedicamento(){
        stock[cantidad]= new Medicamento(cantidad);//instancia del medicamento
        cantidad++;
    }
    
    public void listarMedicamentos(){
        String datos=" Lista medicamentos: \n";
        for(int i=0;i<cantidad;i++){
        	datos+=stock[i].getMedicamento();
        }JOptionPane.showMessageDialog(null, datos);
    }

    public void eliminarmedicamento(){
        	
    	String datos=" Lista medicamentos: \n";
        for(int i=0;i<cantidad;i++){
        datos+=stock[i].getMedicamento();
        }
        int cod=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del medicamento a eliminar \n \n"+datos));
        int pos=BuscarMedicamento(cod);
        if(pos!=-1) {
        	
        	stock[pos].setEstado(0);
        	
        	for(int i=pos; i<cantidad; i++) {
        		
        		if(i+1<=cantidad) {
        			stock[i]=stock[i+1];
            		if(stock[i]!=null) {
            			stock[i].setCodigo(i);
            		}
        		}
        	}
        	cantidad=cantidad-1;
        	
        }else {JOptionPane.showMessageDialog(null, "Codigo no valido");}
    	
     }
    public String venderMedicamento() {
    	
    	String datos=" Lista medicamentos: \n";
        for(int i=0;i<cantidad;i++){
        datos+=stock[i].getMedicamento();
        }
        String venta="Agotado";
        int cod=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del medicamento a vender \n \n"+datos));
        int pos=BuscarMedicamento(cod);
        if(pos!=-1) {
        	
        	if(stock[pos].getEstado()==1) {
        		venta= "Codigo Medicamento: "+pos+" Precio: "+stock[pos].getCosto();
            	
            	int estado=JOptionPane.showConfirmDialog(null," ¿Este medicamento se agotara despues de esta venta ?");
            	
            	if(estado==0) {
            		
            		JOptionPane.showMessageDialog(null,"El medicamento se ha agotado, por lo cual sera marcado como no disponible en el stock");
            		stock[pos].setEstado(0);
            	}
            	if(estado==2) {
            		JOptionPane.showMessageDialog(null,"El medicamento no se ha agotado, por lo cual sera marcado como  disponible en el stock");
            		stock[pos].setEstado(1);
            	}
        	}else{JOptionPane.showMessageDialog(null, "Producto agotado");}
        	
        }else {JOptionPane.showMessageDialog(null, "Codigo no valido");}
        
        return venta;
    	
    }
        
    public void editarmedicamento(){
        	
        	
        	String datos=" Lista medicamentos: \n";
            for(int i=0;i<cantidad;i++){
            datos+=stock[i].getMedicamento();
            }
            int cod=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del medicamento a editar \n \n"+datos));
            int pos=BuscarMedicamento(cod);
            if(pos!=-1) {
            	
            	stock[pos]=new Medicamento(pos);
            	
            }else {JOptionPane.showMessageDialog(null, "Codigo no valido");}
        }
    
    public int BuscarMedicamento(int codigo) {
        	
        	int bandera= -1;
        	for(int i=0; i<cantidad; i++) {
        		
        		if(stock[i].getCodigo()==codigo) {
        			
        			bandera=i;
        			
        		}
        		
        	}
        	return bandera;
        }
        
}