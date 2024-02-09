import java.util.*;

class PhoneBook {
    private final Map<String, Set<String>> phoneBook = new HashMap<>();

    public void addPhoneNumber(String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new HashSet<>()).add(phoneNumber);
    }

    public void removePhoneNumber(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).remove(phoneNumber);
            if (phoneBook.get(name).isEmpty()) {
                phoneBook.remove(name);
            }
        }
    }

    public List<Map.Entry<String, Set<String>>> getSortedPhoneBook() {
        List<Map.Entry<String, Set<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        entries.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));
        return entries;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhoneNumber("Peter", "00301");
        phoneBook.addPhoneNumber("Alice", "12645");
        phoneBook.addPhoneNumber("Bob", "23756");
        phoneBook.addPhoneNumber("Bob", "23756324");
        phoneBook.addPhoneNumber("Bob", "23258234");
        phoneBook.addPhoneNumber("Alice", "34561");

        for (Map.Entry<String, Set<String>> entry : phoneBook.getSortedPhoneBook()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "\n");
        }

    }
}