package racingcar;
import static camp.nextstep.edu.missionutils.Console.readLine;


public class GameSystem extends Application {
    public void input(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String userInput = readLine().trim();

        for (String name : userInput.split(",")) {
            super.carNames.add(name.trim());
        }

        for (String Name1 : super.carNames) {
            if (Name1.length() > 5) {
                throw new IllegalArgumentException();
            }
        }

        System.out.println("시도할 회수는 몇회인가요?");
        String count1 = readLine();
        super.count = Integer.parseInt(count1);

    }

    public void ready(){
        System.out.println("실행 결과");

        for (String Name1 : super.carNames) {
            super.score.add(0);
        }
    }


}
