package ex;

public class Bank extends Thread
{
    static Account obj = new Account();
    public Bank() { }
    public Bank(String name) { super(name); }
    public void run()
    {
        while(true)
        {
            // 멀티 스레드 
            synchronized(obj)
            {
                int money = (int)(Math.random() * 3 + 1) *100;
                if(obj.balance >= money)
                {
                    System.out.println(getName() + " : 원본의 balance : " + obj.balance);
                    System.out.println(getName() + ": 찾는 금액 : " + money);
                    obj.withdraw(money);
                    System.out.println(getName() + " : 수정된 balance : " + obj.balance);
                }else
                {
                    System.out.println("잔액 부족");
                    break;
                }
            }
        }
    }
}

