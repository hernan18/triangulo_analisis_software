package triangulo.main;

public class Triangulo {
	private Integer lado1;
	private Integer lado2;
	private Integer lado3;
	
	public void setLadosTriangulos(Integer lado1, Integer lado2, Integer lado3){
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	
	/**
	 * 
	 * Pregunto si los lados son mayores que 0
	 * y tambien pregunto las condicones
	 * que 1 lado sea mayor que la resta de los otros dos
	 * y que ese mismo lado, sea menos que la suma de los otros dos
	 * 
	 * @return isTriangulo
	 */
	public Boolean isTriangulo(){
		return 		this.lado1 > 0 && lado2 > 0 && lado3 > 0 
			   &&	this.lado1 < this.lado2+lado3 && this.lado1>this.lado2-lado3
			   && 	this.lado2 < this.lado1+lado3 && this.lado2>this.lado1-lado3
			   && 	this.lado3 < this.lado2+lado1 && this.lado3>this.lado2-lado1;
	}
	
	public String getTipoTrinagulo(){
		if(isTriangulo())
			return isEscaleno().name();
		
		return TipoTriangulo.NO_ES_TRIANGULO.name();
	}

	private TipoTriangulo isEscaleno() {
		return (lado1!=lado2 && lado2!=lado3 && lado1!=lado3)?TipoTriangulo.ESCALENO : isEquilatero();
	}

	private TipoTriangulo isEquilatero() {
		return (lado1==lado2 && lado2==3) ? TipoTriangulo.EQUILATERO: TipoTriangulo.ISOCELES;
	}

	public Integer getLado1() {
		return lado1;
	}

	public void setLado1(Integer lado1) {
		this.lado1 = lado1;
	}

	public Integer getLado2() {
		return lado2;
	}

	public void setLado2(Integer lado2) {
		this.lado2 = lado2;
	}

	public Integer getLado3() {
		return lado3;
	}

	public void setLado3(Integer lado3) {
		this.lado3 = lado3;
	}

}
