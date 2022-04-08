

public class Main {

        public static void main(String[] args) {
                System.out.println("Story:");
                a("Once upon a time there was a boy.");
                e("and a girl. They loved git.");
                e("Or at least they tried to make sens of git.");
                e("it took many attempts");
                e("and much coffee!");
                e("soooo much coffee!");

                e("\nWriting git branch -a //see all the branches. ");
                e("She then wrote \ngit status //to see what branch i'm was in. Write");
                e("git pull //to get the latest.\n");

                e("She then wrote some sentences and the she wrote\n" +
                        "git add . //to add all\n" +
                        "git commit -m \"nytt 6/4\"//to commit all.\n");

            Ford ford = new Ford(4, " is a family-car.");
            System.out.println(ford.allAboutCar());


            }

            public static void a(String words) {
                System.out.println(words);
            }


            public static void e(String words) {
                System.out.println(words);
            }



}
