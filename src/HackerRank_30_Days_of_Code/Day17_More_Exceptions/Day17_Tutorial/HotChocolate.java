package HackerRank_30_Days_of_Code.Day17_More_Exceptions.Day17_Tutorial;

public class HotChocolate {
    public static final double tooHot = 185;//F not C
    public static final double tooCold = 160;//F not C

    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException {
        if (cocoaTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold) {
            throw new TooColdException();
        }
    }

    public static void main(String[] args) {
        double currentCocoaTemp = 155;
        boolean wrongTemp = true;
        while (wrongTemp) {
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("Mmm... It's so good!");
                wrongTemp = false;
            } catch (TooHotException e1) {
                System.out.println("THAT'S TOO HOT! I will wait...");
                currentCocoaTemp -= 15;
            } catch (TooColdException e2) {
                System.out.println("THAT'S SO COLD! It's like the arctic. Make it hoter please");
                currentCocoaTemp += 30;
            }
        }
        System.out.println("And it's gone.");
    }
}