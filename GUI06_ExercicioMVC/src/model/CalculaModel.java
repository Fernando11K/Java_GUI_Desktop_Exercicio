package model;

public class CalculaModel {
	
	private int primeiroNumero;
	private int segundoNumero;
	private int valorCalculo;
	
	public void setPrimeiroNumero(int primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}
	public void setSegundoNumero(int segundoNumero) {
		this.segundoNumero = segundoNumero;
	}
	
	public int getValorCalculo() {
		return valorCalculo;
	}
	
	public int somaDoisNumeros() {
		
		valorCalculo = primeiroNumero + segundoNumero;
		return valorCalculo;
	}
}
