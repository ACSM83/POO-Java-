package aula06;

public class Pessoa {
	private String nome;
	private int cc;
	private Data dataNasc;
	
	public Pessoa (String nome, int cc, Data dataNasc) {
		this.nome = nome;
		this.cc = cc;
		this.dataNasc = dataNasc;
	}
	
	public final String getName() {
		return nome;
	}
	public int getCC() {
		return cc;
	}
	public Data getDataNasc() {
		return dataNasc;
	}
	public String toString() {
		return nome + "; CC: " + cc + "; Data Nascimento: " + dataNasc;
	}
}
class Aluno extends Pessoa{
	public static int count = 100;
	private int nMec;
	private Data dataInsc;
		
	public Aluno(String iNome, int iBI, Data iDataNasc, Data iDataInsc){
		super(iNome, iBI, iDataNasc);
		nMec = count++;
		dataInsc = iDataInsc;
			
	}
	public Aluno(String iNome, int iBI, Data iDataNasc) {
		super(iNome, iBI, iDataNasc);
		nMec = count++;
		this.dataInsc = new Data();
	}		
	public int getNMEC() {
		return nMec;
	}
	public Data getDataInsc() {
		return dataInsc;
	}
	@Override
	public String toString() {
		return super.toString() + "\nnMec: " + nMec + "; Data de Inscrição: " + dataInsc;
	}
}
	
class Bolseiro extends Aluno{
		private double bolsa;
		
		public Bolseiro(String iNome, int iBI, Data iDataNasc){
			super(iNome, iBI, iDataNasc);
		}	
	public double getBolsa() {
		return bolsa;
	}
	public void setBolsa(double b) {
		bolsa = b;
	}
	public int getNMec() {
		return super.getNMEC();
	}
}
