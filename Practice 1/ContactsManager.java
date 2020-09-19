public class ContactsManager {
    private Contact[] contacts = new Contact[0];

    public void addContact(Contact newContact) {
        Contact[] newContacts = new Contact[contacts.length + 1];

        for (int i = 0; i < contacts.length; i++) {
            newContacts[i] = contacts[i];
        }

        newContacts[contacts.length] = newContact;
        contacts = newContacts;
    }

    public void searchContact(String searchingName) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getName() == searchingName) {
                System.out.println(contacts[i].getPhoneNumber());
            }
        }
    }





    public Contact[] getContacts() {
        return contacts;
    }


}
