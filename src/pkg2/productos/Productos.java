
package pkg2.productos;

import java.util.Scanner;

/*Leer la cantidad de unidades y el valor unitario de un producto 
y luego imprimir su valor bruto, el IVA, el descuento y el valor 
neto (utilizar para cada uno un método) sabiendo que se cobra el 
IVA este es del 10 por ciento sobre el valor bruto y tiene un 
descuento dependiendo de la cantidad de unidades así: si es menor 
de 20 unidades se le da un descuento del 12% sobre el valor básico, 
del 20% si la cantidad esta entre 20 y 50 unidades y del 25% si es
mayor de 50 unidades. Utilizar clases y funciones para realizar la tarea.
*/
public class Productos {

    public static void main(String[] args) {
        
        System.out.println("Cuantas unidades va a llevar?");
        int CantUnidades = new Scanner(System.in).nextInt();
        System.out.println("Que costo tiene el producto?");
        int CostoProducto=new Scanner(System.in).nextInt();
        Operaciones objOperaciones=new Operaciones(CantUnidades,CostoProducto);
        System.out.println("El valor bruto es: "+objOperaciones.ValorBruto());
        System.out.println("La adicion del iva teniendo en cuenta el valor total es de: "+objOperaciones.IVA());
        System.out.println("Tienes un descuento del 12% por comprar hasta 19 unidades, 20% por comprar entre 20 y 50 y 25% por comprar más de 50, en tu caso tienes un descuento de: "+objOperaciones.Descuento());
        System.out.println("En total debes pagar: "+objOperaciones.ValorNeto());
        
    }
    
}
