package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Persona;
import vista.Interfaz;

public class Controlador implements ActionListener {

	private Interfaz ventana;
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
System.out.println("Boton pulsado");
		String nombreTMP=ventana.getNombre().getText();
		int edadTMP=Integer.parseInt(ventana.getEdad().getText());
		String telefonoTMP=ventana.getTelefono().getText();
		boolean solteroTMP=ventana.getSoltero().isSelected();
		Persona persona = new Persona(nombreTMP, edadTMP,telefonoTMP,solteroTMP);
		
		ventana.getResultado().setText(persona.toString());
		
	}

	public void setInterfaz(Interfaz ventana) {
		this.ventana=ventana;
	}

}
