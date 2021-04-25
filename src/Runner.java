public class Runner {
    public static void main(String[] args) {

        System.out.println(new IsPalindrome().isPalindrome("anna"));
        System.out.println(new MinSplit().minSplit(19));
        System.out.println(new NotContains().notContains(new int[]{ 2, 3, 4, 5, 6,4,2,3}));
        System.out.println(new IsProperly().isProperly("(()())"));
        System.out.println(new CountVariants().countVariants(2));
        MyDataStructure<Integer> myDataStructure = new MyDataStructure<>();
        myDataStructure.addElement(2);
        myDataStructure.addElement(5);
        myDataStructure.addElement(6);
        myDataStructure.addElement(12);
        myDataStructure.addElement(51);
        myDataStructure.removeFirst();
        myDataStructure.removeFirst();
        myDataStructure.display();
    }
}
