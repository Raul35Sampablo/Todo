public class OperadoresAritmeticos {
  public static void main(String args[]){
    
   int numero_uno = 4;    //El primer numero es 4
   int numero_dos = 4;    //El segundo numero es 4
   int resultado  = 0;    //El resultado comenzara desde cero

   resultado = numero_uno + numero_dos / 2;              //Como el programa lo lee de derecha a izquierda
                                                         //primero va a dividir el numero 2 y despues lo 
                                                         //sumara con el numero uno.
   
   System.out.println("El resultado incorrecto es:" + resultado);   //Le decimos a la consola que muestre el resultado

   resultado = (numero_uno + numero_dos) / 2;
   System.out.println("El resultado correcto es:" +  resultado);
  }
}


