import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class TEST {
    public static void main(String[] args) {
//        ArrayList test = new ArrayList(Integer.MAX_VALUE-1);
//        test.add((Integer.MAX_VALUE+1),"new");

        String [] arrEmp = {"Amol","Chandresh","Devraj","Manoj","Namita","Shailendra","Sachin","Shilpi","Shubham","Spruha","Tejal","Vishesh","Ashi","Krishna","Priyanshu"};
        List<String> listEmp = Arrays.asList(arrEmp);
        Stack<String> stackEmp = new Stack<>();
        stackEmp.addAll(listEmp);
        Map<String,List<String>> stringListMap = new HashMap<>();
        for (String emp : arrEmp) {
            List tempEmp = new LinkedList();
            boolean flag = false;
            while (tempEmp.size() < 4) {
                if(!stackEmp.isEmpty()) {
                    if (!stackEmp.peek().equals(emp)) {
                        tempEmp.add(stackEmp.pop());
                    } else {
                        flag = true;
                        stackEmp.pop();
                    }
                }else {
                    stackEmp.addAll(listEmp);
                }
            }
            if(flag){
                stackEmp.push(emp);
            }
            stringListMap.put(emp,tempEmp);
        }
        for (Map.Entry<String,List<String>> entry : stringListMap.entrySet()){
            System.out.println( entry.getKey() +" : "+entry.getValue());
        }
    }
}
