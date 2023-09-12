import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppFarmacia {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		Farmacia f1= new Farmacia();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		String ventas= "Lista de ventas: \n\n ";
		int opcion= Integer.parseInt(JOptionPane.showInputDialog("*********** FARMACIA *********** \n\n"
				+ "SELECCIONE UNA OPCION \n"+
				"1. AÑADIR MEDICAMENTOS \n"+
				"2. LISTA DE MEDICAMENTOS \n"+
				"3. EDITAR MEDICAMENTOS \n"+
				"4. ELIMINAR MEDICAMENTOS \n"+
				"5. LISTAR CLIENTES \n"+
				"6. VENTAS MEDICAMENTOS \n"+
				"7. VENDER MEDICAMENTO \n"+
				"8. Salir"));
		
		if(opcion>0 & opcion<=8) {
			while(opcion>0 & opcion<=7){
				
				switch(opcion) {
					
					case 1:
						
						f1.addMedicamento();
						
						break;
						
					case 2:
						
						f1.listarMedicamentos();
						
						break;
					case 3:
						
						f1.editarmedicamento();
						
						break;
					case 4:
						
						f1.eliminarmedicamento();
						
						break;
					case 5:
						
						String impresion= "Lista de clientes: \n\n";
						for(int i=0; i<clientes.size(); i++) {
							
							impresion=impresion+clientes.get(i).Datoscliente();
						}
						JOptionPane.showMessageDialog(null, impresion);
						break;
					case 6:

						JOptionPane.showMessageDialog(null, "Reporte de ventas \n\n"+ventas);
						
						break;
					case 7: 
						
						String venta =f1.venderMedicamento();
						if(venta.equals("Agotado")) {}
						else {
							Cliente c1 = new Cliente();
							String nombre= JOptionPane.showInputDialog("Ingrese el nombre del comprador");
							int telefono= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono del cliente"));
							int id= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del cliente"));
							c1.setDatoscliente(id, nombre, telefono);
							clientes.add(c1);
							venta=venta+" Datos del cliente: "+c1.Datoscliente();
							JOptionPane.showMessageDialog(null, "Reporte de venta \n\n"+venta);
							ventas=ventas+venta;
						}
						
						break;
						
						
						default: JOptionPane.showMessageDialog(null, "Hasta la proxima");
						
				
				}
				
				
				opcion= Integer.parseInt(JOptionPane.showInputDialog("*********** FARMACIA *********** \n\n"
						+ "SELECCIONE UNA OPCION \n"+
						"1. AÑADIR MEDICAMENTOS \n"+
						"2. LISTA DE MEDICAMENTOS \n"+
						"3. EDITAR MEDICAMENTOS \n"+
						"4. ELIMINAR MEDICAMENTOS \n"+
						"5. LISTAR CLIENTES \n"+
						"6. VENTAS MEDICAMENTOS \n"+
						"7. VENDER MEDICAMENTO \n"+
						"8. Salir"));
			}
		}else {JOptionPane.showMessageDialog(null, "entrada no valida");}
		JOptionPane.showMessageDialog(null, "FIN PROGRAMA");

	}

}
