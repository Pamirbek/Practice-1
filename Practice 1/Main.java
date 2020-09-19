public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();
        myContactsManager.addContact(new Contact("Pamir", "+996701333003"));
        myContactsManager.addContact(new Contact("Allen", "+996701404401"));
        myContactsManager.addContact(new Contact("Michael", "+996702060401"));
        myContactsManager.addContact(new Contact("Damian", "+996701909192"));
        myContactsManager.addContact(new Contact("Rondo", "+996775110132"));

        myContactsManager.searchContact("Rondo");
    }
}
