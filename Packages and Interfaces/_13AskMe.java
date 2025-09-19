import java.util.Random;

interface SharedConstants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}

class Question implements SharedConstants {
    Random rand = new Random();
    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if(prob<30)           // 30%
            return NO;
        else if (prob<60)    // 30%
            return YES;
        else if(prob<75)     // 15%
            return MAYBE;
        else if (prob<98)    // 13%
            return SOON;
        else                 // 2%
            return NEVER;
    }
}
class _13AskMe implements SharedConstants {
    static void answer(int result) {
        switch(result) {
            case NO:
                System.out.println("NO");
                break;
            case YES:
                System.out.println("YES");
                break;
            case MAYBE:
                System.out.println("MAYBE");
                break;
            case SOON: 
                System.out.println("SOON");
                break;
            case NEVER:
                System.out.println("NEVER");
                break;
        }
    }
    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
