package com.company.clase;

import com.company.clase.enumerari.TipCarte;
import com.company.clase.enumerari.TipPersoana;
import com.company.clase.mostenire.Autor;
import com.company.clase.mostenire.Cititor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Carte {
    private List<Cititor> cicitori = new ArrayList<Cititor>();
    private Autor autor;
    private String titlu;
    private int an_publicatie, pret, id;
    private static int ct = 0;

    public Carte(){}
    public Carte(List<Cititor> cititori, Autor autor, String titlu, int an_publicatie, int pret){
        ct += 1;
        this.id = ct;
        this.cicitori = cititori;
        this.autor = autor;
        this.titlu = titlu;
        this.an_publicatie = an_publicatie;
        this.pret = pret;
    }

    public List<Carte> Read(List<Autor> autori){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        Cititor c = new Cititor();
        List<Carte> carti = new ArrayList<Carte>();
        List<Cititor> cititori = new ArrayList<Cititor>();
        String titlu;
        int nr_carti, an_publicatie, pret;

        System.out.println("Introduceti numarul de carti: ");
        nr_carti = input.nextInt();

        for(int i = 1; i <= nr_carti; i++)
        {
            System.out.println("Cartea cu numarul " + i);

            System.out.println("Introduceti titlul cartii: ");
            titlu = input.next();

            System.out.println("Introduceti anul publicatiei: ");
            an_publicatie = input.nextInt();

            System.out.println("Introduceti pretul cartii: ");
            pret = input.nextInt();

            int index = random.nextInt(autori.size());
            Autor autor = autori.get(index);

            cititori = c.Read();

            Carte carte = new Carte(cititori, autor, titlu, an_publicatie, pret);
            carti.add(carte);

            System.out.println(carte.toString());
        }

        return carti;
    }

    public List<Cititor> getCicitori(){
        return cicitori;
    }

    public void setCicitori(List<Cititor> cicitori){
        this.cicitori = cicitori;
    }

    public Autor getAutor(){
        return autor;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public String getTitlu(){
        return titlu;
    }

    public void setTitlu(String titlu){
        this.titlu = titlu;
    }

    public int getAn_publicatie(){
        return an_publicatie;
    }

    public void setAn_publicatie(int an_publicatie){
        this.an_publicatie = an_publicatie;
    }

    public int getPret(){
        return pret;
    }

    public void setPret(int pret){
        this.pret = pret;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return "[#Id: " + id + ", Autor: " + autor.getNume() + " " + autor.getPrenume() + ", Titlu: " + titlu + ", An publicatie: " + an_publicatie + ", Pret: " + pret + "]";
    }
}
