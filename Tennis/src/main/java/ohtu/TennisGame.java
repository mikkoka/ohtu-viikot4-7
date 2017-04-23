package ohtu;

public class TennisGame {
    
    private int progress1 = 0;
    private int progress2 = 0;
    int difference;
    private String player1Name;
    private String player2Name;
    private String[] progressWords = {"Love", "Fifteen", "Thirty", "Forty"};

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            progress1 += 1;
        else
            progress2 += 1;
    }

    public String getScore() {
        difference = progress1 - progress2;
   
        if (difference == 0)
            return gameEven();       
        
        else if (progress1 < 4 && progress2 < 4)
            return ordinaryGamePlay();
        
        else return (Math.abs(difference) > 1) ? gameWon() : advantage();
    }

    private String gameEven() {
        if (progress1 <= 3)
            return progressWords[progress1] + "-All";
        return "Deuce";
    }
    
    private String ordinaryGamePlay() {
            return progressWords[progress1] + "-" + progressWords[progress2];
    }
    
    private String advantage() {
        return "Advantage " + printLeader();
    }
    
    private String printLeader() {
        return (difference > 0) ? "player1" : "player2";
   }
    
    private String gameWon() {
        return "Win for " + printLeader();
    }
}