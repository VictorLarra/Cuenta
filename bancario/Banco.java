
import java.util.ArrayList;

public class Banco{

ArrayList<Cuenta> cuentas ;

public Banco(){
    this.cuentas = new ArrayList<>();
}

public Cuenta buscarCuenta(String numero){
    // for (int i = 0; i < this.cuentas.size();i++){         //METODO 1
    //     if(numero.equals(cuentas.get(i).getNumero())){
    //         return this.cuentas.get(i);
    //     }
    for (Cuenta cuenta : this.cuentas){
        if (cuenta.getNumero().equals(numero)){
            return cuenta;
        }
    }
    return null;
    }
    

    public boolean adicionarCuenta(String numero, double saldoInicial, String tipo, String cedulaTitular, String nombreTitular){

     Cliente cliente = new Cliente(cedulaTitular, nombreTitular);
    if (this.buscarCuenta(numero) != null){
        return false;
    }else{
        Cuenta cuenta = new Cuenta (numero, tipo, saldoInicial, cliente);
        cuentas.add(cuenta);
        return true;
    } 
        
    
    
    }
    
    public double consultarTotalDinero(){
     double resultado = 0;
     for (Cuenta cuenta: this.cuentas){
        resultado += cuenta.consultarSaldo();
     }
    return resultado;
    }


    public String consultarClienteMayorSaldo(){
        double mayorSaldo = 0;
        Cuenta cuentaMayor = null;
    for (Cuenta cuenta : this.cuentas){
        if (cuenta.getSaldo() > mayorSaldo){
            mayorSaldo = cuenta.getSaldo();
            cuentaMayor = cuenta;
        }
    }
    if(cuentaMayor == null){
        return "no hay cuentas registradas en el banco";
    }else{
        return cuentaMayor.getTitular().getNombreCliente();
    }
    
}





















}