package lesson14;

public class TesteInterface {

	public static void main(String[] args) {
		ParticipanteForum participante = new ParticipanteForum();
		
		Leitor leitor = participante;
		
		Programador programador = participante;
		programador.pensando("Java".toCharArray());
		
		System.out.println("O participante está lendo: " + leitor.lendo());
		System.out.println("E programando: " + programador.digitando());
	}

}
