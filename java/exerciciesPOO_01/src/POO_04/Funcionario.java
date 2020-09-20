package POO_04;

public class Funcionario {
	private String nome;
	private char sexo;
	private int id;
	private String departamento;
	private double salario;
	
	public Funcionario(String nome, char sexo, int id, String departamento, double salario) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.id = id;
		this.departamento = departamento;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario { nome: " + nome + ", sexo: " + sexo + ", id: " + id + ", departamento: " + departamento
				+ ", salario: " + salario + " }";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
