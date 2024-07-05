import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Library {
    private Map<String, Book> books = new HashMap<>();
    private Map<String, Member> members = new HashMap<>();
    public void addBook(Book book) {
        books.put(book.getId(), book);
    }
    public void removeBook(String bookId) {
        books.remove(bookId);
    }
    public Book getBook(String bookId) {
        return books.get(bookId);
    }
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }
    public void addMember(Member member) {
        members.put(member.getId(), member);
    }
    public void removeMember(String memberId) {
        members.remove(memberId);
    }
    public Member getMember(String memberId) {
        return members.get(memberId);
    }
    public void borrowBook(String bookId, String memberId) {
        Book book = getBook(bookId);
        if (book != null && !book.isBorrowed()) {
            book.borrow();
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }
    public void returnBook(String bookId) {
        Book book = getBook(bookId);
        if (book != null && book.isBorrowed()) {
            book.returnBook();
        } else {
            System.out.println("Book is not borrowed.");
        }
    } }
