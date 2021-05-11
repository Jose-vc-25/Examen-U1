import java.util.Scanner;
class Ejercicio03{
  static Scanner teclado=new Scanner(System.in);
  static void ejerciccio03JVC(){
    //Inicio
    System.out.println("Campaña de vacunacion");
    //Introduccion de datos 
    String sexo, vacuna;
    int años;
    try{
   System.out.println("Introducir letra que defina su sexo:\nH=Hombre\nM=Mujer");
   sexo=teclado.next();
   System.out.println("edad");
   años=teclado.nextInt();
   //Proceso
   if(sexo.equals("H") && años>=70){
     vacuna="A";
    }else if(sexo.equals("M") && años>=70){
     vacuna="C";
    }else if(sexo.equals("H") && años<=69 && años>=16){
     vacuna="A";
    }else if(sexo.equals("H") && años<16){
      vacuna="A";
    }else if(sexo.equals("M") && años<16){
      vacuna="A";
    }else{
      if(sexo.equals("M") && años<=69 && años>=16){
        vacuna="B";
      }else{
        vacuna="Vuelve a introducir su edad";
      }
      }
      System.out.println("Recibira la vacuna: "+vacuna);
      }catch(Exception e){
        System.out.println("Error al ingresar datos, ingrese de nuevo");
      }
      }
      public static void main(String[] arg){
        ejerciccio03JVC();
      }
    }

        

   
   
  

    


