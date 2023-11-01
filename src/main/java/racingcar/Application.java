package racingcar;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        String nameInput = inputView.readCarNames();
        RacingCars racingCars = new RacingCars(nameInput);

        int count = inputView.readCount();
        RacingGame racingGame = new RacingGame(racingCars);
        System.out.println("실행 결과");
        while (count > 0) {
            racingGame.play();
            outputView.printResult(racingCars);
            count--;
        }

        outputView.printWinners(racingCars.findWinners());
    }
}
