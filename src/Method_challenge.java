public class Method_challenge {
    public static void main(String[] args) {
        Display_High_Score_position("Bob", Calculate_high_Score_position(1500));
        Display_High_Score_position("Steve", Calculate_high_Score_position(1000));
        Display_High_Score_position("James", Calculate_high_Score_position(500));
        Display_High_Score_position("Darude", Calculate_high_Score_position(100));
        Display_High_Score_position("Stromae", Calculate_high_Score_position(50));
    }

    public static int Calculate_high_Score_position(int player_score){
        if(player_score >= 1000){
            return 1;
        }
        else if(player_score >= 500){
            return 2;
        }
        else if(player_score >= 100){
            return 3;
        }
        else{
            return 4;
        }
    }

    public static void Display_High_Score_position(String players_name, int player_position_high_score ) {
        System.out.println(players_name + " managed to get into position "
                + player_position_high_score + " on the high score list!");
    }
}
