public class User {
    private Library library;
    public User(Library library) {
        this.library = library;
    }
    public void viewBooks() {
        for (Book book : library.getAllBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
    public void borrowBook(String bookId) {
        library.borrowBook(bookId, null);  // Here null is used as we don't track the user borrowing the book
    }
    public void returnBook(String bookId) {
        library.returnBook(bookId);
    }
}
