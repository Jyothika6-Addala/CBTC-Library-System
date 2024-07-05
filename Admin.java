public class Admin {
    private Library library;
    public Admin(Library library) {
        this.library = library;
    }
    public void addBook(String id, String title, String author) {
        Book book = new Book(id, title, author);
        library.addBook(book);
    }
    public void removeBook(String bookId) {
        library.removeBook(bookId);
    }
    public void addMember(String id, String name, String email) {
        Member member = new Member(id, name, email);
        library.addMember(member);
    }
    public void removeMember(String memberId) {
        library.removeMember(memberId);
    }
}
