/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acitividades_curso.evaluacionfinalmodulo_1;

/**
 *
 * @author Leon DeBurgh
 */
public class television extends electrodomestico{
    private int resolucion;
    private boolean sintonizador;
    

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public television() {
        super();
    }

    public television(int resolucion, boolean sintonizador, int precio_Base, double peso, String Color, String consumoE, String desc) {
        super(precio_Base, peso, Color, consumoE, desc);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
        this.desc = "Televisor "+desc;
    }

    public television(int resolucion, boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }
            
}
