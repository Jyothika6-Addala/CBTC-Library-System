public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Admin admin = new Admin(library);
        User user = new User(library);
        // Admin adds books
        admin.addBook("1", "1984", "George Orwell");
        admin.addBook("2", "To Kill a Mockingbird", "Harper Lee");
        // Admin adds members
        admin.addMember("1", "John Doe", "john@example.com");
        // User views books
        user.viewBooks();
        // User borrows a book
        user.borrowBook("1");
        // User returns a book
        user.returnBook("1");
    }
}
