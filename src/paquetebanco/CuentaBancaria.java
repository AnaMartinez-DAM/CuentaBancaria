package paquetebanco;
/**
 * Banco en el que se pueden crear cuentas bancarias y sacar o ingresar dinero en ellas.
 * @version 1
 * @author Ana Martinez
 *
 */
public class CuentaBancaria {
	private int saldo;
	private String titular;
	
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	/**
	 * Construye una cuenta bancaria con el saldo inicial y el nombre que se indique.
	 * @param saldo variable de tipo int.
	 * @param titular  variable de tipo String.
	 */
	public CuentaBancaria(int saldo, String titular){
		this.saldo=saldo;
		this.titular=titular;
	}
	
	/**
	 * Crea una cuenta bancaria con saldo por defecto de 500€ y el nombre de titular que se indique.
	 * @param titular variable de tipo String.
	 */
	public CuentaBancaria(String titular){
		this.saldo=500;
		this.titular=titular;
	}
	
	/**
	 * Añade dinero a la cuenta seleccionada.
	 * @param dinero variable de tipo int, que debe ser un número positivo.
	 */
	public void ingresarDinero(int dinero) {
		if (dinero>0) {
			this.saldo = saldo + dinero;
		}

	}
	
	/**
	 * Resta dinero a la cuenta seleccionada.
	 * @param dinero variable de tipo int, que debe ser un número positivo.
	 */
	public void sacarDinero(int dinero) {
		if(dinero>0) {
			this.saldo = saldo - dinero;
		}

	}
	
	/**
	 * Cambia el nombre del titular de la cuenta seleccionada.
	 * @param nombre variable de tipo String.
	 */
	public void cambiarTitular(String nombre) {
		this.titular = nombre;
	}
	
}
