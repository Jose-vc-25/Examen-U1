import java.util.Scanner;
class Ejercicio04{
  static Scanner teclado=new Scanner(System.in);
  static void ejecicio04JVC(){
    //Inicio
    System.out.println("Hola");
    //Introduccion de datos
    String operacion;
    double num1, num2, resultado=0;
    System.out.println("Ingresar primer dato: ");
    num1=teclado.nextDouble();
    System.out.println("Ingresar segundo dato: ");
    num2=teclado.nextDouble();
    System.out.println("Que operacion va realizar?\n  +=Suma\n-=Resta\n*=Multiplicacion\n/=Division\n^=Potencia");
    operacion=teclado.next();
    //Proceso
    switch(operacion){
      case "+":{
        resultado=(num1)+(num2);
      }break;
      case "-":{
        resultado=(num1)-(num2);
      }break;
      case "*":{
        resultado=(num1)*(num2);
      }break;
      case "/":{
        resultado=(num1)/(num2);
      }break;
      case "^":{
          resultado=num1;
          for(double i = 1; i < num2; i++){
          resultado=resultado*num1;
        }
      }break;
      default:{System.out.println("Vulelve a ingreas los datos"); }break;
    }

    System.out.println("resultado: "+resultado);
  }
  public static void main(String[] arg){
      ejecicio04JVC();
  }

  }