package aula27;

public class Aluno {
	String nome;
	String matricula;
	String nomeCurso;
	String [] nomeDisciplinas;
	double[] [] notasDisciplinas = new double [3] [4];

	 void mostrarInfo(){
		 System.out.println("nome" + nome);
		 System.out.println("matricula" + matricula);
		 System.out.println("nomeCurso" + nomeCurso);
		
		 for (int i=0; i<notasDisciplinas.length; i++) {
			 System.out.println("notas da disciplina" + nomeDisciplinas[i]);
			 
			 for (int j=0; j<notasDisciplinas[i].length; j++) {
				 System.out.print(notasDisciplinas[i][j] + " ");
			 }
			 System.out.println();
	 }
}
}