package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car extends Application{

    public void race(){
        int CountRound = 0;

        for (int i = 0; i < super.count * super.carNames.size(); i++) {

            if (CountRound == super.carNames.size()) {
                CountRound = 0;
            }


            int randomInt = Randoms.pickNumberInRange(0, 9);
            if (randomInt > 3) {
                super.score.set(CountRound, super.score.get(CountRound) + 1);
            }
            CountRound = CountRound + 1;

            String line;
            for (int k = 0; super.score.size() > k; k++) {
                line = "-".repeat(super.score.get(k));
                System.out.println(super.carNames.get(k) + " : " + line);
            }
            System.out.println("");

        }
    }

}
