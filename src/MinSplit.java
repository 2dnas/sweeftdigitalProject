public class MinSplit {
    static int COIN_ONE = 1;
    static int COIN_FIVE = 5;
    static int COIN_TEN = 10;
    static int COIN_TWENTY = 20;
    static int COIN_FIFTY = 50;

    int minSplit(int amount) {
        //coinCount გვიჩვენებს რამდენი მონეტა იქნება გამოყენებული
        int coinCount = 0;
        if (amount == 0) {
            return 0;
        }
        //ჩვენ გვაინტერესებს მონეტების მინიმალური რაოდენობა ამიტომ პირველ რიგში ამოწმებს არის თუ არა amount
        //უფრო მეტი ვიდრე 50 და აკლებს amounts და ასე მიყვება უფრო დაბალი მონეტებისკენ სანამ არ გახდება amount ნული
        while (amount > 0) {
            if (amount >= COIN_FIFTY) {
                amount -= COIN_FIFTY;
                coinCount++;
            } else if (amount >= COIN_TWENTY) {
                amount -= COIN_TWENTY;
                coinCount++;
            } else if (amount >= COIN_TEN) {
                amount -= COIN_TEN;
                coinCount++;
            } else if (amount >= COIN_FIVE) {
                amount -= COIN_FIVE;
                coinCount++;
            } else if (amount >= COIN_ONE) {
                amount -= COIN_ONE;
                coinCount++;
            }
        }
        return coinCount;
    }
}
