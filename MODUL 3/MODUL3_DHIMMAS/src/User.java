class User {
    private String name;
    private String movieName;

    public User(String name, String movieName) {
        this.name = name;
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "User: " + name + ", Movie: " + movieName;
    }
}



  