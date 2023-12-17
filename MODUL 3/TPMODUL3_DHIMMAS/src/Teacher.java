class Teacher extends User {
    private String course;

    public Teacher(String name, int id, String course) {
        super(name, id);
        this.course = course;
    }

    public void teachClass() {
        System.out.println(name + " is teaching " + course);
    }

    @Override
    public String getUserDetails() {
        return name + " is teaching " + course;
    }
}
