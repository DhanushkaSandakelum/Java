package library;

public class LibraryMember {
    private String name;
    private int memberId;

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Getters and Setters
    public String getName(){
        return this.name;
    }

    public int getMemberId() {
        return this.memberId;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.getName() + " MemberId: " + this.getMemberId());
    }
}
