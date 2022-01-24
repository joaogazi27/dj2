package br.unirio.bs1.tp2.dojo2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int typeSelected;

        Tanker tanker = new Tanker();
        Wizard wizard = new Wizard();
        Witcher witcher = new Witcher();

        Util.out("Selecione a Classe de seu personagem.\n[1]-Tanker\n[2]-Mago\n[3]-Bruxo");
        typeSelected = scanner.nextInt();

        switch (typeSelected){
            case 1:
                String tankerName = tanker.name();
                int tankerShield = tanker.useShield();

                Util.out(tankerName);
                if(tankerShield == 1)
                    Util.out("Escudo Ativado");
                else
                    Util.out("Escudo Desativado");
                break;

            case 2:
                String wizardName = wizard.name();
                String wizardSpell = wizard.spell();

                Util.out(wizardName);
                Util.out(wizardSpell);
                break;
            case 3:
                String witcherName = witcher.name();
                int witcherShield = witcher.useShield();
                String witcherSpell = witcher.spell();

                Util.out(witcherName);
                Util.out(witcherSpell);

                if(witcherShield == 1)
                    Util.out("Escudo Ativado");
                else
                    Util.out("Escudo Desativado");
                break;

        }


    }
}
