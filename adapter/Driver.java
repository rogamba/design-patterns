/**
 * Adaptor to make a turkey's actions be invoked have the same 
 * actions and behavioue as a duck (TuerkeyAdapter).
 * Basically maps the behaviour of turkey with the bahaviour of
 * Duck.
 *      Turkey          Duck
 *      gobble()   ->   quack()
 *      jump()     ->   fly()
 */
public class Driver {
    public static void main(String[] args){
        // Declare the turkey
        Turkey turkey = new NormalTurkey();
        // Adapt the turkey to the duck
        Duck adaptedTurkey = new TurkeyAdapter(turkey);
        // Perform duck actions on the adapted turkey
        adaptedTurkey.fly();
        adaptedTurkey.quack();
    }
}