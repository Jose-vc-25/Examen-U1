import java.util.Scanner;
class Ejercicio01{
  static Scanner teclado=new Scanner(System.in);
  static void ejercicio01JVC(){
    //Inicio
    System.out.println("Nota Final");
    //Introduccionde datos
    double nota_u1, nota_u2, nota_u3, trabajo_final, nota_final=0;
    System.out.println("Ingrese nota de la primera unidad:");
    nota_u1 = teclado.nextDouble();
    System.out.println("Ingrese nota de la segunda unidad:");
    nota_u2 = teclado.nextDouble();
    System.out.println("Ingrese nota de la tercera unidad:");
    nota_u3 = teclado.nextDouble();
    System.out.println("Ingrese nota del trabajo final:");
    trabajo_final = teclado.nextDouble();
    //Proceso
   nota_final=(nota_u1*0.20)+(nota_u2*0.15)+(nota_u3*0.15)+(trabajo_final*0.50);

    System.out.println("Su promedio es: "+nota_final);


  }
  public static void main(String[] arg){
  ejercicio01JVC();
  }
}