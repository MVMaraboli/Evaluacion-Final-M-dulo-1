/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acitividades_curso.evaluacionfinalmodulo_1;

/**
 *
 * @author Leon DeBurgh
 */
public class electrodomestico {
    protected double precio_Base;
    protected double peso;
    protected String Color,consumoE,desc;

    public double getPrecio_Base() {
        return precio_Base;
    }

    public void setPrecio_Base(double precio_Base) {
        this.precio_Base = precio_Base;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(String consumoE) {
        this.consumoE = consumoE;
    }
    
    public String getdesc() {
        return desc;
    }

    public void setdesc(String desc) {
        this.desc = desc;
    }

    public electrodomestico(double precio_Base, double peso, String Color, String consumoE,String desc) {
        this.precio_Base = precio_Base;
        this.peso = peso;
        this.Color = Color;
        this.consumoE = consumoE;
        this.desc = desc;
    }
    
    public electrodomestico() {
       super(); 
    }
    
}
