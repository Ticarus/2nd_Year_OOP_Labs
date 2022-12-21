package com.mycompany.lab3;

public class Movie {
    String title;
    int rating;
    
    public Movie(String newTitle, int newRating){
        title = newTitle;
        if(newRating >= 0 && newRating <= 10){
            rating = newRating;
        }
    }
    
    public char getCategory(){
        if(rating == 10 || rating == 9){
            return 'A';
        }
        else if(rating == 8 ||rating == 7){
            return 'B';
        }
        else if(rating == 6 ||rating == 5){
            return 'C';
        }
        else if(rating == 4 ||rating == 3){
            return 'D';
        }
        else{
            return 'F';
        }
    }
    
    public void writeOutput(){
        System.out.println("Title : " + title);
        System.out.println("Rating : " + rating);
    }
}
