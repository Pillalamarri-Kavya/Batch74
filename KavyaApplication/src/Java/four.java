class Movie {
    // Instance Variables
    int movieId;
    String movieName;

    // Static Variable
    static String industryName = "Tollywood";

    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.movieId = 101;
        m1.movieName = "Pushpa";

        Movie m2 = new Movie();
        m2.movieId = 102;
        m2.movieName = "RRR";

        System.out.println("Movie ID : " + m1.movieId);
        System.out.println("Movie Name : " + m1.movieName);
        System.out.println("Industry : " + Movie.industryName);

        System.out.println();

        System.out.println("Movie ID : " + m2.movieId);
        System.out.println("Movie Name : " + m2.movieName);
        System.out.println("Industry : " + Movie.industryName);
    }
}