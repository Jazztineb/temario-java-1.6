import java.util.HashMap;
import java.util.Map;

/*
    Se muestra el usp de tipo genericos que no cambian el comportamiento.
        Lineas comentadas valores antiguos reemplazados por genericos.
 */

class AccountManager {
    //private Map accountTotals = new HashMap();
    private Map<String, Integer> accountTotals = new HashMap<String, Integer>();
    private int retirementFund;

    public int getBalance(String accountName){
        Integer total = (Integer) accountTotals.get(accountName);
        if (total == null)
            //total = Integer.valueOf(0);
            total = 0;
        //return total.intValue();
        return total;
    }

    public void setBalance(String accountName, int amount){
        //accountTotals.put(accountName, Integer.valueOf(amount));
        accountTotals.put(accountName, amount);
    }
}
