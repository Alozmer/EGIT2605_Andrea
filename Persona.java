public class Persona {
	
	    private String nombre;
	    private String apellidos;
	    private int edad;

	    //Constructor
	    public entradaPersona (){
	        nombre = "";
	        apellidos = "";
	        edad = 0;
	    }
	    
	    public void setnombre (String valornombre){
	        nombre = "nombre" + valornombre; 
	    }
	    public void setapellidos (String valorapellidos){
	        apellidos = "apellidos" + valorapellidos;
	    }
	    
	    public void setedad (int valoredad){
	        edad = valoredad;
	    }
	    
	    public void cumpleanyos (int valoredad) {
	    	edad = valoredad +1;
	    }
	   
	    public String getnombre (){ 
	    	return nombre; 
	    }
	  
	    public String getapellidos () { 
	    	return apellidos; 
	    } 
	    
	    public int getedad () { 
	    	return edad; 
	    } 
	}
	public static void DatosPersona {
		System.out.println("El nombre es: " + nombre);
		System.out.println("Los apellidos son " + apellidos);
		System.out.println("La edad es " + edad);
	}
}