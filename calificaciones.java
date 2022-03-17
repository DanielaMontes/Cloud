
import java.util.Scanner ;

public class promedio {
public static void main (String[]args) {
int cal1;
int cal2; 
int cal3;
int suma;
int promedio ;

Scanner entrada = new Scanner (System.in) ;

System.out.println ("Ingrese calificacion 1" ;
cal1 = entrada.nextInt() ;

System.out.println ("Ingrese nota 2" ;
cal2 = entrada.nextInt() ;

System.out.println ("Ingrese nota 3" ;
cal3 = entrada.nextInt() ;

suma = (cal1 + cal2 + cal3) ;
promedio = (suma/3) ;

if (promedio >= 7) {
System.out.println ("El estudiante aprovo con un promedio de: " +promedio ) ;
}
else {
System.out.println ("El estudiante no aprovo, el promedio es de: " +promedio ) ;
}
}
}