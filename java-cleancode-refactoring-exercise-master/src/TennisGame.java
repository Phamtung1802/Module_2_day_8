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

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        int tempScore=0;

        if (m_score1==m_score2)
        {
            switch (m_score1)
            {
                case 0:
                    announceScore(LOVE_ALL);
                    break;
                case 1:
                    announceScore(FIFTEEN_ALL);
                    break;
                case 2:
                    announceScore(THIRTY_ALL);
                    break;
                case 3:
                    announceScore(FORTY_ALL);
                    break;
                default:
                    announceScore(DEUCE);
                    break;

            }
        }
        else {
            boolean isM_Score1_Over4 = m_score1 >= 4;
            boolean is_M_Score2_Over4 = m_score2 >= 4;
            if (isM_Score1_Over4 || is_M_Score2_Over4)
            {
                int minusResult = getMinusResult(m_score1, m_score2);
                boolean isResultEquals1 = minusResult == 1;
                if (isResultEquals1) {
                    announceScore(ADVANTAGE_PLAYER_1);
                } else {
                    boolean isResultEqualsMinus1 = minusResult == -1;
                    if (isResultEqualsMinus1) announceScore(ADVANTAGE_PLAYER_2);
                    else {
                        boolean isResultLargerOrEquals2 = minusResult >= 2;
                        if (isResultLargerOrEquals2) announceScore(WIN_FOR_PLAYER_1);
                        else announceScore(WIN_FOR_PLAYER_2);
                    }
                }
            }
            else
            {
                for (int i=1; i<3; i++)
                {
                    if (i==1) tempScore = m_score1;
                    else {
                        addStringToScore(score, "-");
                        tempScore = m_score2;}
                    switch(tempScore)
                    {
                        case 0:
                            addStringToScore(score, "Love");
                            break;
                        case 1:
                            addStringToScore(score, "Fifteen");
                            break;
                        case 2:
                            addStringToScore(score, "Thirty");
                            break;
                        case 3:
                            addStringToScore(score, "Forty");
                            break;
                    }
                }
            }
        }
        return score;
    }

    private static String addStringToScore(String score, String s) {
        score += s;
        return score;
    }

    private static int getMinusResult(int m_score1, int m_score2) {
        return m_score1-m_score2;
    }

    private static String announceScore(String Announcement) {
        String score;
        score = Announcement;
        return score;
    }
}
