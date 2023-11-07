import java.util.Stack;

public class JavaStack {

    public static void main(String[] args) {
        Stack<String> stackOfCards = new Stack<>();
        
        stackOfCards.push("jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println(stackOfCards.isEmpty());
        System.out.println(stackOfCards.search("jack"));
        System.out.println(stackOfCards);
        System.out.println(stackOfCards.pop());
        System.out.println(stackOfCards);

        stackOfCards.forEach(card -> {
            System.out.println(card);
        });
    }   
}