package fh.campus02;

public class Maybe<T> {
    private T data;
    private int status;
//    generic Version der Klasse

    public Maybe(T data, int status) {
        this.data = data;
        this.status = status;
    }

    public void print(){
        switch (status){
            case 1:
                System.out.println("Zugriff gewährt: "+data);
                break;
            case 2:
                System.out.println("Geht dich nichts an!");
                break;
            case 3:
                System.out.println("Daten nicht erfasst!");
                break;
            default:
                System.out.println("please choose Status between 1 and 3 ");
                break;
        }
    }
}
