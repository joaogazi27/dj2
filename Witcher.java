package br.unirio.bs1.tp2.dojo2;
import java.util.Scanner;


public class Witcher implements Armored, Magical{
    private String name;

    private int useshield;
    private String spell;

    Scanner scanner = new Scanner(System.in);

    @Override
    public String name(){
        System.out.println("Digite o nome do seu personagem:");
        name = scanner.nextLine();

        return name;

    }

    @Override
    public int useShield(){
        Util.out("O escudo garante +1 de defesa, já sem esgudo garante +1 de ataque\nSeu personagem usará escudo? (1 para SIM ou 0 para NÃO):");
        useshield = scanner.nextInt();

        return useshield;
    }

    @Override
    public String spell(){
        Util.out("Digite a magia aprendida:");
        spell = scanner.nextLine();

        return spell;
    }

}
