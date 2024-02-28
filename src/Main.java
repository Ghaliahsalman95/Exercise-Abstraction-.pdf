//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        MovablePoint movablePoint=new MovablePoint(2,4);
        System.out.println(movablePoint.toString());
        movablePoint.setxSpeed(2);
        movablePoint.setySpeed(5);
        movablePoint.moveDown();movablePoint.moveUp();movablePoint.moveRight();movablePoint.moveLeft();
        System.out.println(movablePoint.toString());
//------------------------------------------------
        Book book=new Book("Book1",20,"authorBook");
        Movie movie=new Movie("Movie",20,"Dicrector");
        System.out.println(book.toString());
        book.getDiscout();
        System.out.println(book.toString());
        movie.getDiscout();
        System.out.println(movie.toString());

    }
}