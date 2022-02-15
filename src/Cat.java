public class Cat
{
    private final String CYAN = "\u001B[36m";
    private final String RED = "\u001B[31m";
    private final String BROWN = "\u001B[33m";
    private final String BLUE = "\033[0;34m";
    private final String PURPLE = "\033[0;35m";

    private final String CLOVER = "\uD83C\uDF40";
    private final String BANANA = "\uD83C\uDF4C";

    // instance variable
    private String name;

    // constructor
    public Cat(String name)
    {
        this.name = name;
    }

    public void introduce()
    {
        System.out.println(CYAN + "Meow," + PURPLE +  " hello im " + name + " the cat!");
        System.out.println(BLUE + "Im feeling really energetic, " + RED + "I want to play!");
    }

    public void play() {
        System.out.println(BROWN + "I love finding 4 leaf clovers... \nLOOK ITS RIGHT THERE " + CLOVER);
    }

    public void animation() throws InterruptedException
    {
        System.out.println(RED + "im going to find the banana! \n" + BANANA + "    >:o" );
        System.out.println(RED + BANANA + "   >:o" );
        System.out.println(RED + BANANA + "  >:o" );
        System.out.println(RED + BANANA + " >:o" );
        System.out.println(RED + BANANA + ">:o" );
        System.out.println(RED + ">:)" );
        System.out.println(RED + "THAT TASTED SO GOOD! YUMMY!" );

    }
}
