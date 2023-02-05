package com.powernode.bank.pojo;

/**银行账户
 * @Author iyeee
 * @Date 2023/2/6 1:12
 * @Version 1.0.1
 */
public class Account {
    private String actno;
    private Double balance;

    public Account(String actno, Double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "actno='" + actno + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
