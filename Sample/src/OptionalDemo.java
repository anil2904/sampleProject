import java.util.Optional;  

public class OptionalDemo{   
    public static void main(String[] args) {   
        String[] words = new String[1]; 
        words[0] = "Anil";
        Optional<String> checkNull =  
                      Optional.ofNullable(words[0]);   
        if (checkNull.isPresent()) {   
            String word = words[1].toLowerCase();   
            System.out.print(word);   
        } else  
            System.out.println("word is null");   
    }   
}   
