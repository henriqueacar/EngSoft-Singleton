public final class Soma {

    private Soma(){};
    private static Soma instance = new Soma();

    public static Soma getInstance(){
        return instance;
    }

    public Integer somaDoisNumerosInteiros(Integer num1, Integer num2){
        return num1+num2;
    }


}
