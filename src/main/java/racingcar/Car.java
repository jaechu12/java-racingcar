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
        }
    }


}
