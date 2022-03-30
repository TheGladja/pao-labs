package com.company;

import com.company.clase.Actiuni;
import com.company.clase.Carte;
import com.company.clase.interfata.ICarte;
import com.company.clase.mostenire.Autor;
import com.company.clase.mostenire.Cititor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main{

    public static void main(String[] args) {
        Actiuni act = new Actiuni();
        Autor a = new Autor();
        Carte c = new Carte();
        List<Carte> carti = new ArrayList<Carte>();
        List<Autor> autori = new ArrayList<Autor>();

        autori = a.Read();
        carti = c.Read(autori);

        /*TipCarte tc = TipCarte.HORROR;
        System.out.println(act.nrCititoriDupaGenulCartii(carti, tc));*/

        /*act.afiseazaCarteDupaId(carti,1);*/

        /*act.afiseazaCarteDupaTitlu(carti, "aaa");*/

        /*act.afiseazaAutorDupaId(autori, 2);*/

        /*act.stergeCarteDupaId(carti, 1);
        for(Carte carte : carti)
            System.out.println(carte.toString());*/

        /*act.stergeCarteDupaTitlu(carti, "aaa");
        for(Carte carte : carti)
            System.out.println(carte.toString());*/

        /*act.sorteazaCarteDupaAn(carti);
        for(Carte carte : carti)
            System.out.println(carte.toString());*/

        /*act.sorteazaCarteDupaAn(carti);
        for(Carte carte : carti)
            System.out.println(carte.toString());*/

        /*act.afiseazaCititoriCarteDupaId(carti, 1);*/

        /*act.afiseazaAutori(autori);*/

        /*act.afiseazaCarti(carti);*/
    }
}
