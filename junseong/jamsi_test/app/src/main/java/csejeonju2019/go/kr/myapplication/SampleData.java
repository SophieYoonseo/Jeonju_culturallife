package csejeonju2019.go.kr.myapplication;

import java.util.ArrayList;

public class SampleData {

    ArrayList<Movie> items = new ArrayList<>();

    public ArrayList<Movie> getItems() {

        Movie movie1 = new Movie("http://static.hubzum.zumst.com/hubzum/2018/02/06/09/962ec338ca3b4153b037168ec92756ac.jpg",
                "action", "Black Panther", "this movie open in 2018.01");

        Movie movie2 = new Movie("https://t1.daumcdn.net/cfile/tistory/0138F14A517F77713A",
                "action", "Iron Man 3", "this movie open in 2013.04");

        Movie movie3 = new Movie("https://i.ytimg.com/vi/5-mWvUR7_P0/maxresdefault.jpg",
                "action", "Ant Man", "this movie open in 2015.06");

        items.add(movie1);
        items.add(movie2);
        items.add(movie3);

        items.add(movie1);
        items.add(movie2);
        items.add(movie3);

        items.add(movie1);
        items.add(movie2);
        items.add(movie3);

        return items;
    }
}