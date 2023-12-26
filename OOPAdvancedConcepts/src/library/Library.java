package library;

import item.Item;

import java.util.ArrayList;
import java.util.List;

public class Library {
    /**
     * Encapsulation: Using access modifiers(public, private, protected) to control access to fields and methods.
     * @desc: Private fields and encapsulated within the class.
     */
    private List<Item> catalog;
    private List<LibraryMember> members;

    /**
     * Encapsulation
     * @desc: Constructor is used for initialize the encapsulated fields.
     */
    public  Library(){
        this.catalog = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.catalog.add(item);
    }

    public void addMember(LibraryMember libraryMember) {
        this.members.add(libraryMember);
    }

    // Getters and Setters
    /**
     * Encapsulation
     * @desc: Standard getter/setters for control the access to encapsulated fields.
     */
    public List<Item> getCatalog() {
        return this.catalog;
    }

    public List<LibraryMember> getMembers() {
        return this.members;
    }

    /**
     * Encapsulation
     * @desc: Define the logics specific for the class within the class.
     */
    public void displayCatalog() {
        for(Item item: this.catalog){
            item.displayInfo();
        }
    }

    public void displayMembers() {
        for (LibraryMember libraryMember: this.members){
            libraryMember.displayInfo();
        }
    }
}
