package racingcar;
import java.util.ArrayList;
import java.util.List;

public class Ranking extends Application{
    public void rank(){
        int rank2 = 0;
        for (int k = 0; super.score.size() - 1 > k; k++) {
            rank2 = Math.max(super.score.get(k),super.score.get(k + 1));
            if (rank2>super.rank1){
                super.rank1=rank2;
            }
        }

        if (super.carNames.size() == 1) {
            super.rank1 = super.score.get(0);
        }
    }

    public void PrintRank(){

        List<String> winner = new ArrayList<>();
        for (int k = 0; super.score.size()> k; k++) {
            if (super.rank1== super.score.get(k)){
                winner.add(super.carNames.get(k));
            }
        }
        System.out.print("최종 우승자 : " + String.join(" ,", winner));

    }
}
