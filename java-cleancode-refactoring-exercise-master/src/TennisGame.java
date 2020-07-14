public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    public static final String MINUS = "-";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        int tempScore=0;
        if (m_score1==m_score2)
        {
            switch (m_score1)
            {
                case 0:
                    score = LOVE_ALL;
                    break;

                case 1:
                    score = FIFTEEN_ALL;
                    break;
                case 2:
                    score = THIRTY_ALL;
                    break;
                case 3:
                    score = FORTY_ALL;
                    break;
                default:
                    score = DEUCE;
                    break;

            }
        }
        else if (m_score1>=4 || m_score2>=4)
        {
            int minusResult = m_score1-m_score2;
            boolean isResultEqual1 = minusResult == 1;
            if (isResultEqual1) score = ADVANTAGE_PLAYER_1;
            else {
                boolean isResultEqualMinus1 = minusResult == -1;
                if (isResultEqualMinus1) score = ADVANTAGE_PLAYER_2;
                else {
                    boolean isResultLargerOrEqual2 = minusResult >= 2;
                    if (isResultLargerOrEqual2) score = WIN_FOR_PLAYER_1;
                    else score = WIN_FOR_PLAYER_2;
                }
            }
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = m_score1;
                else { score+= MINUS; tempScore = m_score2;}
                switch(tempScore)
                {
                    case 0:
                        score+= LOVE;
                        break;
                    case 1:
                        score+= FIFTEEN;
                        break;
                    case 2:
                        score+= THIRTY;
                        break;
                    case 3:
                        score+= FORTY;
                        break;
                }
            }
        }
        return score;
    }
}
