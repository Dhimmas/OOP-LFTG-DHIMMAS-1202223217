class Admin extends User {
    public Admin(String name, int id) {
        super(name, id);
    }

    public void manageSystem(String course) {
        System.out.println(name + " is managing the university system");
    }

    @Override
    public String getUserDetails() {
        return name + " is managing the university system";
    }
}
