public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void fly(){
        for(int i=0; i<5; i++){
            this.turkey.jump();
        }
    }

    public void quack(){
        this.turkey.gobble();
    }
}