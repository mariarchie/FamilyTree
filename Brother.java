class Brother extends Person {

    private String brotherName;

    public Brother(String aName, String brotherName) {
        super(aName);
        this.brotherName = brotherName;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Brother name: " + this.brotherName);
    }
}