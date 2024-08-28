import java.util.Scanner;

public class estruturaDeDados {
    public static void main(String[] args) {

        final short MANDATORY_VOTING_AGE = 18;
        final short OPTIONAL_VOTING_AGE = 16;
        final short OPTIONAL_VOTING_ELDERLY = 70;
        final String MANDATORY_VOTING_MESSAGE = "Você é maior de idade, portanto é OBRIGADO a votar.";
        final String OPTIONAL_VOTING_MESSAGE = "Pela sua idade, o voto é opcional.";
        final String FORBIDDEN_VOTING_MESSAGE = "Você é menor de idade, portanto é PROIBIDO de votar";

        Scanner scanner = new Scanner(System.in);
        short userAge;

        System.out.println("\nBem vindo ao programa eleitoral da Pretas Tech!\n");

        System.out.print("Por favor insira a idade do eleitor: ");
        userAge = scanner.nextShort();



    /*    if (userAge >= OPTIONAL_VOTING_AGE) {
      if (userAge >= MANDATORY_VOTING_AGE)
        System.out.println("Você está na faixa da idade eleitoral OBRIGATÓRIA.");
      else System.out.println("Você está na faixa da idade eleitoral OPCIONAL.");
    }
    if (userAge < OPTIONAL_VOTING_AGE)
      System.out.println("Você é muito jovem, e ainda NÃO PODE VOTAR");*/

    /*if (userAge >= MANDATORY_VOTING_AGE) System.out.println(MANDATORY_VOTING_MESSAGE);
    else if (userAge >= OPTIONAL_VOTING_AGE) System.out.println(OPTIONAL_VOTING_MESSAGE);
    else System.out.println(FORBIDDEN_VOTING_MESSAGE);*/

//    if (userAge >= MANDATORY_VOTING_AGE) {
//      System.out.println(MANDATORY_VOTING_MESSAGE);
//    }
//    else if (userAge >= OPTIONAL_VOTING_AGE) {
//      System.out.println(OPTIONAL_VOTING_MESSAGE);
//    }
//    else {
//      System.out.println(FORBIDDEN_VOTING_MESSAGE);
//    }

        if (userAge >= MANDATORY_VOTING_AGE && userAge < OPTIONAL_VOTING_ELDERLY) {
            System.out.println(MANDATORY_VOTING_MESSAGE);
        } else if ((userAge >= OPTIONAL_VOTING_AGE && userAge < MANDATORY_VOTING_AGE) || userAge >= OPTIONAL_VOTING_ELDERLY) {
            System.out.println(OPTIONAL_VOTING_MESSAGE);
        } else {
            System.out.println(FORBIDDEN_VOTING_MESSAGE);
        }

        System.out.println("Pesquise bem os candidados existentes e vote consciente!");

        scanner.close();
    }
}
