import java.util.LinkedList;

public class IPCounter{
    
    public int countIP(String [] list){
        
        int counter = 0;
        
        for(int i=0; i<list.length; i++)
            
            if(abba(list[i]))    counter++;
            
        return counter;
        
    }
    
    private boolean abba(String ip){
        
        boolean result = false;
        boolean isBrackets = false;
        LinkedList<Character> signs = new LinkedList<>();
        int counter = 0;

        for(int i=0; i<ip.length(); i++){
            
            char sign =  ip.charAt(i);
            
            if(sign == '[' || sign == ']'){
                
                counter = 0;
                signs = new LinkedList<>();
                isBrackets = ! isBrackets;
                continue; // opcional
                
            }else if(counter<4){
                
                signs.add(sign);
                counter++;

            }else{
                
                signs.remove();
                signs.add(sign);
            }

            if(counter == 4 && findABBA(signs))  
                if(isBrackets) return false;
                else           result =true;       
        }
        return result;
    }
    
    private boolean findABBA(LinkedList<Character> word){
        
        if(word.get(0) == word.get(1)) return false;
        
        if(word.get(0) == word.get(3)
        && word.get(1) == word.get(2)) return true;
        
        return false;
    }
}