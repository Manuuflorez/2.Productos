/*Leer la cantidad de unidades y el valor unitario de un producto 
y luego imprimir su valor bruto, el IVA, el descuento y el valor 
neto (utilizar para cada uno un método) sabiendo que se cobra el 
IVA este es del 10 por ciento sobre el valor bruto y tiene un 
descuento dependiendo de la cantidad de unidades así: si es menor 
de 20 unidades se le da un descuento del 12% sobre el valor básico, 
del 20% si la cantidad esta entre 20 y 50 unidades y del 25% si es
mayor de 50 unidades. Utilizar clases y funciones para realizar la tarea.
 */
package pkg2.productos;

public class Operaciones {

    int CantUnidades;
    int CostoProducto;

    public Operaciones(int CantUnidades, int CostoProducto) {
        this.CantUnidades = CantUnidades;
        this.CostoProducto = CostoProducto;
    }

    public int ValorBruto() {
        int valorBruto = this.CostoProducto * this.CantUnidades;
        return valorBruto;
    }

    public int IVA() {
        int masIva = (ValorBruto() * 10) / 100;
        return masIva;
    }

    public int Descuento() {
        int descuento;
        if (CantUnidades < 20) {
            descuento = ((ValorBruto() - IVA()) * 12) / 100;
        } else if (this.CantUnidades >= 20 && this.CantUnidades < 50) {
            descuento = ((ValorBruto() - IVA()) * 20) / 100;
        } else {
            descuento = ((ValorBruto() - IVA()) * 25) / 100;
        }
        return descuento;
    }

    public int ValorNeto() {
        int valorNeto = ValorBruto() - Descuento();
        return valorNeto;
    }
}
