public class SimMontyMain {
    //you can embed the main method any where you want!
    public static void main(String[] args){
        SimMontyMain m = new SimMontyMain();
        m.runSimulation(100000); 
    }

    private int myWinTotal;


    //implement this method
    public void runSimulation (int numGames) {
        SimMonty m = new SimMonty();
        int countRuns = 0;
        int strategy = 0; 
        for(int i=0; i<3; i++){
            strategy = i;
            myWinTotal = 0;
            while (countRuns < numGames){
                m.playGame(strategy);
                myWinTotal += m.playGame(strategy);
                countRuns++;
            }
        
        
        System.out.println((myWinTotal * 1.0)/numGames);
        }
        }
        //  while(countRuns < numGames){
        //      int result = m.playGame();
        //      if(result ==1){
        //         myWinTotal++;
        //      }
        //      countRuns++;
        // }
         
        
    }   
