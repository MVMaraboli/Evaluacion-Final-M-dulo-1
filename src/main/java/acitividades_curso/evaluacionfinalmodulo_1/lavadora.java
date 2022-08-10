/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acitividades_curso.evaluacionfinalmodulo_1;

/**
 *
 * @author Leon DeBurgh
 */
public class lavadora extends electrodomestico{
    double carga;

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public lavadora() {
        super();
    }

    public lavadora(double carga) {
        this.carga = carga;
    }

    public lavadora(double carga, int precio_Base, double peso, String Color, String consumoE,String desc) {
        super(precio_Base, peso, Color, consumoE,desc);
        this.carga = carga;
        this.desc = "Lavadora "+desc;
    }
    
    
    
}
