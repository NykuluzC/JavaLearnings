public class ifElse {
    public static void main(String[] args){
        boolean isDone = false;
        if(!isDone){
            System.out.println("It's not done yet");
        }
        boolean isNotDone = (isDone ? false : true);
        System.out.println(isNotDone);
    }
}
