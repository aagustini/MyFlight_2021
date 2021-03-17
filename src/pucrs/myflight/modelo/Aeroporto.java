package pucrs.myflight.modelo;

public class Aeroporto {
	private String codigo;
	private String nome;

	//private double latitude;
	//private double longitude;
	private Geo loc;
	
	public Aeroporto(String codigo, String nome, Geo loc) {
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}

	public Aeroporto(String codigo, String nome, double lat, double lon) {
		this.codigo = codigo;
		this.nome = nome;
		this.loc = new Geo(lat, lon);
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Geo getLocal() {
		return loc;
	}
}
