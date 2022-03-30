package com.company.clase.mostenire;

import com.company.clase.Persoana;
import com.company.clase.enumerari.TipCarte;
import com.company.clase.enumerari.TipPersoana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Autor extends Persoana {
    private TipCarte stil;
    private int rating;

    public Autor(){}
    public Autor(TipCarte stil, int rating, TipPersoana tip, String nume, String prenume, int varsta){
        ct += 1;
        this.id = ct;
        this.stil = stil;
        this.rating = rating;
        this.tip = tip;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public List<Autor> Read(){
        Scanner input = new Scanner(System.in);

        List<Autor> autori = new ArrayList<Autor>();

        TipCarte stil = TipCarte.COMEDIE;
        TipPersoana tip;
        String nume, prenume;
        int nr_autori, task, varsta, rating;
        System.out.println("Introduceti numarul de autori: ");
        nr_autori = input.nextInt();

        for(int i = 1; i <= nr_autori; i++)
        {
            System.out.println("Autorul cu numarul " + i);

            System.out.println("Introduceti numarul din dreptul stilului autorului [1: Horror, 2: Drama, 3: Comedie]: ");
            task = input.nextInt();
            switch (task){
                case 1:
                {
                    stil = TipCarte.HORROR;
                    break;
                }
                case 2:
                {
                    stil = TipCarte.DRAMA;
                    break;
                }
                case 3: {
                    stil = TipCarte.COMEDIE;
                    break;
                }
                default:
                    System.out.println("Nu ati introdus un numar dintre cele 3");
            }

            System.out.println("Introduceti ratingul autorului (intre 0 si 10): ");
            rating = input.nextInt();

            System.out.println("Introduceti numele autorului: ");
            nume = input.next();

            System.out.println("Introduceti prenumele autorului: ");
            prenume = input.next();

            System.out.println("Introduceti varsta autorului: ");
            varsta = input.nextInt();

            if(varsta < 18)
                tip = TipPersoana.COPIL;
            else if(varsta > 17 && varsta < 25)
                tip = TipPersoana.ADOLESCENT;
            else
                tip = TipPersoana.ADULT;

            Autor autor = new Autor(stil, rating, tip, nume, prenume, varsta);
            autori.add(autor);

            System.out.println(autor.toString());
        }

        return autori;
    }

    public TipCarte getStil(){
        return stil;
    }

    public void setStil(TipCarte stil){
        this.stil = stil;
    }

    public int getRating(){
        return rating;
    }

    public void setRating(int rating){
        this.rating = rating;
    }

    public int getId(){
        return id;
    }

    @Override
    public TipPersoana getTip() {
        return tip;
    }

    @Override
    public void setTip(TipPersoana tip) {
        this.tip = tip;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String getPrenume() {
        return prenume;
    }

    @Override
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString(){
        return "[#ID: " + id + ", Stil: " + stil + ", Rating: " + rating + ", Tip: " + tip + ", Nume: " + nume + ", Prenume: " + prenume + ", Varsta: " + varsta + "]";
    }

}
