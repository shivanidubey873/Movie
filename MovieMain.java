package com.tw.Movie;

import java.util.Scanner;

public class MovieMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Movie[] movieArray = new Movie[4];
        movieArray[0]=new Movie("Casino Royale","Eon Productions","PG-13");
        for(int index=1;index<4;index++){
            String title,studio,rating;
            title=scan.nextLine();
            studio=scan.nextLine();
            rating=scan.nextLine();
            movieArray[index]=new Movie(title,studio,rating);
        }
        Movie[] pgRatedMovies=Movie.getPg(movieArray);
        for (Movie pgRatedMovie : pgRatedMovies) {
            if(pgRatedMovie==null){
                break;
            }
            System.out.println("Title: " + pgRatedMovie.getTitle() + "  Studio: " + pgRatedMovie.getStudio() + "  Rating: " + pgRatedMovie.getRating());
        }

    }
}
