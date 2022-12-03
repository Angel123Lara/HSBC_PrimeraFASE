package Project_Junit;

public class SistemaLealtad {

    private boolean estatusTajeta;
    private int saldoPuntos;
    private boolean estatusCupon;


    public boolean getEstatusTarjeta() {
        return this.estatusTajeta;
    }

    public void setEstatusTarjeta(boolean estatusTarjeta) {
        this.estatusTajeta = estatusTarjeta;
    }

    public int getSaldoPuntos() {
        return saldoPuntos;
    }

    public void setSaldoPuntos(int saldoPuntos) {
        this.saldoPuntos = saldoPuntos;
    }

    public boolean getEstatusCupon() {
        return estatusCupon;
    }

    public void setEstatusCupon(boolean estatusCupon) {
        this.estatusCupon = estatusCupon;
    }    

    public String mostrarProductosExtras() {
    	String product = null;
    	if(this.saldoPuntos>150) {
    		product = "Espagueti,Queso Extra,Cupon Pizza Gratis";
    	}else if(this.saldoPuntos>=50 && this.saldoPuntos<=100) {
    		product = "Espagueti";
    	}else if (this.saldoPuntos<50) {
    		product = "";
    	}else if (this.saldoPuntos>100 && this.saldoPuntos<=150) {
    		product = "Espagueti,Queso Extra";
    	}
    	
    	return product;
    }

    public void usarCupon(String respuesta) {

        if (respuesta.equals("Y")) {
        	this.estatusCupon=false;
        } else if (respuesta.equals("N")) {
        	this.estatusCupon=true;
        } else {
        	this.estatusCupon=true;

        }
    }

}