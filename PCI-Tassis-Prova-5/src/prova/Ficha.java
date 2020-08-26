package prova;

public class Ficha {
	
	public String nome;
	public double salario;
    public String cpf;
    public int idade;
    public char sexo;
    
    @Override
    public String toString() {
    	return " "+this.nome+"  -  "+this.salario+" - "+this.cpf+" - "+this.idade+"  -  "+this.sexo;
    }
}
