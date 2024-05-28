public class ContractMainClass {

    public static void main(String[] args) {
        //Contract_rule cc = new Contract_Implemetation();
        //cc.rule1();

       // if the Contract_Implemetation thi class is not there how we write

//        Contract_rule cc = new Contract_rule() {
//            @Override
//            public void rule1() {
//
//            }
//        };
//            cc.rule1();
        //Contract is functional interface  , so we can write like this

                Contract_rule cc = () -> System.out.println("haiiii");
                cc.rule1();
    }
}
