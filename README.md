# Урок 6. Хранение и обработка данных ч3: множество коллекций Set
Урок 6. Хранение и обработка данных ч3: множество коллекций Set 


# PhoneBook

Простая Java-программа для управления телефонной книгой. Программа позволяет добавлять, удалять и просматривать телефонные номера. Данные хранятся в `HashMap`, где ключом является имя пользователя, а значением - множество (`Set<String>`) телефонных номеров.

## Функционал

- **Добавление телефонных номеров** (`addPhoneNumber(String name, String phoneNumber)`): можно добавить несколько номеров телефона для одного имени.
- **Просмотр телефонной книги** (`getSortedPhoneBook()`): отображение всех записей в телефонной книге, отсортированных по убыванию количества телефонов.
- **Удаление телефонных номеров** (`removePhoneNumber(String name, String phoneNumber)`): можно удалить конкретный номер телефона у выбранного пользователя.


### Пример

```java
PhoneBook phoneBook = new PhoneBook();
phoneBook.addPhoneNumber("Alice", "12345");
phoneBook.addPhoneNumber("Bob", "54321");
phoneBook.addPhoneNumber("Bob", "123123");
// ... другие операции ...