package exercicio01;

public class Ficha {
	
	public String nome;
	public double salario;
    public String cpf;
    public int idade;
    public char sexo;
    
    
    public String toString() {
    	return this.nome+" - "+this.salario+" - "+this.cpf+" - "+this.idade+" - "+this.sexo+".";
    }
}
