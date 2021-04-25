public class IsPalindrome {

    boolean isPalindrome(String text) {
        int stringLength = text.length();

        //ამოწმებს პირველი და ბოლო ასო თუ არის ერთი და იგივე შემდგომ მეორე და ბოლოს წინა და ასე შემდეგ
        //თუ რომელიმე არ დაემთხვა შევა if ის ტანში და დააბრუნებს false
        for (int i = 0; i < (stringLength / 2); ++i) {
            if (text.charAt(i) != text.charAt(stringLength - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
