package com.company;

import java.util.Comparator;

public class AlbumComparator implements Comparator<Album> {
    @Override
    public int compare(Album a, Album b){
        if(a.rating > b.rating)
            return 1;
        else if(a.rating == b.rating && a.an_publicare > b.an_publicare)
            return 1;
        return -1;
    }
}
