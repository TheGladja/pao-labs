package com.company;

import java.text.SimpleDateFormat;
import java.util.*;

public class Album {
    protected static int count = 0;
    protected String nume, artist;
    protected int rating, an_publicare, id;

    public Album(){}
    public Album(String nume, String artist, int rating, int an_publicare){
        count += 1;
        this.nume = nume;
        this.artist = artist;
        this.rating = rating;
        this.an_publicare = an_publicare;
        this.id = count;
    }

    @Override
    public String toString(){
        return "Albumul cu id-ul " + id + ", numele " + nume + ", artistul " + artist + ", ratingul " + rating + " si anul publicarii " + an_publicare;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nume, artist;
        int nr_obj, rating, an_publicare;
        List<Album> alb = new ArrayList<Album>();

        System.out.println("Introduceti numarul albumelor: ");
        nr_obj = input.nextInt();

        for(int i = 1; i <= nr_obj; i++)
        {
            System.out.println("Introduceti nummele albumului: ");
            nume = input.next();

            System.out.println("Introduceti nummele artistului: ");
            artist = input.next();

            System.out.println("Introduceti ratingul albumului: ");
            rating = input.nextInt();

            System.out.println("Introduceti anul publicarii albumului: ");
            an_publicare = input.nextInt();

            Album album = new Album(nume, artist, rating, an_publicare);
            alb.add(album);

            System.out.println(album.toString());
        }

        System.out.println("\nOrdinea nesortata a albumelor introduse este: \n");
        for(Album album : alb)
            System.out.println(album.toString());

        Collections.sort(alb, new AlbumComparator());

        System.out.println("\nOrdinea sortata a albumelor introduse este: \n");
        for(Album album : alb)
            System.out.println(album.toString());
    }
}
