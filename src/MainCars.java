

public class MainCars {

    public static void main(String[] args) {

        System.out.println("Story:");
        p("\n6/4 Emma opened git Bash and then she wrote\n" +
                "git branch -a //So that she could see all the branches. ");
        p("She then wrote \ngit status //to see what branch she was in. ");
        p("She was in the correct branch so she wrote:\n" +
                "git pull //to force a pull of the latest\n");

        p("She then wrote some sentences and the she wrote\n" +
                "git pull //to double check the has the latest, then " +
                "git add . //to add all new stuff, and then \n" +
                "git commit -m //to commit all. \nThen she wrote git push to push it to her branch");

        Ford aFordCarObject = new Ford(4, "is from the USA", "whiskey lullaby, by brad paisley");
        System.out.println(aFordCarObject.theCarsSlogan());
        System.out.println(aFordCarObject.theCarsThemesong());

        p("Emma added a new branch for her new class 20/4. Used the command \n" +
                "git checkout -b addingNewClass //to create said branch and \n" +
                "$ git push --set-upstream origin addingNewClass //to create upstream to her new branch.");
        p("git stash // stash in local branch\ngit stash clear // clear the stash in the local branch\ngit stash list // get the list of what is in the stash in the local branch");

        p("git pull origin main //she tried to pull main into her local branch to resolve possible issues");
        p("She got the response \"error: Pulling is not possible because you have unmerged files.\" So then she resolved the conflicts in her IDEA. Then she wrote \ngit add .\ngit commit -m 'mering main into addingNewClass' //and then \ngit push //to push it up to her local branch. ");

        p("Then she wrote\ngit checkout main //to go into the main branch. Then she added branch addingNewClass into main by writing: \ngit merge addingNewClass //to merge the branch addingNewClass into main. Then she wrote \ngit push //to push up the change in main.");


        p("Another day she wanted to fetch stuff from main but not pull all the changes, she wrote \ngit fetch origin //to download new changes, but leave her HEAD branch and working copy files untouched.");


        
    }

    public static void p(String words) {
        System.out.println(words);
    }

}
