import java.nio.channels.GatheringByteChannel;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        Cat herbert = new Cat("Herbert");

      /* A. uncomment code below first
            then study my code and see how colors work! */

        herbert.introduce();


      /* B. uncomment code below second
            then study the code to see how emojis work! */

       // henry.printFavoriteFoods();
        herbert.play();
        herbert.animation();

      /* C. uncomment code below third
            then study my code and see how 'console animation' is made!
            for more info on try-catch syntax (not required for this course),
            check out https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html */

     //   try {
     //     harry.animate();
     //   } catch (Exception e) { }
    }
}