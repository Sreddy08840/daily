class bank{
    private int AccountNumber;
    private int AccountPassword;
    void setAccountNumber(int AccountNumber){
        this.AccountNumber=AccountNumber;
    }
    void setAccountPassword(int AccountPassword){
        this.AccountPassword=AccountPassword;
    }
    void getAccountNumber(){
        System.out.println(AccountNumber);
    }
    void getAccountPassword(){
        System.out.println(AccountPassword);
    }


}
class example1{
    public static void main(String[] args){
      bank b=new bank();
      b.setAccountNumber(12345);
      b.setAccountPassword(54321);
      b.getAccountNumber();
      b.getAccountPassword();
    }
    
}