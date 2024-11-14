public class Game {
    private boolean isRunning;
    int a = 0;

    public Game(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public boolean isRunning() {
        return isRunning;
    }
    //Сеттр
    public void setRunning(boolean running) {
        isRunning = running;
    }
    //Метод который выводит что игра запущенна
    public void start() {
        isRunning = true;
        System.out.println("Игра запущена!");
//Цикл while который будет работать пока переменнная равно true
        while (isRunning) {
//Пробуем запустить блок кода и если в нем ошибка он напишет нам в консоль и не сломает программу
            try {
                Thread.sleep(1000);
                System.out.println("Игра запущена (каждую секунду)...");
                if (a<5){
                    a++;
                }else{
                    stop();
                }
            } catch (InterruptedException e) {
                System.out.println("Ошибка в стартовом методе: " + e.getMessage());
            }
        }
    }
    //Метод оставновки вывода о том что игра запущенна
    public void stop() {
        isRunning = false;
        System.out.println("Игра остановлена!");
    }
    //Основной метод который запускает метод старт
    public static void main(String[] args) {
        Game game = new Game(false);
        game.start();
    }
}
