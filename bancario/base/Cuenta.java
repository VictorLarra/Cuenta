    
     

    public class Cuenta{
       Cliente titular;
       double saldo;
       String numero;
       String tipo; 
       
       
       boolean retirar (double cantidad){
            if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
            }
            else {
            return false;
            }
        }
       
       void consignar(double cantidad) {
       saldo += cantidad;
       }


       public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public Cuenta (String numero, String tipo, double saldo, Cliente titular){
        
        this.titular = titular;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public Cuenta (String numero, String tipo, Cliente titular){
        this(numero, tipo, 0, titular);
    }

    public boolean retirarSaldo(double cantidadARetirar){
        if (cantidadARetirar <= this.saldo){
            this.saldo -= cantidadARetirar;
            return true;
        }else{
            return false;
        }
    }

    public void consignarSaldo(double cantidadAConsignar){
        this.saldo += cantidadAConsignar;
    }

    public double consultarSaldo(){
        return this.saldo;
    }

    public Cliente getTitular() {
        return titular;
    }



    }