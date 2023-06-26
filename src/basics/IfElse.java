package basics;

public class IfElse {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }



//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        finalScore = score;
//
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
      
                System.out.println("The next highScore is " +
                        calculateScore(true, 700, 5, 100));
            }

            public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

                int finalScore = score;

                if (gameOver) {
                    finalScore += (levelCompleted * bonus);
                    finalScore += 1000;
                }

                return finalScore;
            

   }
}
