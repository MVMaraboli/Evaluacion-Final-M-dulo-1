/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package acitividades_curso.evaluacionfinalmodulo_1;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Leon DeBurgh
 */
public class EvaluacionFinalModulo_1 {
    static final ArrayList<String> aEf = new ArrayList<>(llenar_aEf());
    static final ArrayList<Integer> aPr = new ArrayList<>(llenar_aPr());
    static final ArrayList<Double> aCapD = new ArrayList<>(llenar_aCapD());
    static final ArrayList<Double> aCapH = new ArrayList<>(llenar_aCapH());
    static final ArrayList<Integer> aCos = new ArrayList<>(llenar_aCos());
    static final ArrayList<String> aColor = new ArrayList<>(llenar_aColor());
    
    static final int precioBase=100000;
    static final String defaultColor=aColor.get(0);
    static final double precioFinaL=0,IndexCar=30.0;
    static final int CxP=50000,nSint=20000,precioRes=0,porcRes=30,resLimit=40;
    public static ArrayList<electrodomestico> Objetos = new ArrayList<>();
    public static String[][] aElectrod = new String[10][8];
    
    public static void main(String[] args) {
        String xSint;
        int xSuma;
        
        electrodomestico generico1 = new electrodomestico(12000,1.8,aColor.get(3),aEf.get(0),"Cafetera Oster");
        Objetos.add(generico1);  //0
        
        electrodomestico generico2 = new electrodomestico(160000,45,defaultColor,aEf.get(1),"Refrigerador LG No Frost");
        Objetos.add(generico2);  //1
        
        lavadora washmachine = new lavadora(44,precioBase,67,aColor.get(4),aEf.get(0),"Automática Samsung");
        Objetos.add(washmachine); //2
        
        television fhdSmartTV32 = new television(32,false,99990,5,aColor.get(1),aEf.get(0),"Master G HD");
        Objetos.add(fhdSmartTV32); //3
        
        lavadora washmachine2 = new lavadora(9,precioBase,32,defaultColor,aEf.get(2),"Automática LG");
        Objetos.add(washmachine2); //4

        television fhdSmartTV50 = new television(50,true,299990,8,aColor.get(1),aEf.get(0),"AKAI Full HD");
        Objetos.add(fhdSmartTV50);  //5
        
        electrodomestico generico3 = new electrodomestico(22000,2.6,defaultColor,aEf.get(5),"Calefactor Eléctrico de Pared Haier");
        Objetos.add(generico3);  //6
        
        television fhdSmartTV43 = new television(43,true,129990,7,aColor.get(1),aEf.get(3),"AKAI Full HD");
        Objetos.add(fhdSmartTV43);  //7
        
        electrodomestico generico4 = new electrodomestico(260000,62,defaultColor,aEf.get(2),"Refrigerador Samsung No Frost Side by Side");
        Objetos.add(generico4);  //8
        
        electrodomestico generico5 = new electrodomestico(90000,3.5,defaultColor,aEf.get(1),"Reproductor de Vinilo AKAI");
        Objetos.add(generico5);  //9
        
        System.out.println("Lista de Productos");
        System.out.println("====================================================================================================================");
        
        aElectrod[0][0] = (generico1.getdesc()+" Color " + generico1.getColor() + " Consumo " + comprobarConsumoEnergetico(generico1.getConsumoE(),aEf,aPr) + " Peso " + String.valueOf(generico1.getPeso()) + " KG.");
        aElectrod[0][1] = String.valueOf(generico1.getPrecio_Base());
        aElectrod[0][2] = precioConsumoEnergetico(generico1.getConsumoE(),aEf,aPr);
        aElectrod[0][3] = precioPorPeso(String.valueOf(generico1.getPeso()),aCapD,aCapH,aCos); 
        aElectrod[0][4] = precioxCarga("0"); // Precio por carga    
        aElectrod[0][5] = "0.0"; // Precio por Resolucion
        aElectrod[0][6] = "0.0"; // Precio por FHD
        aElectrod[0][7] = Sume(aElectrod[0][1],aElectrod[0][2],aElectrod[0][3],aElectrod[0][4],aElectrod[0][5],aElectrod[0][6]);
        
        aElectrod[1][0] = (generico2.getdesc()+" Color " + generico2.getColor() + " Consumo " + comprobarConsumoEnergetico(generico2.getConsumoE(),aEf,aPr) + " Peso " + String.valueOf(generico2.getPeso()) + " KG.");
        aElectrod[1][1] = String.valueOf(generico2.getPrecio_Base());
        aElectrod[1][2] = precioConsumoEnergetico(generico2.getConsumoE(),aEf,aPr);
        aElectrod[1][3] = precioPorPeso(String.valueOf(generico2.getPeso()),aCapD,aCapH,aCos); 
        aElectrod[1][4] = precioxCarga("0"); // Precio por carga    
        aElectrod[1][5] = "0.0"; // Precio por Resolucion
        aElectrod[1][6] = "0.0"; // Precio por FHD
        aElectrod[1][7] = Sume(aElectrod[1][1],aElectrod[1][2],aElectrod[1][3],aElectrod[1][4],aElectrod[1][5],aElectrod[1][6]);
        
        
        aElectrod[2][0] = (washmachine.getdesc()+" Color " + washmachine.getColor()+" Capacidad de Carga " + String.valueOf(washmachine.getCarga()) + " KG. Consumo " + comprobarConsumoEnergetico(washmachine.getConsumoE(),aEf,aPr) + " Peso " + String.valueOf(washmachine.getPeso()) + " KG.");
        aElectrod[2][1] = String.valueOf(washmachine.getPrecio_Base());
        aElectrod[2][2] = precioConsumoEnergetico(washmachine.getConsumoE(),aEf,aPr);
        aElectrod[2][3] = precioPorPeso(String.valueOf(washmachine.getPeso()),aCapD,aCapH,aCos); 
        aElectrod[2][4] = precioxCarga(String.valueOf(washmachine.getCarga()));
        aElectrod[2][5] = "0.0"; // Precio por Resolucion
        aElectrod[2][6] = "0.0"; // Precio por FHD
        aElectrod[2][7] = Sume(aElectrod[2][1],aElectrod[2][2],aElectrod[2][3],aElectrod[2][4],aElectrod[2][5],aElectrod[2][6]);
        
        if(fhdSmartTV32.isSintonizador()){
            xSint=" Sintonizador Digital ";
        }else{
            xSint=" ";
        }
        aElectrod[3][0] = (fhdSmartTV32.getdesc()+" Resolución " + String.valueOf(fhdSmartTV32.getResolucion()) + xSint + "Pulgadas Color " + fhdSmartTV32.getColor()+" Consumo " + comprobarConsumoEnergetico(fhdSmartTV32.getConsumoE(),aEf,aPr) + " Peso " + String.valueOf(fhdSmartTV32.getPeso()) + " KG.");
        aElectrod[3][1] = String.valueOf(fhdSmartTV32.getPrecio_Base());
        aElectrod[3][2] = precioConsumoEnergetico(fhdSmartTV32.getConsumoE(),aEf,aPr);
        aElectrod[3][3] = precioPorPeso(String.valueOf(fhdSmartTV32.getPeso()),aCapD,aCapH,aCos); 
        aElectrod[3][4] = precioxCarga("0.0");
        aElectrod[3][5] = String.valueOf(precioxResolucion(fhdSmartTV32.getPrecio_Base(),fhdSmartTV32.getResolucion()));  // Precio por Resolucion
        aElectrod[3][6] = String.valueOf(PrecioxFHD(fhdSmartTV32.isSintonizador())); // Precio por FHD
        aElectrod[3][7] = Sume(aElectrod[3][1],aElectrod[3][2],aElectrod[3][3],aElectrod[3][4],aElectrod[3][5],aElectrod[3][6]);
        
        aElectrod[4][0] = (washmachine2.getdesc()+" Color " + washmachine2.getColor()+" Capacidad de Carga " + String.valueOf(washmachine2.getCarga()) + " KG. Consumo " + comprobarConsumoEnergetico(washmachine2.getConsumoE(),aEf,aPr) + " Peso " + String.valueOf(washmachine2.getPeso()) + " KG.");
        aElectrod[4][1] = String.valueOf(washmachine2.getPrecio_Base());
        aElectrod[4][2] = precioConsumoEnergetico(washmachine2.getConsumoE(),aEf,aPr);
        aElectrod[4][3] = precioPorPeso(String.valueOf(washmachine2.getPeso()),aCapD,aCapH,aCos); 
        aElectrod[4][4] = precioxCarga(String.valueOf(washmachine2.getCarga()));
        aElectrod[4][5] = "0.0"; // Precio por Resolucion
        aElectrod[4][6] = "0.0"; // Precio por FHD
        aElectrod[4][7] = Sume(aElectrod[4][1],aElectrod[4][2],aElectrod[4][3],aElectrod[4][4],aElectrod[4][5],aElectrod[4][6]);
        
        if(fhdSmartTV50.isSintonizador()){
            xSint=" Sintonizador Digital";
        }else{
            xSint=" ";
        }
        aElectrod[5][0] = (fhdSmartTV50.getdesc()+" Resolución " + String.valueOf(fhdSmartTV50.getResolucion()) + "Pulgadas Color " + fhdSmartTV50.getColor()+ xSint  +" Consumo " + comprobarConsumoEnergetico(fhdSmartTV50.getConsumoE(),aEf,aPr) + " Peso " + String.valueOf(fhdSmartTV50.getPeso()) + "  KG.");
        aElectrod[5][1] = String.valueOf(fhdSmartTV50.getPrecio_Base());
        aElectrod[5][2] = precioConsumoEnergetico(fhdSmartTV50.getConsumoE(),aEf,aPr);
        aElectrod[5][3] = precioPorPeso(String.valueOf(fhdSmartTV50.getPeso()),aCapD,aCapH,aCos); 
        aElectrod[5][4] = "0.0";
        aElectrod[5][5] = String.valueOf(precioxResolucion(fhdSmartTV50.getPrecio_Base(),fhdSmartTV50.getResolucion()));  // Precio por Resolucion
        aElectrod[5][6] = String.valueOf(PrecioxFHD(fhdSmartTV50.isSintonizador())); // Precio por FHD
        aElectrod[5][7] = Sume(aElectrod[5][1],aElectrod[5][2],aElectrod[5][3],aElectrod[5][4],aElectrod[5][5],aElectrod[5][6]);
        
        aElectrod[6][0] = (generico3.getdesc()+" Color " + generico3.getColor() + " Consumo " + comprobarConsumoEnergetico(generico3.getConsumoE(),aEf,aPr) + " Peso " + String.valueOf(generico3.getPeso()) + " KG.");
        aElectrod[6][1] = String.valueOf(generico3.getPrecio_Base());
        aElectrod[6][2] = precioConsumoEnergetico(generico3.getConsumoE(),aEf,aPr);
        aElectrod[6][3] = precioPorPeso(String.valueOf(generico3.getPeso()),aCapD,aCapH,aCos); 
        aElectrod[6][4] = precioxCarga("0"); // Precio por carga    
        aElectrod[6][5] = "0.0"; // Precio por Resolucion
        aElectrod[6][6] = "0.0"; // Precio por FHD
        aElectrod[6][7] = Sume(aElectrod[6][1],aElectrod[6][2],aElectrod[6][3],aElectrod[6][4],aElectrod[6][5],aElectrod[6][6]);
        
        if(fhdSmartTV43.isSintonizador()){
            xSint=" Sintonizador Digital";
        }else{
            xSint=" ";
        }
        aElectrod[7][0] = (fhdSmartTV43.getdesc()+" Resolución " + String.valueOf(fhdSmartTV43.getResolucion()) + "Pulgadas Color " + fhdSmartTV43.getColor()+ xSint  +" Consumo " + comprobarConsumoEnergetico(fhdSmartTV43.getConsumoE(),aEf,aPr) + " Peso " + String.valueOf(fhdSmartTV43.getPeso()) + "  KG.");
        aElectrod[7][1] = String.valueOf(fhdSmartTV43.getPrecio_Base());
        aElectrod[7][2] = precioConsumoEnergetico(fhdSmartTV43.getConsumoE(),aEf,aPr);
        aElectrod[7][3] = precioPorPeso(String.valueOf(fhdSmartTV43.getPeso()),aCapD,aCapH,aCos); 
        aElectrod[7][4] = "0.0";
        aElectrod[7][5] = String.valueOf(precioxResolucion(fhdSmartTV43.getPrecio_Base(),fhdSmartTV43.getResolucion()));  // Precio por Resolucion
        aElectrod[7][6] = String.valueOf(PrecioxFHD(fhdSmartTV43.isSintonizador())); // Precio por FHD
        aElectrod[7][7] = Sume(aElectrod[7][1],aElectrod[7][2],aElectrod[7][3],aElectrod[7][4],aElectrod[7][5],aElectrod[7][6]);
        
        aElectrod[8][0] = (generico4.getdesc()+" Color " + generico4.getColor() + " Consumo " + comprobarConsumoEnergetico(generico4.getConsumoE(),aEf,aPr) + " Peso " + String.valueOf(generico4.getPeso()) + " KG.");
        aElectrod[8][1] = String.valueOf(generico4.getPrecio_Base());
        aElectrod[8][2] = precioConsumoEnergetico(generico4.getConsumoE(),aEf,aPr);
        aElectrod[8][3] = precioPorPeso(String.valueOf(generico4.getPeso()),aCapD,aCapH,aCos); 
        aElectrod[8][4] = precioxCarga("0"); // Precio por carga    
        aElectrod[8][5] = "0.0"; // Precio por Resolucion
        aElectrod[8][6] = "0.0"; // Precio por FHD
        aElectrod[8][7] = Sume(aElectrod[8][1],aElectrod[8][2],aElectrod[8][3],aElectrod[8][4],aElectrod[8][5],aElectrod[8][6]);
        
        aElectrod[9][0] = (generico5.getdesc()+" Color " + generico5.getColor() + " Consumo " + comprobarConsumoEnergetico(generico5.getConsumoE(),aEf,aPr) + " Peso " + String.valueOf(generico5.getPeso()) + " KG.");
        aElectrod[9][1] = String.valueOf(generico5.getPrecio_Base());
        aElectrod[9][2] = precioConsumoEnergetico(generico5.getConsumoE(),aEf,aPr);
        aElectrod[9][3] = precioPorPeso(String.valueOf(generico5.getPeso()),aCapD,aCapH,aCos); 
        aElectrod[9][4] = precioxCarga("0"); // Precio por carga    
        aElectrod[9][5] = "0.0"; // Precio por Resolucion
        aElectrod[9][6] = "0.0"; // Precio por FHD
        aElectrod[9][7] = Sume(aElectrod[9][1],aElectrod[9][2],aElectrod[9][3],aElectrod[9][4],aElectrod[9][5],aElectrod[9][6]);
        int contElec=1;
        int contLava=1;
        int contTV=1;
        double Total_El=0;
        double Total_LV=0;
        double Total_TV=0;
        
        for(int x=0;x<aElectrod.length;x++ ){
            contElec++;
            Total_El=Total_El+Double.parseDouble(aElectrod[x][7]);
            
            for(int y=0;y<8;y++){
                if(y==0 || y==7){
                    if(y==0){
                        Collator comparador = Collator.getInstance();
                        comparador.setStrength(Collator.PRIMARY);
                        
                        String cCad;
                        cCad=aElectrod[x][0].substring(0, 4);
                        System.out.println(cCad);
                        if(comparador.equals(cCad, "Lava")){
                            contLava++;
                            Total_LV=Total_LV+Double.parseDouble(aElectrod[x][7]);
                        }else{
                            if(comparador.equals(cCad, "Tele")){
                                contTV++;
                                Total_TV=Total_TV+Double.parseDouble(aElectrod[x][7]);
                            }
                        }
                        System.out.println("Descripción  : "+aElectrod[x][y]);
                    }else{
                        if(y==7){
                            System.out.println("Precio Final : "+aElectrod[x][y]);
                            
                        }
                    }    
                }
            }
            System.out.println("====================================================================================================================");
            
            
        }
        System.out.println("Suma Total de Los Electrodomésticos : $"+(Total_El));
        System.out.println("Suma Total de Las Lavadoras         : $"+(Total_LV));
        System.out.println("Suma Total de Los Televisores       : $"+(Total_TV));
        System.out.println("====================================================================================================================");
    }
    

    
    
    public static String Sume(String a,String b,String c,String d,String e,String f){
        String suma="0";
        double A,B,C,D,E,F,Sumame;
        A=Double.parseDouble(a);
        B=Double.parseDouble(b);
        C=Double.parseDouble(c);
        D=Double.parseDouble(d);
        E=Double.parseDouble(e);
        F=Double.parseDouble(f);
        Sumame=A+B+C+D+E+F;
        suma=String.valueOf(Sumame);
        return suma;
    }
    
    public static String precioxCarga(String xCarga){
        String PCarga="0";
        
        double PxC=Double.parseDouble(xCarga);
        
        
        if(PxC>IndexCar){
            PCarga=String.valueOf(CxP);
        } else {
            PCarga="0";
        }
        
        return PCarga;
    }
    
    public static String comprobarConsumoEnergetico(String cConsumo,ArrayList aEf,ArrayList aPr){
        String Letra="";
        String cResult;
        int i;
       
        
        for(i=0;i<aEf.size();i++){
            cResult = cConsumo;
            if(cResult == aEf.get(i)){
              Letra = cConsumo;
            } 
            
        }
        if (Letra.isEmpty()){
            Letra="F";
        }

        return Letra;
    }
    
    public static String precioConsumoEnergetico(String cConsumo,ArrayList aEf,ArrayList aPr){
        String Letra="";
        String cResult,cRecargoEE;
        int i,indice=0;
        //double nRecargoEE;
       
        
        for(i=0;i<aEf.size();i++){
            cResult = cConsumo;
            if(cResult == aEf.get(i)){
              Letra = cConsumo;
              indice=i;
              
            } 
            
        }
        if (Letra.isEmpty()){
            Letra="F";
            indice=5;
        }
        
        //nRecargoEE = aPr.get(indice);
        cRecargoEE = aPr.get(indice).toString();
        
        return cRecargoEE;
    }
    
    public static String precioPorPeso(String peso,ArrayList aCapD,ArrayList aCapH,ArrayList aCos){
        String precioP="0",caCapD,caCapH;
        int i,indice=0;
        double nPeso=Double.parseDouble(peso);
        double xCapD,xCapH;
        
        for(i=0;i<aCapD.size();i++){
            caCapD=aCapD.get(i).toString();
            caCapH=aCapH.get(i).toString();
            xCapD=Double.parseDouble(caCapD);
            xCapH=Double.parseDouble(caCapH);
            
            if(nPeso >= xCapD && nPeso<=xCapH){
        
                indice = i;
            }
        }
        
        if(indice>=0){
          precioP=String.valueOf(aCos.get(indice));
        }
        return precioP;
    }
    
    public static ArrayList llenar_aEf(){
        ArrayList aEf1 = new ArrayList();
        aEf1.add("A");
        aEf1.add("B");
        aEf1.add("C");
        aEf1.add("D");
        aEf1.add("E");
        aEf1.add("F");
    return aEf1;    
    }
    
    public static ArrayList llenar_aPr(){
        ArrayList aPr1 = new ArrayList();
        aPr1.add(20000);
        aPr1.add(18000);
        aPr1.add(16000);
        aPr1.add(14000);
        aPr1.add(12000);
        aPr1.add(10000);
    return aPr1;
    
    }
    public static ArrayList llenar_aCapD(){
        ArrayList aCap1 = new ArrayList();
        aCap1.add(0);
        aCap1.add(20);
        aCap1.add(50);
        aCap1.add(80);
    return aCap1;
    }
    public static ArrayList llenar_aCapH(){
        ArrayList aCap1 = new ArrayList();
        aCap1.add(19);
        aCap1.add(49);
        aCap1.add(79);
        aCap1.add(1000);
    return aCap1;
    }
    public static ArrayList llenar_aCos(){
        ArrayList aCos1 = new ArrayList();
        aCos1.add(5000);
        aCos1.add(8000);
        aCos1.add(10000);
        aCos1.add(15000);
    return aCos1;
    
    }
    public static ArrayList llenar_aColor(){
        ArrayList aColor1 = new ArrayList();
        aColor1.add("Blanco");
        aColor1.add("Negro");
        aColor1.add("Rojo");
        aColor1.add("Azul");
        aColor1.add("Gris");
    return aColor1;
    }
    
    public static double precioxResolucion(double precio_Base,int resolucion){
        double precio_reso=0;
        
        if(resolucion>resLimit){
            precio_reso=((precio_Base*porcRes)/100);
        }
               
        return (precio_reso);
        
    }
    
    public static double PrecioxFHD(boolean sintonizador){
        double precio_sint=0;
        
        //System.out.println(sintonizador);
        if(sintonizador){
            precio_sint=nSint;
        }
        //System.out.println(resolucion);
                       
        return (precio_sint);
        
    }
}
