package controller;

import model.Living;

    import java.util.ArrayList;
    import java.util.List;

public class DataProces {
    private List<Living>list;

    public DataProces(){
        this.list=new ArrayList<>();
    }
    public List<Living>getList(){
        return list;
    }
    public int addSpend(Living l){
        this.list.add(l);
        return this.list.size();
    }
    public int count(){
        return this.list.size();
    }
    public Living getLiving(int n){
        if (n<0|| n>=count()){
            return null;
        }
        return this.list.get(n);
    }
    public boolean remote(String expenese){
        int index=-1;
        for (int i = 0, n =count(); i <n; i++) {
            if (this.list.get(i).getExpenses().equals(expenese)){
                index=i;
                break;
            }
            
        }if (index!=-1){
            this.list.remove(index);
            return true;
        }
        return false;
    }
}
