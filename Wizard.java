package br.unirio.bs1.tp2.dojo2;
import java.util.Scanner;
public class Wizard implements Magical{
    private String name;

    private String spell;
    Scanner scanner = new Scanner(System.in);

    @Override
    public String name(){
        System.out.println("Digite o nome do seu personagem:");
        name = scanner.nextLine();

        return name;

    }



    @Override
    public String spell(){
        Util.out("Digite a magia aprendida:");
        spell = scanner.nextLine();

        return spell;
    }

}
