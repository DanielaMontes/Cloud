
import java.util.Scanner ;

public class promedio {
public static void main (String[]args) {
int cal1, cal2, cal3,suma,promedio ;

Scanner entrada = new Scanner (System.in) ;

System.out.println ("Ingrese calificacion 1" ;
cal1 = entrada.nextInt() ;

System.out.println ("Ingrese calificacion 2" ;
cal2 = entrada.nextInt() ;

System.out.println ("Ingrese calificacion 3" ;
cal3 = entrada.nextInt() ;

suma = (cal1 + cal2 + cal3) ;
promedio = (suma/3) ;

if (promedio >= 7) {
System.out.println ("El estudiante aprobó con un promedio de: " +promedio ) ;
}
else {
System.out.println ("El estudiante no aprobó, el promedio es de: " +promedio ) ;
}
}
}
