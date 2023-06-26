package codingExercise45;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234567890");

        Contact contact1 = Contact.createContact("Bob", "31415926");
        Contact contact2 = Contact.createContact("Alice", "16180339");
        Contact contact3 = Contact.createContact("Tom", "11235813");
        Contact contact4 = Contact.createContact("Jane", "23571113");

        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact4);

        mobilePhone.printContacts();

        Contact existingContact = mobilePhone.queryContact("Bob");
        System.out.println("Contact found: " + existingContact.getName() + " -> " + existingContact.getPhoneNumber());

        Contact nonExistingContact = mobilePhone.queryContact("John");
        System.out.println("Contact found: " + nonExistingContact);

        Contact updatedContact = Contact.createContact("Bob", "98765432");
        mobilePhone.updateContact(contact1, updatedContact);

        mobilePhone.printContacts();

        mobilePhone.removeContact(contact2);
        mobilePhone.printContacts();
    }
}

