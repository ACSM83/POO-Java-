package aula05;

import java.util.ArrayList;

import java.util.Scanner;
import aula05.Utilizador;

public class Ex5_3 {
	public static void main(String[] args) {
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Utilizador> alunos = new ArrayList<>();
		ArrayList<Livro> livros = new ArrayList<>();
		do {
			String menu = "MENU====================================\n" + 
					"= 1 - inscrever utilizador             =\n" + 
					"= 2 - remover utilizador               =\n" +
					"= 3 - imprimir lista de utilizadores   =\n" + 
					"= 4 - registar um novo livro           =\n" + 
					"= 5 - imprimir lista de livros         =\n" + 
					"= 6 - emprestar                        =\n" + 
					"= 7 - devolver                         =\n" + 
					"= 8 - sair                             =\n" + 
					"========================================";
			System.out.println(menu);
			System.out.print("Indique a opção: ");
			opcao = sc.nextInt();
				
			sc.nextLine();
			switch(opcao) {
			case 1:
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Nº Mecanográfico: ");
				int nMec = sc.nextInt();
				sc.nextLine();
				System.out.println("Curso: ");
				String curso = sc.nextLine();
				
				alunos.add(new Utilizador(nome, nMec, curso));
				System.out.println("---> Utilizador Registado! <---");
				System.out.println(alunos);
				break;
			case 2:
				System.out.print("Insira o nº Mec do aluno a remover: ");
				nMec = sc.nextInt();
				int index = search(alunos, nMec);
				if (index> -1) {
					alunos.remove(index);	
				}else {
					System.out.printf("O aluno com o nº Mec %d não foi encontrado\n", nMec);	
				}
				break;
			case 3:
				System.out.println(alunos);
				break;
			case 4:
				System.out.print("Id: ");
				int id = GetInteger(sc.nextLine());
				
				System.out.print("Titulo: ");
				String titulo = sc.nextLine();
				
				System.out.print("Tipo de Empréstimo: ");
				String tipoEmprestimo = sc.nextLine();
				
				livros.add(new Livro(id, titulo, tipoEmprestimo));
				System.out.println("---> Livro inserido! <---");
				break;
			case 5:
				System.out.println(livros);
				break;
			case 6:
				System.out.print("Código do Livro: ");
				int idLivro = sc.nextInt();
				System.out.print("Nº Mecanografico do aluno: ");
				int NMec = sc.nextInt();
				
				int indexAluno = search(alunos, NMec);
				ArrayList<Integer> livrosAluno = alunos.get(indexAluno).getLivros();
				
				Livro livro = livros.get(searchLivro(livros,idLivro));
				
				if (livro.getTipoEmprestimo().equalsIgnoreCase("CONDICIONAL")) {
					System.out.print("Livro é do tipo Condicional, por isso não pode ser requisitado\n");
				}else if (livrosAluno.size()<3) {
					if (contains(livrosAluno, idLivro)) {
						System.out.print("Livro já requisitado.\n");	
					}else {
						alunos.get(indexAluno).setLivro(idLivro);
					}
				}else {
					System.out.print("Já possui o maximo de 3 livros requisitados.\n");	
				}
				break;
			case 7:
				System.out.print("Código do Livro: ");
				idLivro = sc.nextInt();
				System.out.print("Nº Mecanografico do aluno: ");
				NMec = sc.nextInt();
				
				indexAluno = search(alunos, NMec);
				livrosAluno = alunos.get(indexAluno).getLivros();
				
				int indexLivro = searchLivro(livros,idLivro);
				if (indexLivro > -1) {
					alunos.get(indexAluno).EntregaLivro(indexLivro);
					
					System.out.print("Livros requisitados\n");
					System.out.println(alunos.get(indexAluno).getLivros());
				}else {
					System.out.print("Livro nao esta requisitado\n");
					System.out.println(alunos.get(indexAluno).getLivros());
				}
				
				break;
			}
		} while(opcao != 8);		
		sc.close();
	}
	public static int GetInteger(String s) {
	    try { 
	        return Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return -1; 
	    } catch(NullPointerException e) {
	        return -1;
	    }
	}
	
	public static int search(ArrayList<Utilizador> alunos, int nMec) {
		int index = 0;
		   for(Utilizador aluno :  alunos) {
		      if(aluno.getNMec() == nMec) { 
		    	  return index; 
	    	  }
		      index++;
		   }
		   return -1;
	}
	
	public static int searchLivro(ArrayList<Livro> livros, int idLivro) {
		int index = 0;
		   for(Livro livro :  livros) {
		      if(livro.getId() == idLivro) { 
		    	  return index; 
	    	  }
		      index++;
		   }
		   return -1;
	}
	
	public static boolean contains(final ArrayList<Integer> livros, final int key) {
		
		 for(int idLivro :  livros) {
		      if(idLivro == key) { 
		    	  return true; 
	    	  }
		   }
		 return false;
	}

}
