

public class Main {

        public static void main(String[] args) {
          
                System.out.println("Story:");
                e("\n6/4 Emma opened git Bash and then she wrote\n" +
                        "git branch -a //So that she could see all the branches. ");
                e("She then wrote \ngit status //to see what branch she was in. ");
                e("She was in the correct branch so she wrote:\n" +
                        "git pull //to force a pull of the latest\n");

                e("She then wrote some sentences and the she wrote\n" +
                        "git pull //to double check the has the latest, then " +
                        "git add . //to add all new stuff, and then \n" +
                        "git commit -m //to commit all. \nThen she wrote git push to push it to her branch");

            Ford aFordCarObject = new Ford(4, "is from the USA", "whiskey lullaby, by brad paisley");
            System.out.println(aFordCarObject.theCarsSlogan());
            System.out.println(aFordCarObject.theCarsThemesong());

            System.out.println("Emma added a new branch for her new class 20/4. Used the command \n" +
                    "git checkout -b addingNewClass //to create said branch and \n" +
                    "$ git push --set-upstream origin addingNewClass //to create upstream to her new branch.");

            }

            public static void a(String words) {
                System.out.println(words);
            }


            public static void e(String words) {
                System.out.println(words);
            }



}
