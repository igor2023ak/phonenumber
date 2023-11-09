public class Main {
    public static void main(String[] args) {
        String[] numbers = {" +37063500697" , "8(635)00697" , "370-63500697" ,"370.635.00697" ,"#370.635.00697" , "00370 63500697" , "63500697","+","asfsdfsfd","+3706","6666666666666666","66666666",":)","86*5465879","86hh3500ww685"};
        for (int i = 0; i < numbers.length; i++) {
        validatePhoNo(numbers[i]);

        }
    }
    public static void validatePhoNo(String phoNo) {
        String forbidenSymbols = phoNo.replaceAll("[^0-9 \\+\\-().#]","");
        if(forbidenSymbols.length() != phoNo.length()){
            System.out.println("'" + phoNo + "' blogas tel nr");
            return;
        }

        String result = phoNo
               // .replaceAll("[^\\(?(\\d{3}\\)?[ +]?(\\d{3})[- ]?(\\d{4})$]", "")
                       // .replaceAll("[^\\d]","")
                        .replaceAll("[^0-9]","");
        //System.out.print(result + " ");

        if (result.length() < 8) {
            System.out.println("'" + phoNo + "' blogas tel nr");
            return;
        }
        System.out.print("Number ");

        if (result.substring(0,1).equals("6") ){
            if(result.length() == 8) {
                System.out.println(result);
            }else{
                System.out.println("'" + phoNo + "' blogas tel nr");
            }
        }
        if (result.substring(0,2).equals("86") ){
            if(result.length() == 9) {
                System.out.println(result);
            }else{
                System.out.println("'" + phoNo + "' blogas tel nr");
            }
        }

        if (result.substring(0,4).equals("3706") ){
            if(result.length() == 11) {
                System.out.println(result);
            }else{
                System.out.println("'" + phoNo + "' blogas tel nr");
            }
        }

        if (result.substring(0,6).equals("003706") ){
            if(result.length() == 13) {
                System.out.println(result);
            }else{
                System.out.println("'" + phoNo + "' blogas tel nr");
            }
        }





    }
}