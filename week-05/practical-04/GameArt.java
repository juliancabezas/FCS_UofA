public class GameArt {

    public static void printMove (String move, String member){

        // Every move print a different ascii art
        // Art taken from https://gist.github.com/wynand1004/b5c521ea8392e9c6bfe101b025c39abe

        if (move.equals("Rock")) {
            System.out.println();
            System.out.println(member + " uses Rock!");
            System.out.println();
            System.out.println("    _______");
            System.out.println("---'   ____)");
            System.out.println("      (_____)");
            System.out.println("      (_____)");
            System.out.println("      (____)");
            System.out.println("---.__(___)");
        } else if (move.equals("Paper")) {
            System.out.println();
            System.out.println(member + " uses Paper!");
            System.out.println();
            System.out.println("    _______");
            System.out.println("---'   ____)____");
            System.out.println("          ______)");
            System.out.println("          _______)");
            System.out.println("         _______)");
            System.out.println("---.__________)");
        } else if (move.equals("Scissors")) {
            System.out.println();
            System.out.println(member + " uses Scissors!");
            System.out.println();
            System.out.println("    _______");
            System.out.println("---'   ____)____");
            System.out.println("          ______)");
            System.out.println("          _______)");
            System.out.println("      (____)");
            System.out.println("---.__(___)");
        } else {
            System.out.println("Invalid move, Game Art not available");
        }
    }

    public static void printWinner (String winner){

        // Print a different ascii art according to the winner
        // Art taken from https://www.asciiart.eu/
        if (winner.equals("Robot")) {
            System.out.println("       ( )");
            System.out.println("        H");
            System.out.println("        H");
            System.out.println("       _H");
            System.out.println("    .-'-.-'-.");
            System.out.println("   /         |");
            System.out.println("  |           |");
            System.out.println("  |   .-------'._");
            System.out.println("  |  [ [  '.' '. ]");
            System.out.println("  |  [ [ @   @ ] ] ");
            System.out.println("  |   '---------'     ");   
            System.out.println("  |    _______|  ");
            System.out.println("  |  .'-+-+-+|  ");
            System.out.println("  |  '.-+-+-+|         I won hehehe");
            System.out.println("  |          |         I am going to build my own theme park...");
            System.out.println("  '-.__ ____.-'");
        }
        // Print a different ascii art according to the winner

        if (winner.equals("Human")) {
            System.out.println("        .,.,");                   
            System.out.println("        (((((())");                
            System.out.println("       ((('_  _`) '   I won... ");               
            System.out.println("       ((G   / |)     now back to giving facebook all my information");                
            System.out.println("      (((`   '' ,");                  
            System.out.println("       .((|.:~:          .--------------. ");   
            System.out.println("       __.| `'''.__      |               |");     
            System.out.println("    .~~   `---'   ~.    |  .             : ");    
            System.out.println("   /                `   |   `-.__________)");     
            System.out.println("  |             ~       |  :             :");   
            System.out.println("  |                     |  :  |           ");   
            System.out.println("  |    _                |     |   [ ##   :");   
            System.out.println("   |   ~~-.            |  ,   oo_______.'");   
            System.out.println("    `_   ( |) _____/~~~~ `--___           ");   
            System.out.println("    | ~`-)  ) `-.   `---   ( - a:f -      ");   
            System.out.println("    |   '///`  | `-.                       ");  
            System.out.println("    |     | |  |    `-.                    ");  
            System.out.println("    |     | |  |       `-.                 ");  
        }

    }

}

