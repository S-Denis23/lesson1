package task2;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();


        Author author = new Author();
        author.setName("Рєй Бредбери");
        author.show();
        Title title = new Title();
        title.setTitle("451 градус по Фаренгейту");
        title.show();
        Content content = new Content();
        content.setContent("научно-фантастический роман-антиутопия Рэя Брэдбери, изданный в 1953 году. Роман описывает американское общество близкого будущего, в котором книги находятся под запретом; «пожарные»[1], к числу которых принадлежит и главный герой Гай Монтэг, сжигают любые найденные книги.");
        content.show();



        book.setAuthor(author);
        book.setTitle(title);
        book.setContent(content);

        book.show();
    }
}
