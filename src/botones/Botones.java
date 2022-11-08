

package botones;


public class Botones {
      private static frmFormulario formulario;
      private static Persona persona[];
      private static int contador;
      
   
    public static void main(String[] args) {
       formulario = new frmFormulario();
       persona = new  Persona[100];
       
        for (int i = 0; i < 100; i++) {
          persona[i]= new Persona();
          
        }
       contador = 0;
       formulario.setVisible(true);
    }
  
    
    public static void guardar(String n,String a,String c,int cel){
        //Estamos creando 4 variables 
        //Nombre n,Apellido a,Correo c,Celular cel.
        persona[contador].setNombre(n);
        persona[contador].setApellido(a);
        persona[contador].setCorreo(c);
        persona[contador].setCelular(cel);
        
        contador++;
    }
    public static void buscar(String bus){
        //Creamos la variable Buscar
        for (int j = 0; j < persona.length; j++) {
            if(persona[j].getNombre().equals(bus)){
                formulario.cargardatos(persona[j]);
             }
        }
    }
    javax.swing.JButton btnSalir;

    void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {
    }
}
